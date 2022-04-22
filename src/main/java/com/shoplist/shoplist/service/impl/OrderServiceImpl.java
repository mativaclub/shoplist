package com.shoplist.shoplist.service.impl;

import com.shoplist.shoplist.Cart;
import com.shoplist.shoplist.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    public final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> id) {
        return cart.addItems(id);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
