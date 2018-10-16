package com.threecube.test.esperEngine.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class SenderStatUpdateListener implements UpdateListener {
	
	private String listenerType;
	
	public SenderStatUpdateListener(String listenerType) {
		
		this.listenerType = listenerType;
	}
	
	@Override
	public void update(EventBean[] newEvents, EventBean[] oldEvents) {
		
		if(newEvents != null) {
			
			System.out.println(String.format("SenderStatUpdateListener %s is touched off ....,", this.listenerType));
			for(EventBean event : newEvents) {
				
				System.out.println(String.format("sender is %s, msg count is %s", event.get("sender"), event.get("count")));
			}
			System.out.println(String.format("SenderStatUpdateListener %s is end"));
		}
	}

}
