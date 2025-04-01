package com.ttulka.ecommerce.billing.payment;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.ToString;
import org.willibit.annotations.Consumer;
import org.willibit.annotations.Producer;

/**
 * Payment ID domain primitive.
 */
@EqualsAndHashCode
@ToString
public final class PaymentId {

    // @Consumer(data = "InStock")
    @Producer(data = "InStock")
    private final @NonNull String id;

    public PaymentId(@NonNull Object id) {
        var idVal = id.toString().strip();
        if (idVal.isBlank()) {
            throw new IllegalArgumentException("ID cannot be empty!");
        }
        this.id = idVal;
    }

    public String value() {
        return id;
    }
}