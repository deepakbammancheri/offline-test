package com.apisel.qa.api.mapper;

/**
 * Json mapper class
 *
 */
public class Reddit {
	private String campaign;
	private String launch;
	private String media = null;
	private String recovery;

	// Getter Methods

	public String getCampaign() {
		return campaign;
	}

	public String getLaunch() {
		return launch;
	}

	public String getMedia() {
		return media;
	}

	public String getRecovery() {
		return recovery;
	}

	// Setter Methods

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	public void setLaunch(String launch) {
		this.launch = launch;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public void setRecovery(String recovery) {
		this.recovery = recovery;
	}
}
