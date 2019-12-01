package com.singelton;

public class CEO {

    String name;
    private static CEO instance;// = new CEO();
    private CEO(String str){
        this.name = str;
    }

    public static CEO getInstance(String str){
        if(instance == null)
            instance = new CEO(str);
        return instance;
//        return new CEO(str);
    }

    @Override
    public String toString() {
        return "CEO{" +
                "name='" + name + '\'' +
                '}';
    }
}
