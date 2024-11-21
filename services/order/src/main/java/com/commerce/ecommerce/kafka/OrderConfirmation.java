package com.commerce.ecommerce.kafka;

import com.commerce.ecommerce.customer.CustomerResponse;
import com.commerce.ecommerce.order.PaymentMethod;
import com.commerce.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}