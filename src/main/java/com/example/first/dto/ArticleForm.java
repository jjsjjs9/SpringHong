package com.example.first.dto;

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




}
