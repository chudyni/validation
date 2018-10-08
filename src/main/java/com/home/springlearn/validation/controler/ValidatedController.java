package com.home.springlearn.validation.controler;

import javax.validation.Valid;

import com.home.springlearn.validation.model.Stock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author marcin.bracisiewicz
 */
@Slf4j
@RestController("/stock")
public class ValidatedController {

  @PostMapping
  public Stock createStock(@Valid @RequestBody Stock stock) {
    log.info(stock.toString());

    final Stock created = new Stock();
    created.setName(stock.getName());
    created.setTicker(stock.getTicker());

    log.info(created.toString());

    return created;
  }
}