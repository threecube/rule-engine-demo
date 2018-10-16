/**
 * 
 */
package com.threecube.test.esperEngine.test;

import java.util.UUID;

import com.threecube.test.esperEngine.model.ChatMessageModel;
import com.threecube.test.esperEngine.model.ClearModel;
import com.threecube.test.esperEngine.service.EsperComponent;

/**
 * @author dingwenbin
 *
 */
public class BaseTest {
	
	private static int number = 1;
	
	protected void sendEvent() {
		
	}
	
	protected void sendEventLoop(int interval) {
		
		while(!Thread.interrupted()) {
			
			try {
				System.out.println("send event");
				EsperComponent.sendEvent(buildEvent());
				
				if(interval > 0) {
					Thread.sleep(interval);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	protected void sendEventForTime(int interval, int times) {
		
		int i = 0;
		while(i++ < times) {
			try {
				System.out.println("send event");
				EsperComponent.sendEvent(buildEvent());
				
				if(interval > 0) {
					Thread.sleep(interval);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected void sendCleanSignal() {
		
		ClearModel event = new ClearModel();
		event.setType(1);
		EsperComponent.sendEvent(event);
		
	}

	protected void sendEventLoopSleep(int interval, int loopTime, int sleepTime) {
		
		long startTime = System.currentTimeMillis();
		
		while(!Thread.interrupted()) {
			
			try {
				System.out.println("send event");
				EsperComponent.sendEvent(buildEvent());
				
				long currentTime = System.currentTimeMillis();
				if((currentTime - startTime) > loopTime) {
					Thread.sleep(sleepTime);
					startTime = System.currentTimeMillis();
				} else {
					if(interval > 0) {
						Thread.sleep(interval);
					}
				}
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	private ChatMessageModel buildEvent() {
		
		ChatMessageModel event = new ChatMessageModel();
		event.setSender("sender" + number++ % 20);
		event.setId(UUID.randomUUID().toString());
		event.setAccepter("accepter" + number++ % 30);
		
		return event;
	}
}
