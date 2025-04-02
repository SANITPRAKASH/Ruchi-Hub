package com.nanu.ruchihub.controller;

import com.nanu.ruchihub.model.CartItem;
import com.nanu.ruchihub.model.Order;
import com.nanu.ruchihub.model.User;
import com.nanu.ruchihub.request.OrderRequest;
import com.nanu.ruchihub.service.OrderService;
import com.nanu.ruchihub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @PutMapping("/order")
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest req,
                                                @RequestHeader("Authorization") String jwt) throws Exception{
        User user = userService.findUserByJwtToken(jwt);
        Order order = orderService.createOrder(req,user);
        return new ResponseEntity<>(order, HttpStatus.OK );
    }

    @GetMapping("/order/user")
    public ResponseEntity<List<Order>> getOrderHistory(@RequestHeader("Authorization") String jwt) throws Exception {
        User user = userService.findUserByJwtToken(jwt);
        List<Order> orders = orderService.getUserOrder(user.getId());
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

}
