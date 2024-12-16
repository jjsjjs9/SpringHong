package com.example.first.entity;

import lombok.extern.slf4j.Slf4j;

@Entity
public class Article {
    @Id
    @GeneratedValue

    private Long id;


    @Column
    private String title;
    @Column
    private String content;

}

