package com.home.springlearn.validation.advice;

import java.util.Date;

/**
 * @author marcin.bracisiewicz
 */
public class ErrorDetails {

  private Date timestamp;
  private String message;
  private String details;

  public ErrorDetails(Date timestamp, String message, String details) {
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(final Date timestamp) {
    this.timestamp = timestamp;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(final String message) {
    this.message = message;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(final String details) {
    this.details = details;
  }

}
