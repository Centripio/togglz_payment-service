package com.centripio.togglz.payment.adapter;

import com.centripio.togglz.payment.dto.PaymentConfirmation;
import com.centripio.togglz.payment.dto.PaymentRequest;
import com.centripio.togglz.payment.service.AmexPaymentService;
import com.centripio.togglz.payment.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PaymentAdapter {
    @Autowired
    private ApplicationContext context;

    IPaymentService paymentService;

    public PaymentConfirmation doPayment(PaymentRequest request) {
        paymentService = context.getBean(AmexPaymentService.class);
        return paymentService.doPayment(request);
    }
}
