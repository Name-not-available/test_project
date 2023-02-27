package com.example.testproject.repository;

import com.example.testproject.entity.SystemStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemStatsRepository extends JpaRepository<SystemStats, String> {

}
