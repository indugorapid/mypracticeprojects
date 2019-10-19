package com.hrms.util;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.hrms.model.News;
import com.hrms.service.NewsService;

@Component
public class CronScheduler {
	
	@Autowired
	  private NewsService newsService;



	//@Scheduled(cron = "*/5 * * * * ?")
	@Scheduled(fixedDelay = 4000)
	public void run() throws InterruptedException {
		System.out.println("Cron scheduler is running at " + new Date());
		 newsService.getNews();
//		Thread.sleep(3000);
	}
}
