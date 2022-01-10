package com.practice.rabbitsender.controller;

import com.practice.rabbitsender.clientmq.ShopSender;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {

    private final ShopSender shopSender;

    @GetMapping("/test")
    public void test() {
        for (int i = 0; i < 100; i++) {
            shopSender.send();
        }
    }
}
