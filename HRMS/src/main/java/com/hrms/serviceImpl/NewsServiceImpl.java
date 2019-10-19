package com.hrms.serviceImpl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hrms.model.Article;
import com.hrms.model.News;
import com.hrms.repository.NewsRepository;
import com.hrms.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	private NewsRepository newsRepository;

	public static final String REST_SERVICE_URI = "https://newsapi.org/v1/articles?source=bbc-news&sortBy=top&apiKey=4dbc17e007ab436fb66416009dfb59a8";
	
	public News getNews() {
		System.out.println("Testing getUser API----------");
		RestTemplate restTemplate = new RestTemplate();
		News news= restTemplate.getForObject(REST_SERVICE_URI, News.class);
	    System.out.println(news);
	   
		for (Article article : news.getArticles()) {
		    System.out.println(article);
		    newsRepository.save(article);
		}
		 
	    return news;
	}
		
}
