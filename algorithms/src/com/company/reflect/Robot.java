package com.company.reflect;

public class Robot {
    private String name;
    public void sayHi(String helloSentence){
        System.out.println(helloSentence+" "+name);
    }
    private String throwHello(String tag){
        return "Hello "+tag;
    }
}
