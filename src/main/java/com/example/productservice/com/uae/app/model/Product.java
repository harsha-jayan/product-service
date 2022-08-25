package com.example.productservice.com.uae.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;

@Document(collection="product")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @MongoId
    private String id;

    private String name;

    private String category;

    private Date createdOn;
}
