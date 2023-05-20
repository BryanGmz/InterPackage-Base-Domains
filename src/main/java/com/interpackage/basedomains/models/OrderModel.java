package com.interpackage.basedomains.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {
    
    private String id;
    private String status;
    private String client;
    private String final_address;
    private String email;
    private List<PackageModel> packageModelList;
    private String dpi;
    private String nit;
    private String phone;

}
