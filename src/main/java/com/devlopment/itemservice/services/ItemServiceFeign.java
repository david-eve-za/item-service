package com.devlopment.itemservice.services;

import com.devlopment.itemservice.clients.ProductClient;
import com.devlopment.itemservice.models.Item;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ItemServiceFeign implements ItemService{
    private final ProductClient productClient;

    public ItemServiceFeign(ProductClient productClient) {
        this.productClient = productClient;
    }

    @Override
    public List<Item> findAll() {
        return this.productClient.getProducts().stream().map(product -> new Item(product, 1)).toList();
    }

    @Override
    public Item findById(Long id, Integer quantity) {
        return new Item(this.productClient.getProduct(id), quantity);
    }
}
