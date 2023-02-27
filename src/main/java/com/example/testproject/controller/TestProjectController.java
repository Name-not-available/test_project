package com.example.testproject.controller;

import com.example.testproject.service.TestProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
class TestProjectController {
  private final TestProjectService testProjectService;

  @GetMapping("/")
  public String greet() {
    return testProjectService.greet();
  }
}
