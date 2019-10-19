package com.hrms.model;

import java.util.List;

public class News {

    private String status ;	
	private String source;	
	private String sortBy;
	
	private List<Article> articles;
    public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

public News() {
	
}

public News(String status,String source,String sortBy){
	this.status = status;
	this.source = source;
	this.sortBy = sortBy;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getSource() {
	return source;
}

public void setSource(String source) {
	this.source = source;
}

public String getSortBy() {
	return sortBy;
}

public void setSortBy(String sortBy) {
	this.sortBy = sortBy;
}
}
