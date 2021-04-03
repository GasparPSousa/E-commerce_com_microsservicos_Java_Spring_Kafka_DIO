package com.hatanaka.ecommerce.checkout.service;

import com.hatanaka.ecommerce.checkout.entity.CheckoutEntity;
import com.hatanaka.ecommerce.checkout.repository.CheckoutRepository;
import com.hatanaka.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        return Optional.empty();
    }
}
