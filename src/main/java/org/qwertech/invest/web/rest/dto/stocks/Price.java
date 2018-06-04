
package org.qwertech.invest.web.rest.dto.stocks;

import java.util.HashMap;
import java.util.Map;

public class Price {

    public String currency;
    public Double value;
    public Boolean fromCache;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
