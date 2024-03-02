package com.back.product.services;

import com.back.product.dto.ProductDto;

import java.util.List;

public interface ProductService {
    public List<ProductDto> getAllProducts();

    public ProductDto getProductById(Long id);

    public ProductDto addProduct(ProductDto product);

    public ProductDto updateProduct(ProductDto product);

   // public String deleteProduct(Long id);
}
