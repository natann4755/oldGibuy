package ss;

public class Manager extends Worker {
    Worker [] workers;


    public Manager(String name, String id, int salary, Worker[] workers) {
        super(name, id, salary);
        this.workers = workers;
    }

        public void print1(){
          //  System.out.println("menegers");
        super.print();
        }

    public void print (){
        super.print();
        System.out.println("he has " + workers.length+" works");
        for (int i = 0; i <workers.length ; i++) {
            workers[i].print();
        }
    }
}
