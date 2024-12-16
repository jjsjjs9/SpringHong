package com.example.first.controller;

import com.example.first.dto.ArticleForm;
import com.example.first.entity.Article;
import com.example.first.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        //1. dto-> entity로 변환.
        Article article = form.toEntity();
        System.out.println(article.toString());
        //2. repository에게 엔티티를 db안에 저장하게 함.
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
