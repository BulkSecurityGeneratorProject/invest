
package org.qwertech.invest.web.rest.dto.stocks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {

    public Boolean isFavorite;
    public String instrumentStatus;
    public Prices prices;
    public Earnings earnings;
    public String instrumentStatusComment;
    public Price price;
    public String instrumentStatusDesc;
    public Symbol symbol;
    public String instrumentStatusShortDesc;
    public String exchangeStatus;
    public List<HistoricalPrice> historicalPrices = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
