package com.centripio.togglz.payment.dto;

import lombok.Data;

@Data
public class PaymentRequest {
    private String accountId;
    private Double amount;
}
