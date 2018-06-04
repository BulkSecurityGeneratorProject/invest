
package org.qwertech.invest.web.rest.dto.stocks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stocks {

    public List<Stock> values = null;
    public Integer total;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
