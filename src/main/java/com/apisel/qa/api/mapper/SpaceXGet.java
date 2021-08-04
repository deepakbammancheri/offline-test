package com.apisel.qa.api.mapper;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Json mapper class
 *
 */
public class SpaceXGet {

	Fairings FairingsObject;
	Links LinksObject;
	private String static_fire_date_utc = null;
	private String static_fire_date_unix = null;
	private boolean tbd;
	private boolean net;
	private float window;
	private String rocket;
	private boolean success;
	private String details;
	ArrayList<Object> crew = new ArrayList<Object>();
	@JsonIgnore
	ArrayList<Object> ships = new ArrayList<Object>();
	@JsonIgnore
	ArrayList<Object> capsules = new ArrayList<Object>();
	@JsonIgnore
	ArrayList<Object> payloads = new ArrayList<Object>();
	private String launchpad;
	private boolean auto_update;
	private String launch_library_id;
	ArrayList<Object> failures = new ArrayList<Object>();
	private float flight_number;
	private String name;
	private String date_utc;
	private float date_unix;
	private String date_local;
	private String date_precision;
	private boolean upcoming;
	ArrayList<Object> cores = new ArrayList<Object>();
	private String id;

	// Getter Methods

	public Fairings getFairings() {
		return FairingsObject;
	}

	public Fairings getFairingsObject() {
		return FairingsObject;
	}

	public void setFairingsObject(Fairings fairingsObject) {
		FairingsObject = fairingsObject;
	}

	public Links getLinksObject() {
		return LinksObject;
	}

	public void setLinksObject(Links linksObject) {
		LinksObject = linksObject;
	}

	public ArrayList<Object> getCrew() {
		return crew;
	}

	public void setCrew(ArrayList<Object> crew) {
		this.crew = crew;
	}

	public ArrayList<Object> getShips() {
		return ships;
	}

	public void setShips(ArrayList<Object> ships) {
		this.ships = ships;
	}

	public ArrayList<Object> getCapsules() {
		return capsules;
	}

	public void setCapsules(ArrayList<Object> capsules) {
		this.capsules = capsules;
	}

	public ArrayList<Object> getPayloads() {
		return payloads;
	}

	public void setPayloads(ArrayList<Object> payloads) {
		this.payloads = payloads;
	}

	public ArrayList<Object> getFailures() {
		return failures;
	}

	public void setFailures(ArrayList<Object> failures) {
		this.failures = failures;
	}

	public ArrayList<Object> getCores() {
		return cores;
	}

	public void setCores(ArrayList<Object> cores) {
		this.cores = cores;
	}

	public Links getLinks() {
		return LinksObject;
	}

	public String getStatic_fire_date_utc() {
		return static_fire_date_utc;
	}

	public String getStatic_fire_date_unix() {
		return static_fire_date_unix;
	}

	public boolean getTbd() {
		return tbd;
	}

	public boolean getNet() {
		return net;
	}

	public float getWindow() {
		return window;
	}

	public String getRocket() {
		return rocket;
	}

	public boolean getSuccess() {
		return success;
	}

	public String getDetails() {
		return details;
	}

	public String getLaunchpad() {
		return launchpad;
	}

	public boolean getAuto_update() {
		return auto_update;
	}

	public String getLaunch_library_id() {
		return launch_library_id;
	}

	public float getFlight_number() {
		return flight_number;
	}

	public String getName() {
		return name;
	}

	public String getDate_utc() {
		return date_utc;
	}

	public float getDate_unix() {
		return date_unix;
	}

	public String getDate_local() {
		return date_local;
	}

	public String getDate_precision() {
		return date_precision;
	}

	public boolean getUpcoming() {
		return upcoming;
	}

	public String getId() {
		return id;
	}

	// Setter Methods

	public void setFairings(Fairings fairingsObject) {
		this.FairingsObject = fairingsObject;
	}

	public void setLinks(Links linksObject) {
		this.LinksObject = linksObject;
	}

	public void setStatic_fire_date_utc(String static_fire_date_utc) {
		this.static_fire_date_utc = static_fire_date_utc;
	}

	public void setStatic_fire_date_unix(String static_fire_date_unix) {
		this.static_fire_date_unix = static_fire_date_unix;
	}

	public void setTbd(boolean tbd) {
		this.tbd = tbd;
	}

	public void setNet(boolean net) {
		this.net = net;
	}

	public void setWindow(float window) {
		this.window = window;
	}

	public void setRocket(String rocket) {
		this.rocket = rocket;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setLaunchpad(String launchpad) {
		this.launchpad = launchpad;
	}

	public void setAuto_update(boolean auto_update) {
		this.auto_update = auto_update;
	}

	public void setLaunch_library_id(String launch_library_id) {
		this.launch_library_id = launch_library_id;
	}

	public void setFlight_number(float flight_number) {
		this.flight_number = flight_number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate_utc(String date_utc) {
		this.date_utc = date_utc;
	}

	public void setDate_unix(float date_unix) {
		this.date_unix = date_unix;
	}

	public void setDate_local(String date_local) {
		this.date_local = date_local;
	}

	public void setDate_precision(String date_precision) {
		this.date_precision = date_precision;
	}

	public void setUpcoming(boolean upcoming) {
		this.upcoming = upcoming;
	}

	public void setId(String id) {
		this.id = id;
	}
}
