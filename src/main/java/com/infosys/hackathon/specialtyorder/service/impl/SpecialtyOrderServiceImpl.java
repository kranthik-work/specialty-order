package com.infosys.hackathon.specialtyorder.service.impl;

import com.infosys.hackathon.specialtyorder.database.AllEntities;
import com.infosys.hackathon.specialtyorder.entity.Order;
import com.infosys.hackathon.specialtyorder.entity.Prescription;
import com.infosys.hackathon.specialtyorder.service.SpecialtyOrderService;

import java.util.ArrayList;
import java.util.List;

public class SpecialtyOrderServiceImpl implements SpecialtyOrderService {

    private AllEntities allEntities = new AllEntities();

    @Override
    public List<Order> getOrderFromPrescription(Long prescriptionId) {
        List<Order> orders = new ArrayList<>();

        for (Order order: allEntities.getAllOrders()) {
            for (Prescription prescription: order.getPrescriptions()) {
                if (prescriptionId.equals(prescription.getPrescriptionId()))
                    orders.add(order);
            }
        }

        return orders;
    }

    @Override
    public Prescription getPrescriptionDetails(Long prescriptionId) {
        for (Prescription prescription: allEntities.getAllPrescriptions()) {
            if (prescriptionId.equals(prescription.getPrescriptionId()))
                return prescription;
        }
        return null;
    }

    @Override
    public Order getOrderDetails(Long orderId) {

        for (Order order: allEntities.getAllOrders()) {
            if (orderId.equals(order.getOrderId()))
                return order;
        }
        return null;
    }
}
