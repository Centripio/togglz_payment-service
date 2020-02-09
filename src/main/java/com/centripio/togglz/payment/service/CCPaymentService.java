package com.centripio.togglz.payment.service;

import com.centripio.togglz.payment.dto.PaymentConfirmation;
import com.centripio.togglz.payment.dto.PaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CCPaymentService implements IPaymentService {
    @Override
    public PaymentConfirmation doPayment(PaymentRequest request) {
        log.debug("Calling CC Payment Service..");
        return null;
    }
}
