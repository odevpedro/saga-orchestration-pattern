package br.com.microservices.orchestrated.orchestratorservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ETopics {


    START_SAGA("start-saga"),
    BASIC_ORCHESTRATOR("orchestrator"),
    FINISH_SUCESS("finish-sucess"),
    FINISH_FAIL("finish-fail"),
    PRODUCT_VALIDATION_SUCESS("product-validation-sucess"),
    PRODUCT_VALIDATION_FAIL("product-validation-fail"),
    PAYMENT_SUCESS(""),
    PAYMENT_FAIL(""),
    INVENTORY_SUCESS(""),
    INVENTORY_FAIL(""),
    NOTIFY_ENDING("notify-fail");

    private String topic;
}
