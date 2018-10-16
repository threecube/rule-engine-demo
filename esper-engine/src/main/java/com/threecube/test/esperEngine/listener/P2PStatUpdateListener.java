package com.threecube.test.esperEngine.listener;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class P2PStatUpdateListener implements UpdateListener {
	
	private String listenerType;
	
	public P2PStatUpdateListener(String listenerType) {
		
		this.listenerType = listenerType;
	}
	
	@Override
	public void update(EventBean[] newEvents, EventBean[] oldEvents) {
		
		if(newEvents != null) {
			
			System.out.println(String.format("P2PStatUpdateListener %s is touched off ....,", this.listenerType));
			for(EventBean event : newEvents) {
				
				System.out.println(String.format("sender is %s, accepter is %s msg count is %s", 
						event.get("sender"), event.get("accepter"), event.get("count")));
			}
			System.out.println(String.format("P2PStatUpdateListener %s is end"));
		}
	}

}
