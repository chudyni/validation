package com.home.springlearn.validation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author marcin.bracisiewicz
 */
@Entity
public class Stock {

  @Id
  @GeneratedValue
  private Long id;

  @NotBlank
  private String name;

  @Size(min = 3)
  private String ticker;

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getTicker() {
    return ticker;
  }

  public void setTicker(final String ticker) {
    this.ticker = ticker;
  }

  @Override
  public String toString() {
    return "Stock{" + "id=" + id + ", name='" + name + '\'' + ", ticker='" + ticker + '\'' + '}';
  }
}
