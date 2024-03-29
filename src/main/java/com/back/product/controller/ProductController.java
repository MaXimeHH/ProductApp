package com.back.product.controller;

import com.back.product.controller.api.ProductApiInterface;
import com.back.product.dto.ProductDto;
import com.back.product.services.ProductService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/")
@AllArgsConstructor
@NoArgsConstructor
public class ProductController implements ProductApiInterface {

    private ProductService productService;

    //récupérer tous les produits
    @GetMapping("getAllProducts")
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        return ResponseEntity.ok(this.productService.getAllProducts());
    }

    //récupérer un produit par son id
    @PostMapping("getProductById")
    public ResponseEntity<ProductDto> getProductById(@RequestBody Long id) {
        return ResponseEntity.ok(this.productService.getProductById(id));
    }

    //ajouter un produit
    @PostMapping("addProduct")
    public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto product) {
        return ResponseEntity.ok(this.productService.addProduct(product));
    }

    //modifier un produit
    @PostMapping("updateProduct")
    public ResponseEntity<ProductDto> updateProduct(@RequestBody ProductDto product) {
        return ResponseEntity.ok(this.productService.updateProduct(product));
    }

    //supprimer un produit@DeleteMapping("deleteProduct")
    public ResponseEntity<String> deleteProduct(@RequestBody Long id) {
        return ResponseEntity.ok(this.productService.deleteProduct(id));

    }
}