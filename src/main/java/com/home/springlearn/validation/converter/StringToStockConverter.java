package com.home.springlearn.validation.converter;

import com.home.springlearn.validation.model.Stock;
import org.springframework.core.convert.converter.Converter;

/**
 * @author marcin.bracisiewicz
 */
public class StringToStockConverter implements Converter<String, Stock> {

  @Override
  public Stock convert(final String s) {
    final String[] data = s.split(",");
    final Stock stock = new Stock();
    stock.setName(data[0]);
    stock.setTicker(data[1]);
    return stock;
  }
}
