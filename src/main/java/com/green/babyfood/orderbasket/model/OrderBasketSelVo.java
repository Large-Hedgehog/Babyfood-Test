package com.green.babyfood.orderbasket.model;

import lombok.Data;

@Data
public class OrderBasketSelVo {

    private Long cartId;
    private String title;
    private int count;
    private int price;
    private String thumbnail;
}
