package com.devlopment.itemservice.services;

import com.devlopment.itemservice.models.Item;
import com.devlopment.itemservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private final RestTemplate clientRest;

    public ItemServiceImpl(RestTemplate clientRest) {
        this.clientRest = clientRest;
    }

    @Override
    public List<Item> findAll() {
        List<Product> items = Arrays.asList(this.clientRest.getForObject("http://localhost:8001/api/products/list", Product[].class));
        return items.stream().map(product -> new Item(product, 1)).toList();
    }

    @Override
    public Item findById(Long id, Integer quantity) {
        Product product = this.clientRest.getForObject("http://localhost:8001/api/products/show/{id}", Product.class, id);
        return new Item(product, quantity);
    }
}
