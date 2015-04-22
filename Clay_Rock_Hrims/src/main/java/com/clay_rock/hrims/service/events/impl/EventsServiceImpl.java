package com.clay_rock.hrims.service.events.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clay_rock.hrims.business.events.IEventsBusiness;
import com.clay_rock.hrims.model.events.Events;
import com.clay_rock.hrims.service.events.IEventsService;

@Service("eventsService")
public class EventsServiceImpl implements IEventsService {

	@Autowired
	private IEventsBusiness eventsBusiness;
	
	public List<Events> getAllEvents(){
		return eventsBusiness.getAllEvents();
	}

}
