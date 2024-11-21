package com.commerce.ecommerce.payment;

import com.commerce.ecommerce.customer.CustomerResponse;
import com.commerce.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}