package com.threecube.test.esperEngine.test;

import java.util.List;

import org.junit.Test;

import com.espertech.esper.client.UpdateListener;
import com.espertech.esper.collection.Pair;
import com.threecube.test.esperEngine.listener.EventUpdateListener;
import com.threecube.test.esperEngine.listener.OldEventStatUpdateListener;
import com.threecube.test.esperEngine.listener.P2PStatUpdateListener;
import com.threecube.test.esperEngine.listener.SenderStatUpdateListener;
import com.threecube.test.esperEngine.model.ChatMessageModel;
import com.threecube.test.esperEngine.service.EsperComponent;
import com.threecube.test.esperEngine.util.EplCommonUtil;

public class EsperWindowTest extends BaseTest{

	//@Test
	public void testTimeBatchWin() {
		
		Pair<String, UpdateListener> eplListener = new Pair(EplCommonUtil.timeBatchEPL(5), 
				new SenderStatUpdateListener("5s_sender_count"));
		
		EsperComponent.createEpl(eplListener);
		
		sendEventLoop(100);
	}
	
	//@Test
	public void testTimeBatchWin1() {
		
		Pair<String, UpdateListener> eplListener = new Pair(EplCommonUtil.contextEPL(), null);
		
		Pair<String, UpdateListener> eplListener1 = new Pair(EplCommonUtil.timeBatchContextEPL(10), 
				new P2PStatUpdateListener("30s_sender_accepter_count"));
		
		EsperComponent.createEpl(eplListener, eplListener1);
		
		sendEventLoop(50);
	}
	
	//@Test
	public void testTimeAccu() {
				
		Pair<String, UpdateListener> eplListener = new Pair("select rstream * from " + ChatMessageModel.class.getName() + ".win:time_accum(5 sec)", 
				new OldEventStatUpdateListener("5s_sender_count_accu"));
		
		EsperComponent.createEpl(eplListener);
		
		sendEventLoopSleep(50, 6000, 10000);
	}
	
	
	@Test
	public void testKeepAll() {
		
		List<String> eplList = EplCommonUtil.keepAllEpl();
		
		Pair<String, UpdateListener> creatWinEPL = new Pair(eplList.get(0), null);
		Pair<String, UpdateListener> insertEPL = new Pair(eplList.get(1), null);
		Pair<String, UpdateListener> clearEPL = new Pair(eplList.get(2), new EventUpdateListener("clear_keep_all"));
		
		EsperComponent.createEpl(creatWinEPL, insertEPL, clearEPL);
		
		sendEventForTime(100, 20);
		System.out.println("Start to send clean event");
		sendCleanSignal();
	}
}
