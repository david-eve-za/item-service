package com.devlopment.itemservice.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Item {
    @NonNull private Product product;
    @NonNull private Integer quantity;

    public Double getTotal() {
        return product.getPrice() * quantity.doubleValue();
    }
}
