package com.green.babyfood.email.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class MailCycleDto {
    private String title; // 제목
    private String ctnt; // 내용
}
