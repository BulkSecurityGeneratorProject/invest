
package org.qwertech.invest.web.rest.dto.stocks;

import java.util.HashMap;
import java.util.Map;

public class HistoricalPrice {

    public Double amount;
    public String time;
    public Integer unixtime;
    public EarningsInfo earningsInfo;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
