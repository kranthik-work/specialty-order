package com.infosys.hackathon.specialtyorder.database;

import com.infosys.hackathon.specialtyorder.entity.Order;
import com.infosys.hackathon.specialtyorder.entity.Prescription;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AllEntities {

    List<Order> allOrders;

    List<Prescription> allPrescriptions;

    public AllEntities() {
        allOrders = new ArrayList<>();
        allPrescriptions = new ArrayList<>();

        Prescription prescription1 = new Prescription(1L, "Aveed", 10, "5mg");
        Prescription prescription2 = new Prescription(2L, "ADVIL++", 20, "10mg");
        Prescription prescription3 = new Prescription(3L, "LEMTRADA", 5, "10mg");
        Prescription prescription4 = new Prescription(4L, "TRUVADA", 7, "40mg");
        Prescription prescription5 = new Prescription(5L, "ZINBRYTA", 36, "200mg");
        Prescription prescription6 = new Prescription(6L, "SILIQ", 40, "100mg");

        allPrescriptions.add(prescription1);
        allPrescriptions.add(prescription2);
        allPrescriptions.add(prescription3);
        allPrescriptions.add(prescription4);
        allPrescriptions.add(prescription5);
        allPrescriptions.add(prescription6);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Order order1 = new Order(1L, new Date(), calendar.getTime());
        order1.getPrescriptions().add(prescription1);
        order1.getPrescriptions().add(prescription4);

        allOrders.add(order1);

        calendar.add(Calendar.DAY_OF_MONTH, 2);
        Order order2 = new Order(2L, new Date(), calendar.getTime());
        order2.getPrescriptions().add(prescription2);
        order2.getPrescriptions().add(prescription3);
        order2.getPrescriptions().add(prescription5);

        allOrders.add(order2);

        calendar.add(Calendar.DAY_OF_MONTH, 5);
        Order order3 = new Order(3L, new Date(), calendar.getTime());
        order3.getPrescriptions().add(prescription6);

        allOrders.add(order3);
    }

    public List<Order> getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(List<Order> allOrders) {
        this.allOrders = allOrders;
    }

    public List<Prescription> getAllPrescriptions() {
        return allPrescriptions;
    }

    public void setAllPrescriptions(List<Prescription> allPrescriptions) {
        this.allPrescriptions = allPrescriptions;
    }
}
