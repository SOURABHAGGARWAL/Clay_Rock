package com.clay_rock.hrims.dao.events;

import java.util.List;

import com.clay_rock.hrims.dao.crud.IDAO;
import com.clay_rock.hrims.model.events.Events;

public interface IEventsDao extends IDAO<Events>{
	
	public List<Events> getAllEvents();
	
}
