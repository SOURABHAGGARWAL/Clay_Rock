package com.clay_rock.hrims.business.events.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clay_rock.hrims.business.events.IEventsBusiness;
import com.clay_rock.hrims.dao.events.IEventsDao;
import com.clay_rock.hrims.model.events.Events;

@Service("eventsBusiness")
public class EventsBusinessImpl implements IEventsBusiness {

	@Autowired
	private IEventsDao eventsDao;
	
	public List<Events> getAllEvents(){
		return eventsDao.getAllEvents();
	}

}
