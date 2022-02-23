package com.example.MockitoDemo;

public class Stock {
    private String stockId;
    private String name;
    private double quantity;

//    public Stock( String stockId, String name, int quantity){
//        this.name = name;
//        this.quantity = quantity;
//        this.stockId = stockId;
//
//    }


    public Stock(String stockId, String name, double quantity) {
        this.stockId = stockId;
        this.name = name;
        this.quantity = quantity;
    }



    public String getTicker(){
        return this.name;
    }




    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public double getQuantity() {
        return quantity;
    }


}
