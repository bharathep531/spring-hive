package com.example.hiveservice.service;

import java.util.List;
import java.util.Map;

public interface HiveService {
    List<Map<String, Object>> executeQuery(String query);
}
