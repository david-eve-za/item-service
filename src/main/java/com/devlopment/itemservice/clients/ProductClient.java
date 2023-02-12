package com.devlopment.itemservice.clients;

import com.devlopment.itemservice.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-service", url = "localhost:8001")
public interface ProductClient {

    @GetMapping("/api/products/list")
    public List<Product> getProducts();

    @GetMapping("/api/products/show/{id}")
    public Product getProduct(@PathVariable Long id);
}
