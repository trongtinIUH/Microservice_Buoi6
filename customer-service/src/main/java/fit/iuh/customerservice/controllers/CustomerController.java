package fit.iuh.customerservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    // Define your endpoints here
    // For example:
     @GetMapping
     public List<String> getAllCustomers() {
         //replace with actual customer retrieval logic
            return List.of("Customer 1", "Customer 2", "Customer 3");
     }


}
