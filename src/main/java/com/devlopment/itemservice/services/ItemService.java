package com.devlopment.itemservice.services;

import com.devlopment.itemservice.models.Item;

import java.util.List;

public interface ItemService {
    public List<Item> findAll();
    public Item findById(Long id, Integer quantity);
}
