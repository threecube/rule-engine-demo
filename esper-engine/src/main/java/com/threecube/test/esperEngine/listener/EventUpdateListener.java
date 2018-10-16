package com.threecube.test.esperEngine.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class EventUpdateListener implements UpdateListener {
	
	private String listenerType;
	
	public EventUpdateListener(String listenerType) {
		
		this.listenerType = listenerType;
	}
	
	@Override
	public void update(EventBean[] newEvents, EventBean[] oldEvents) {
		
		if(newEvents != null) {
			
			System.out.println(String.format("EventUpdateListener %s is touched off ....,", this.listenerType));
			for(EventBean event : newEvents) {
				
				System.out.println(String.format("sender is %s, accepter is %s", event.get("sender"), event.get("accepter")));
			}
			System.out.println(String.format("EventUpdateListener %s is end"));
		}
	}

}
