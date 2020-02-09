package com.centripio.togglz.payment.controller;

import com.centripio.togglz.payment.dto.PaymentConfirmation;
import com.centripio.togglz.payment.dto.PaymentRequest;
import com.centripio.togglz.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/service/payment")
    public ResponseEntity<PaymentConfirmation> doPayment(@RequestBody PaymentRequest request) {
        return new ResponseEntity<>(paymentService.doPayment(request), HttpStatus.OK);
    }
}
