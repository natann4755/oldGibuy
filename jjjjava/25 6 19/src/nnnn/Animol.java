package nnnn;

public class Animol {
    private String title = "base:Animal";
    protected int age;

    public void setAge(int age) {
        if (age>0){
            this.age = age;}
    }
    public void move(){
        System.out.println("Animol");
    }

    @Override
    public String toString() {
        return "Animol{" +
                "title='" + title + '\'' +
                ", age=" + age +
                '}';
    }
}

