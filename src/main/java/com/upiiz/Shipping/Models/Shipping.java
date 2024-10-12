package com.upiiz.Shipping.Models;

public class Shipping {
    private Long shippingId;
    private String shippingMethod;
    private Double shippingCost;

    public Shipping() {}

    public Shipping(Long shippingId,String shippingMethod, Double shippingCost) {
        this.shippingId = shippingId;
        this.shippingMethod = shippingMethod;
        this.shippingCost = shippingCost;
    }

    public Long getShippingId() {
        return shippingId;
    }

    public void setShippingId(Long shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Double shippingCost) {
        this.shippingCost = shippingCost;
    }
}
