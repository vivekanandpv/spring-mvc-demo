package com.vivekanandpv.springmvcdemo;

import com.vivekanandpv.springmvcdemo.services.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {
    private final NewsService newsService;

    public SampleController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(
                    name="name",
                    required=false,
                    defaultValue="World"
            ) String name,
            Model model
    ) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/news")
    public String news(
            @RequestParam(
                    name = "country",
                    required = false,
                    defaultValue = "India"
            ) String country,
            @RequestParam(
                    name = "year",
                    required = false
            ) Integer year,
            Model model
    ) {
        model.addAttribute(
                "news",
                newsService.getNews(country, year != null ? year : 2024)
        );

        return "news";
    }
}
