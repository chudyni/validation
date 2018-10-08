package com.home.springlearn.validation.config;

import com.home.springlearn.validation.converter.StringToStockConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author marcin.bracisiewicz
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addFormatters(FormatterRegistry registry) {
    registry.addConverter(new StringToStockConverter());
  }
}
