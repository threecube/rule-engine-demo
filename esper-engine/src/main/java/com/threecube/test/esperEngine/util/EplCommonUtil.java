package com.threecube.test.esperEngine.util;

import java.util.Arrays;
import java.util.List;

import com.threecube.test.esperEngine.model.ChatMessageModel;
import com.threecube.test.esperEngine.model.ClearModel;

public class EplCommonUtil {
	
	public static String contextEPL() {
		
		return String.format("create context sender_accepter_context partition by sender, accepter from %s", ChatMessageModel.class.getName());
	}
	
	public static String lengthEpl(int length) {
		
		return String.format("select sender, count(1) as count from %s.win:length(%s) group by sender", 
				ChatMessageModel.class.getName(), length);
	}
	
	public static String timeBatchEPL(int interval) {
		
		return String.format("select sender, count(1) as count from %s.win:time_batch(%s sec) group by sender", 
				ChatMessageModel.class.getName(), interval);
	}
	
	public static String timeBatchContextEPL(int interval) {
		
		return String.format("context sender_accepter_context select sender, accepter, count(1) as count from %s.win:time_batch(%s sec)", 
				ChatMessageModel.class.getName(), interval);
	}
	
	public static String timeAccuEpl(int interval) {
		
		return String.format("select rstream sender, count(1) as count from %s.win:time_accum(%s sec) group by sender", 
				ChatMessageModel.class.getName(), interval);
	}
	
	public static List<String> keepAllEpl() {
		
		
		String winCreateEPL = String.format("create window KeepAllWin.win:keepall() select * from %s", 
				ChatMessageModel.class.getName());
		String insertEPL = String.format("insert into KeepAllWin select * from %s", ChatMessageModel.class.getName());
		String clearEPL = String.format("on %s(type=1) delete from KeepAllWin where KeepAllWin.sender = 'sender1'", ClearModel.class.getName());
		
		return Arrays.asList(winCreateEPL, insertEPL, clearEPL);
	}
}

