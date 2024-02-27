package com.back.product.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
public class ProductDto {
    private Long id;

    private LocalDateTime createdAt;

    private String name;

    private String details;

    private BigDecimal price;

    private String description;

    private String color;

    private Integer stock;
}
