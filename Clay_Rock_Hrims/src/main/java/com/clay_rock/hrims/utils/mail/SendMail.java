package com.clay_rock.hrims.utils.mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	public static final boolean sendMail(String to, String subject, String body) {

		final String username = "clay_rockhackathon@gmail.com";
		final String password = "4hackathon#";

		// SUBSTITUTE YOUR EMAIL ADDRESSES HERE!!!
		// String to = "1990sourabhaggarwal@gmail.com";
		String from = "clay_rockhackathon@gmail.com";
		// SUBSTITUTE YOUR ISP'S MAIL SERVER HERE!!!
		String host = "smtp.gmail.com";

		// Create properties, get Session
		Properties props = new Properties();
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.auth", "true");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication(username, password);
					}
				});

		try {
			Message msg = new MimeMessage(session);

			msg.setFrom(new InternetAddress(from));
			InternetAddress[] address = { new InternetAddress(to) };
			msg.setRecipients(Message.RecipientType.TO, address);
			msg.setSubject(subject);
			msg.setSentDate(new Date());

			msg.setText(body);

			Transport.send(msg);
			
			return true;
		} catch (MessagingException mex) {
			mex.printStackTrace();
			return false;
		}
	}

}
