package com.example.productservice.com.uae.app.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Builder
@Getter
public class ProductDto {
    private String name;
    private String category;
    private Date createdOn;

    public ProductDto(String name, String category, Date createdOn) {
        this.name = name;
        this.category = category;
        this.createdOn = createdOn;
    }
}
