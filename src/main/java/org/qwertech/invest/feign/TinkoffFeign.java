package org.qwertech.invest.feign;

import org.qwertech.invest.web.rest.dto.stocks.PayloadResponse;
import org.qwertech.invest.web.rest.dto.stocks.Stocks;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "tinkoff", url = "https://api.tinkoff.ru")
public interface TinkoffFeign {

    @GetMapping("/trading/stocks/list")
    PayloadResponse<Stocks> getTradingStockList(@RequestParam(value = "country", defaultValue = "All") String country,
                                                @RequestParam(value = "sortType", defaultValue = "ByName") String sortType,
                                                @RequestParam(value = "orderType", defaultValue = "Asc") String orderType,
                                                @RequestParam(value = "start", defaultValue = "0") Integer start,
                                                @RequestParam(value = "end", defaultValue = "100") Integer end);
}
