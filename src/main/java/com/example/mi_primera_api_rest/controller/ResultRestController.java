package com.example.mi_primera_api_rest.controller;

import com.example.mi_primera_api_rest.model.Race;
import com.example.mi_primera_api_rest.model.Result;
import com.example.mi_primera_api_rest.service.RaceService;
import com.example.mi_primera_api_rest.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ResultRestController {
    private final ResultService resultService;

    @Autowired
    public ResultRestController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping("/results")
    public ResponseEntity<List<Result>> getAll() {
        return ResponseEntity.ok(resultService.getAll());
    }

    @GetMapping("/results/{driverid}")
    public ResponseEntity<List<Result>> getResultsByDriverid(@PathVariable Long driverid) {
        return ResponseEntity.ok(resultService.findByDriverid(driverid));
    }
/*
    @PostMapping("/results")
    public ResponseEntity<Result> create(@RequestBody Result result) {
        if(result.getResultid() != null){
            return ResponseEntity.badRequest().build();
        }
        this.resultService.saveResult(result);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/results")
    public ResponseEntity<Result> update(@RequestBody Result result) {
        this.resultService.saveResult(result);
        return ResponseEntity.ok(result);
    }


    @DeleteMapping("/results/{resultid}")
    public ResponseEntity<Result> deleteResultByResultid(@PathVariable Long resultid) {
        this.resultService.deleteResultByResultid(resultid);
        return ResponseEntity.noContent().build();
    }
*/


}
