package com.company;

public class Animal {
    private String title = "base Animal";
     protected int age;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
        this.age = age;}
    }
     public void move(){
        System.out.println("Animal");
         System.out.println(title);
     }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Animal{");
        sb.append("title='").append(title).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
