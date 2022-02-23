package com.company;

public class Phone extends Device{
  public final   String producer;
    public final String model;
    public final Double screenSize;
    public  String os;


    Phone(String producer, String model, Double screenSize, String os){
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
        this.os = os;
    }

}
