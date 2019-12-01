package ss;

public class Worker {
    String name;
    String id;
    int salary;


    public Worker(String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void print (){
        System.out.println(name+ " "+ id+" "+salary);
    }


}
