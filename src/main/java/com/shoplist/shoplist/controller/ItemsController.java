package com.shoplist.shoplist.controller;

import com.shoplist.shoplist.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ItemsController {
    public final OrderService orderService;

    public ItemsController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> items) {
        return orderService.addItems(items);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return orderService.getItems();
    }


}
