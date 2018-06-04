package org.qwertech.invest.web.rest;

import org.qwertech.invest.InvestApp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * Test class for the StocksResource REST controller.
 *
 * @see StocksResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = InvestApp.class)
public class StocksResourceIntTest {

    private MockMvc restMockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        StocksResource stocksResource = new StocksResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(stocksResource)
            .build();
    }

    /**
    * Test getStocks
    */
    @Test
    public void testGetStocks() throws Exception {
        restMockMvc.perform(get("/api/stocks-resource/get-stocks"))
            .andExpect(status().isOk());
    }
    /**
    * Test historicalData
    */
    @Test
    public void testHistoricalData() throws Exception {
        restMockMvc.perform(get("/api/stocks-resource/historical-data"))
            .andExpect(status().isOk());
    }

}
