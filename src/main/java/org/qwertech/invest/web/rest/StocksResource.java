package org.qwertech.invest.web.rest;

import org.qwertech.invest.feign.TinkoffFeign;
import org.qwertech.invest.web.rest.dto.stocks.PayloadResponse;
import org.qwertech.invest.web.rest.dto.stocks.Stocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * StocksResource controller
 */
@RestController
@RequestMapping("/api/stocks-resource")
public class StocksResource {

    private final Logger log = LoggerFactory.getLogger(StocksResource.class);
    @Autowired
    private TinkoffFeign tinkoffFeign;
    @Autowired
    private RestTemplate restTemplate;

    /**
     * GET getStocks
     */
    @GetMapping("/get-stocks")
    public PayloadResponse<Stocks> getStocks() {
        return tinkoffFeign.getTradingStockList("All", "ByName", "Asc", 0, 100);
    }

    /**
     * GET historicalData
     */
    @GetMapping("/historical-data")
    public String historicalData() {
        return "historicalData";
    }

}
