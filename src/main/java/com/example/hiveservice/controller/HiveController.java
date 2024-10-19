package com.example.hiveservice.controller;

import com.example.hiveservice.service.HiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/hive")
public class HiveController {

    private final HiveService hiveService;

    @Autowired
    public HiveController(HiveService hiveService) {
        this.hiveService = hiveService;
    }

    @PostMapping("/query")
    public ResponseEntity<List<Map<String, Object>>> executeQuery(@RequestBody String query) {
        List<Map<String, Object>> result = hiveService.executeQuery(query);
        return ResponseEntity.ok(result);
    }
}
