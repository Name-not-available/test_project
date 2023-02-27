package com.example.testproject.service;

import com.example.testproject.entity.SystemStats;
import com.example.testproject.repository.SystemStatsRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestProjectService {
  private final SystemStatsRepository systemStatsRepository;

  public String greet() {
    List<SystemStats> all = systemStatsRepository.findAll();
    Long visitors = Long.parseLong(all.get(0).getValue()) + 1L;
    all.get(0).setValue(visitors.toString());
    return "Hello " + visitors + " visitor";
  }
}
