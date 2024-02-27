package com.back.product.repository;

import com.back.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> getAllProducts();

    public Product getProductById(Long id);

    public Product addProduct(Product product);

    public Product updateProduct(Product product);

    public void deleteProduct(Long id);
}
