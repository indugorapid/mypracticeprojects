package com.hrms.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	 private int id ;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Column(name = "AUTHOR")
	 private String author ;
	
	@Column(name = "TITLE")
		private String title;	
	
	@Column(name = "DESCRIPTION")
		private String description;
	
	@Column(name = "URL")
		private String url ;
	
	@Column(name = "URLTOIMAGE")
	    private String urlToImage;
	
	@Column(name = "PUBLISHEDAT")
		private String publishedAt;


	/*
	 * public article() { this.author = author; this.title = title; this.description
	 * = description; this.url = url; this.urlToImage = urlToImage; this.publishedAt
	 * = publishedAt; }
	 */


public String getAuthor() {
	return author;
}


public void setAuthor(String author) {
	this.author = author;
}


public String getTitle() {
	return title;
}


public void setTitle(String title) {
	this.title = title;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public String getUrl() {
	return url;
}


public void setUrl(String url) {
	this.url = url;
}


public String getPublishedAt() {
	return publishedAt;
}


public void setPublishedAt(String publishedAt) {
	this.publishedAt = publishedAt;
}


public String getUrlToImage() {
	return urlToImage;
}


public void setUrlToImage(String urlToImage) {
	this.urlToImage = urlToImage;
}


}


