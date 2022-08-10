package com.dev.springbootreactiveclientapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Invoice {

    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String number;
    @NonNull
    private Double amount;
}
