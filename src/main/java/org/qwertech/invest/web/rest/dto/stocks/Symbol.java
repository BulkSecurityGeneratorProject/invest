
package org.qwertech.invest.web.rest.dto.stocks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Symbol {

    public String classCode;
    public String logoName;
    public String premarketStartTime;
    public String sessionClose;
    public String sessionOpen;
    public List<String> brokerAccountTypesList = null;
    public String fullDescription;
    public String description;
    public String isin;
    public Boolean blackout;
    public String textColor;
    public String showName;
    public String sector;
    public String color;
    public String brand;
    public String exchange;
    public Boolean noTrade;
    public Integer timeToOpen;
    public Boolean isOTC;
    public String symbolType;
    public String marketStartTime;
    public Integer lotSize;
    public String premarketEndTime;
    public String currency;
    public String marketEndTime;
    public String ticker;
    public String timeZone;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
