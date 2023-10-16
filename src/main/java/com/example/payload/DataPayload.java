package com.example.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataPayload {
    @Id
    private String name;
    private double latitude;
    private double longitude;
    private boolean excluded;
}