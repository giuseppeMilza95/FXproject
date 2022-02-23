package com.example.MockitoDemo;

import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import static  org.mockito.Mockito.*;

public class PortfolioTest {
    private Portfolio portfolio;
    private StockService stockService;


    public PortfolioTest() {
        portfolio = new Portfolio();
        stockService = mock(StockService.class);
    }


    @org.junit.Test
    public void getMarketValue() {
        List<Stock> stocks = new ArrayList<>();
        Stock microsoftStock = new Stock("2","Microsoft",100);
        Stock googleStock = new Stock("1","Google", 10);
        stocks.add(googleStock);
        stocks.add(microsoftStock);

        portfolio.setStocks(stocks);


        //when(stockService.getPrice(googleStock)).thenReturn(50.0);
        //when(stockService.getPrice(microsoftStock)).thenReturn(1000.0);
        assertEquals(1000.00,portfolio.getMarketValue(),0);
        verify(stockService.getPrice(new Stock("1","Google", 10.0).getQuantity()));


    }
}