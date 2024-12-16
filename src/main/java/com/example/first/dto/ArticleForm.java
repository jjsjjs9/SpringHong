package com.example.first.dto;

import com.example.first.entity.Article;

public class ArticleForm {
    private String title;
    private String content;
    // 생성자
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }


    public Article toEntity() {
        return new Article(null,title,content);
    }
}
