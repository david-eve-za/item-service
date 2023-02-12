package com.devlopment.itemservice.controllers;

import com.devlopment.itemservice.models.Item;
import com.devlopment.itemservice.services.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/list")
    public List<Item> getItems() {
        return this.itemService.findAll();
    }

    @GetMapping("/show/{id}/quantity/{quantity}")
    public Item getItem(@PathVariable Long id, @PathVariable Integer quantity) {
        return this.itemService.findById(id, quantity);
    }
}
