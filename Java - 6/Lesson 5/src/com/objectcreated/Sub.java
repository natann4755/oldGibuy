package com.objectcreated;

public class Sub extends Base {

    String subString = MyClass.print("init subString var");
    String n = "defaultName";

    public Sub() {
        super("");
        System.out.println("Sub.constructor command");
    }
}
