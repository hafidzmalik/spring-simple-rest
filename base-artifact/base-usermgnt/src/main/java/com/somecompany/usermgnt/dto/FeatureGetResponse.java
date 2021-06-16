package com.somecompany.usermgnt.dto;

import java.io.Serializable;

public class FeatureGetResponse implements Serializable{
	
	private static final long serialVersionUID = -5656781949130761773L;
	private boolean canAccess;
	
	public boolean isCanAccess() {
		return canAccess;
	}
	
	public void setCanAccess(boolean canAccess) {
		this.canAccess = canAccess;
	} 
}
