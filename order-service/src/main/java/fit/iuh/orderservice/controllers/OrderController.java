package fit.iuh.orderservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    // Define your endpoints here
    // For example:
    @GetMapping
    public List<String> getAllCustomers() {
        //replace with actual customer retrieval logic
        return List.of("Order 1", "Order 2", "Order 3");
    }
}
