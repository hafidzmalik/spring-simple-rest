package com.somecompany.usermgnt.dto;

import java.io.Serializable;

public class FeaturePostRequest implements Serializable {

	private static final long serialVersionUID = 5771994477088702427L;
	
	private String featureName;
	private String email;
	private boolean enable;
	
	public String getFeatureName() {
		return featureName;
	}
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	
}
