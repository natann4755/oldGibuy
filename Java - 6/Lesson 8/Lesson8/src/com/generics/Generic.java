package com.generics;

public class Generic <TY extends  Person> {

    TY var;

    public void setVar(TY var) {
        this.var = var;
    }

    public TY getVar() {
        return var;
    }
}
