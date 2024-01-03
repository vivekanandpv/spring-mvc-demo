package com.vivekanandpv.springmvcdemo.services;

import com.vivekanandpv.springmvcdemo.models.News;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    public News getNews(String country, int year) {
        return new News(country, year);
    }
}
