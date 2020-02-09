package com.centripio.togglz.payment.service;

import com.centripio.togglz.payment.dto.PaymentConfirmation;
import com.centripio.togglz.payment.dto.PaymentRequest;

public interface IPaymentService {
    PaymentConfirmation doPayment(PaymentRequest request);
}
