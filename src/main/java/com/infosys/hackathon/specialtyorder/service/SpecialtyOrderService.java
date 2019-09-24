package com.infosys.hackathon.specialtyorder.service;

import com.infosys.hackathon.specialtyorder.entity.Order;
import com.infosys.hackathon.specialtyorder.entity.Prescription;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpecialtyOrderService {

    List<Order> getOrderFromPrescription(Long prescriptionId);

    Prescription getPrescriptionDetails(Long prescriptionId);

    Order getOrderDetails(Long orderId);
}
