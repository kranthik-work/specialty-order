package com.infosys.hackathon.specialtyorder.entity;

public class Prescription {

    private Long prescriptionId;

    private String drugName;

    private Integer quantity;

    private String strength;

    public Long getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Long prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public Prescription(Long prescriptionId, String drugName, Integer quantity, String strength) {
        this.prescriptionId = prescriptionId;
        this.drugName = drugName;
        this.quantity = quantity;
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId=" + prescriptionId +
                ", drugName='" + drugName + '\'' +
                ", quantity=" + quantity +
                ", strength='" + strength + '\'' +
                '}';
    }
}
