package com.apisel.qa.api.mapper;

/**
 * Json mapper class
 *
 */
public class Links {
	Patch PatchObject;
	Reddit RedditObject;
	Flickr FlickrObject;
	private String presskit = null;
	private String webcast;
	private String youtube_id;
	private String article = null;
	private String wikipedia;

	// Getter Methods

	public Patch getPatch() {
		return PatchObject;
	}

	public Reddit getReddit() {
		return RedditObject;
	}

	public Flickr getFlickr() {
		return FlickrObject;
	}

	public String getPresskit() {
		return presskit;
	}

	public String getWebcast() {
		return webcast;
	}

	public String getYoutube_id() {
		return youtube_id;
	}

	public String getArticle() {
		return article;
	}

	public String getWikipedia() {
		return wikipedia;
	}

	// Setter Methods

	public void setPatch(Patch patchObject) {
		this.PatchObject = patchObject;
	}

	public void setReddit(Reddit redditObject) {
		this.RedditObject = redditObject;
	}

	public void setFlickr(Flickr flickrObject) {
		this.FlickrObject = flickrObject;
	}

	public void setPresskit(String presskit) {
		this.presskit = presskit;
	}

	public void setWebcast(String webcast) {
		this.webcast = webcast;
	}

	public void setYoutube_id(String youtube_id) {
		this.youtube_id = youtube_id;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public void setWikipedia(String wikipedia) {
		this.wikipedia = wikipedia;
	}
}
