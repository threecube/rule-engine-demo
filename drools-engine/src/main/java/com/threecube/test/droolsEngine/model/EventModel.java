package com.threecube.test.droolsEngine.model;

import java.util.Date;

import org.kie.api.definition.type.Duration;
import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;
import org.kie.api.definition.type.Timestamp;

@Role(Role.Type.EVENT)
@Duration("duration")
@Timestamp("happenTime")
@Expires("1h20m")
public class EventModel {

	private String context;
	
	private Date happenTime;
	
    private Long duration;

	/**
	 * @return the context
	 */
	public String getContext() {
		return context;
	}

	/**
	 * @param context the context to set
	 */
	public void setContext(String context) {
		this.context = context;
	}

	/**
	 * @return the happenTime
	 */
	public Date getHappenTime() {
		return happenTime;
	}

	/**
	 * @param happenTime the happenTime to set
	 */
	public void setHappenTime(Date happenTime) {
		this.happenTime = happenTime;
	}

	/**
	 * @return the duration
	 */
	public Long getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Long duration) {
		this.duration = duration;
	} 
    
    
}
