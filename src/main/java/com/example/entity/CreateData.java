package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="user_location")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateData {
    @Id
    private String name;
    private double latitude;
    private double longitude;
    private boolean excluded;
}
