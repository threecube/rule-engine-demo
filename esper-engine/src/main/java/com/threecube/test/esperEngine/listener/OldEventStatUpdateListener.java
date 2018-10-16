package com.threecube.test.esperEngine.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class OldEventStatUpdateListener implements UpdateListener {
	
	private String listenerType;
	
	public OldEventStatUpdateListener(String listenerType) {
		
		this.listenerType = listenerType;
	}
	
	@Override
	public void update(EventBean[] newEvents, EventBean[] oldEvents) {
		
		if(newEvents != null) {
			
			System.out.println(String.format("OldEventStatUpdateListener %s is touched off ....,", this.listenerType));
			for(EventBean event : newEvents) {
				
				System.out.println(String.format("sender is %s, msg count is new", event.get("sender")));
			}
			System.out.println(String.format("OldEventStatUpdateListener %s is end"));
		}

		if(oldEvents != null) {
			
			System.out.println(String.format("OldEventStatUpdateListener %s is touched off ....,", this.listenerType));
			for(EventBean event : oldEvents) {
				
				System.out.println(String.format("sender is %s, msg count is olds", event.get("sender")));
			}
			System.out.println(String.format("OldEventStatUpdateListener %s is end"));
		}
	}

}
