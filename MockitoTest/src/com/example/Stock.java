package com.example;

public class Stock {
    private String stockId;
    private String name;
    private int quantity;

//    public Stock( String stockId, String name, int quantity){
//        this.name = name;
//        this.quantity = quantity;
//        this.stockId = stockId;
//
//    }


    public Stock(String stockId, String name, int quantity) {
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

    public int getQuantity() {
        return quantity;
    }


}
