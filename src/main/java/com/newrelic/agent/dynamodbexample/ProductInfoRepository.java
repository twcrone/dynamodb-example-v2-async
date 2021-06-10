package com.newrelic.agent.dynamodbexample;

import java.util.Optional;

public interface ProductInfoRepository {

    Optional<ProductInfo> findById(String id);
    Iterable<ProductInfo> findAll();
    ProductInfo save(ProductInfo productInfo);
    void deleteById(String id);
}