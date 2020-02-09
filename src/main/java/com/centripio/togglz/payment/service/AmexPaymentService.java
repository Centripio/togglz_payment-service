package com.centripio.togglz.payment.service;

import com.centripio.togglz.payment.dto.PaymentConfirmation;
import com.centripio.togglz.payment.dto.PaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class AmexPaymentService implements IPaymentService {
    @Override
    public PaymentConfirmation doPayment(PaymentRequest request) {
        log.info("Calling AMEX Payment Service");
        return new PaymentConfirmation(UUID.randomUUID().toString());
    }
}
