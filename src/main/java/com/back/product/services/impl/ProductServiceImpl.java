package com.back.product.services.impl;

import com.back.product.dto.ProductDto;
import com.back.product.mapper.ProductMapper;
import com.back.product.model.Product;
import com.back.product.repository.ProductRepository;
import com.back.product.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    private ProductMapper productMapper;

    @Override
    public List<ProductDto> getAllProducts() {
        List<ProductDto> result = new ArrayList<>();
        this.productRepository.getAllProducts().forEach(
            product -> result.add(this.productMapper.productToProductDto(product))
        );
        return result;
    }

    @Override
    public ProductDto getProductById(Long id) {
        return this.productMapper.productToProductDto(this.productRepository.getProductById(id));
    }

    @Override
    public ProductDto addProduct(ProductDto product) {
        Product productToAdd = this.productMapper.productDtoToProduct(product);

        this.productRepository.addProduct(productToAdd);
        return this.productMapper.productToProductDto(productToAdd);
    }

    @Override
    public ProductDto updateProduct(ProductDto product) {
        Product productToUpdate = this.productRepository.getProductById(product.getId());

        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setCreatedAt(product.getCreatedAt());
        productToUpdate.setDetails(product.getDetails());
        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setDescription(product.getDescription());
        productToUpdate.setColor(product.getColor());
        productToUpdate.setStock(product.getStock());

        return this.productMapper.productToProductDto(this.productRepository.updateProduct(productToUpdate));
    }

    @Override
    public String deleteProduct(Long id) {
        this.productRepository.deleteProduct(id);
        return "La suppression du produit a été effectuée!";
    }
}
