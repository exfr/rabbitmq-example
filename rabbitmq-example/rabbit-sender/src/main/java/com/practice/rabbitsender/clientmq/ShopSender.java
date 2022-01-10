package com.practice.rabbitsender.clientmq;

import lombok.AllArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@AllArgsConstructor
public class ShopSender {

    private AmqpTemplate rabbitTemplate;

    public void send() {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String context = "Sender sends message in time:  " + date;
        System.out.println(context);
        this.rabbitTemplate.convertAndSend("shop_q", context);
    }
}
