package com.example.demo;

public class EHSSingle {
    private static final  EHSSingle INSTANCE = new EHSSingle();
    private EHSSingle(){}
    public static EHSSingle getInstance(){
        return  INSTANCE;
    }
}
