package com.example.controller;

import com.example.service.DataService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
    private DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }
}
