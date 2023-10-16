package com.example.service;

import com.example.repository.DataRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    private DataRepository dataRepository;
    private ModelMapper mapper;

    public DataService(DataRepository dataRepository, ModelMapper mapper) {
        this.dataRepository = dataRepository;
        this.mapper = mapper;
    }

}
