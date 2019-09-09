package com.example.demo;

/**
 * 懒汉式单例模式
 */
public class LHSSingle {
    private static volatile LHSSingle instance;
    private LHSSingle(){};

    public static LHSSingle getInstance(){
        if(instance==null){
            synchronized (LHSSingle.class){
                if(instance==null){
                    instance = new LHSSingle();
                }
            }
        }
        return instance;
    }

}
