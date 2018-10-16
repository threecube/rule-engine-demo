/**
 * 
 */
package com.threecube.test.esperEngine.service;

import org.apache.commons.lang3.StringUtils;

import com.espertech.esper.client.EPAdministrator;
import com.espertech.esper.client.EPRuntime;
import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;
import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.collection.Pair;

/**
 * @author dingwenbin
 *
 */
public class EsperComponent {

	private static EPServiceProvider defaultProvider = null;    
	
	private static EPAdministrator epAdministrator = null;
    
	private static EPRuntime epRuntime = null;
		
	static {
		
		defaultProvider = EPServiceProviderManager.getDefaultProvider();
		epAdministrator = defaultProvider.getEPAdministrator();
		epRuntime = defaultProvider.getEPRuntime();
	}
	
	
	public static void createEpl(Pair<String, UpdateListener>... eplListeners) {
		
		for(Pair<String, UpdateListener> eplListener : eplListeners) {
			
			if(StringUtils.isNotBlank(eplListener.getFirst())) {
				
				System.out.println("create EPL " + eplListener.getFirst());
				EPStatement epStatement = epAdministrator.createEPL(eplListener.getFirst());
				
				if(eplListener.getSecond() != null) {
					
					System.out.println("Bind Listener ");
					epStatement.addListener(eplListener.getSecond());
				}
			}
			
		}
	}
	
	public static void sendEvent(Object event) {
		
		if(event != null) {
			
			epRuntime.sendEvent(event);
		}
	}
}
