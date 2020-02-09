package com.centripio.togglz.payment.service;

import com.centripio.togglz.payment.adapter.PaymentAdapter;
import com.centripio.togglz.payment.dto.PaymentConfirmation;
import com.centripio.togglz.payment.dto.PaymentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentAdapter paymentAdapter;

    public PaymentConfirmation doPayment(PaymentRequest request) {
        return paymentAdapter.doPayment(request);
    }
}
