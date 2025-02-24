package com.ttulka.ecommerce.warehouse;


import org.willibit.annotations.Producer;

/**
 * Warehouse use-cases.
 */
@Producer(data = "InStock")
public interface Warehouse {

    /**
     * Returns stock details for a product.
     *
     * @param productId the ID of the product
     * @return the stock details
     */
    InStock leftInStock(ProductId productId);

    /**
     * Puts product items into the stock.
     *
     * @param productId the ID of the product
     * @param amount    the amount of items
     */
    void putIntoStock(ProductId productId, Amount amount);
}
