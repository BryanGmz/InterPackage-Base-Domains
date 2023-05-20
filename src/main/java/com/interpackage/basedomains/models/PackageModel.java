package com.interpackage.basedomains.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PackageModel {

    private Long id;
    private String name;
    private double weight;
    private double volume;
    private Long idRoad;
    private String observations;
    private double subTotal;
    private String recipientDpi;
    private double totalCost;
    private String recipientName;
    private String recipientAddress;

}
