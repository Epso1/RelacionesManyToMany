package com.example.mi_primera_api_rest.service;

import com.example.mi_primera_api_rest.model.Driver;
import com.example.mi_primera_api_rest.model.Race;
import com.example.mi_primera_api_rest.model.Result;
import com.example.mi_primera_api_rest.repository.DriverRepository;
import com.example.mi_primera_api_rest.repository.RaceRepository;
import com.example.mi_primera_api_rest.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResultServiceImpl implements ResultService {
    private final ResultRepository repository;

    @Autowired
    public ResultServiceImpl(ResultRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<Result> getAll() {
        return repository.findAll();
    }

    @Override
    public void saveResult(Result result) {
        repository.save(result);
    }
/*
    @Override
    public void deleteResultByResultid(Long resultid) {
        repository.deleteById(resultid);
    }
*/
    @Override
    public List<Result> findByDriverid(Long driverid){
        return repository.findByDriverid(driverid);
    }
}
