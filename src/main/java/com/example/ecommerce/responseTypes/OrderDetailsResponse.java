package com.example.ecommerce.responseTypes;

import java.util.List;

import com.example.ecommerce.models.Product;

public class OrderDetailsResponse {

    public List<ProductResponse> products;
    public int quantity;

    public OrderDetailsResponse(List<ProductResponse> products, int quantity) {
        this.products = products;
        this.quantity = quantity;
    }

    public OrderDetailsResponse() {
    }

}
