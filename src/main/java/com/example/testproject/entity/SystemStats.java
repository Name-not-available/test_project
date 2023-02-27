package com.example.testproject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Entity
@Accessors(chain = true)
@Table(name = "SYSTEM_STATS")
public class SystemStats {
  @Id
  private String name;
  private String value;
}
