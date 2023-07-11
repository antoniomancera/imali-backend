package com.mancera.imali.controllers;

import com.mancera.imali.models.Payment;
import com.mancera.imali.reposritories.PaymentRepository;
import com.mancera.imali.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PaymentController {
    @Autowired
    private PaymentRepository paymentService;

    @GetMapping("/payment")
    public List<Payment> findAllPays() {
        return paymentService.findAll();
    }


    @PostMapping("/payment")
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }

}
