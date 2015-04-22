package com.clay_rock.hrims.dao.events.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.clay_rock.hrims.dao.crud.impl.DAOImpl;
import com.clay_rock.hrims.dao.events.IEventsDao;
import com.clay_rock.hrims.model.events.Events;

@Repository("eventsDao")
public class EventsDaoImpl extends DAOImpl<Events> implements IEventsDao{

	  public EventsDaoImpl() {
		super(Events.class);
	  }

	  @Override
	  public List<Events> getAllEvents() {
			try{
				List<Events> events = findAll();
				return events;
			} catch (Exception e) {
				System.out.println("Error while getting leave "+e.getMessage());
				return new ArrayList<Events>();
			}
	  }
}
