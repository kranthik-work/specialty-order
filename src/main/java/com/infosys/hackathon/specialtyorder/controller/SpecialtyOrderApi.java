package com.infosys.hackathon.specialtyorder.controller;

import com.infosys.hackathon.specialtyorder.entity.Order;
import com.infosys.hackathon.specialtyorder.entity.Prescription;
import com.infosys.hackathon.specialtyorder.service.SpecialtyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class SpecialtyOrderApi {

    @Autowired
    SpecialtyOrderService specialtyOrderService;

    @GetMapping(value = "/v1/getOrderFromPrescription")
    public ResponseEntity<List<Order>> getOrderFromPrescription(@PathParam("prescriptionId") Long prescriptionId) {

        List<Order> orders = specialtyOrderService.getOrderFromPrescription(prescriptionId);

        return ((orders != null && !orders.isEmpty()) ? new ResponseEntity<>(orders, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT));
    }

    @GetMapping(value = "/v1/getPrescriptionDetails")
    public ResponseEntity<Prescription> getPrescriptionDetails(@PathParam("prescriptionId") Long prescriptionId) {

        Prescription prescription = specialtyOrderService.getPrescriptionDetails(prescriptionId);

        return (prescription != null) ? new ResponseEntity<>(prescription, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/v1/getOrderDetails")
    public ResponseEntity<Order> getOrderDetails(@PathParam("orderId") Long orderId) {


        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
