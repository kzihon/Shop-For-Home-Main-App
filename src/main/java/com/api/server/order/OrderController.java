package com.api.server.order;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/main/order")
@RequiredArgsConstructor
public class OrderController {

  private OrderService orderService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public String checkOut(@RequestBody OrderRequest orderRequest) {

    orderService.checkOut(orderRequest);
    return "Order placed successfully.";
  }
}
