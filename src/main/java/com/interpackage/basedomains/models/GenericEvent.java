package com.interpackage.basedomains.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericEvent {

    private Object object;
    private int type;
    private String message;

}
