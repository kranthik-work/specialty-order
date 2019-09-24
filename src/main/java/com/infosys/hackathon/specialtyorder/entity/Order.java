package com.infosys.hackathon.specialtyorder.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Long orderId;

    private List<Prescription> prescriptions;

    private Date orderPlacedDate;

    private Date OrderDeliveryDate;

    public Order(Long orderId, List<Prescription> prescriptions, Date orderPlacedDate, Date orderDeliveryDate) {
        this.orderId = orderId;
        this.prescriptions = prescriptions;
        this.orderPlacedDate = orderPlacedDate;
        OrderDeliveryDate = orderDeliveryDate;
    }

    public Order(Long orderId, Date orderPlacedDate, Date orderDeliveryDate) {
        this.orderId = orderId;
        this.orderPlacedDate = orderPlacedDate;
        OrderDeliveryDate = orderDeliveryDate;
        this.prescriptions = new ArrayList<>();
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(List<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public Date getOrderPlacedDate() {
        return orderPlacedDate;
    }

    public void setOrderPlacedDate(Date orderPlacedDate) {
        this.orderPlacedDate = orderPlacedDate;
    }

    public Date getOrderDeliveryDate() {
        return OrderDeliveryDate;
    }

    public void setOrderDeliveryDate(Date orderDeliveryDate) {
        OrderDeliveryDate = orderDeliveryDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", prescriptions=" + prescriptions +
                ", orderPlacedDate=" + orderPlacedDate +
                ", OrderDeliveryDate=" + OrderDeliveryDate +
                '}';
    }
}
