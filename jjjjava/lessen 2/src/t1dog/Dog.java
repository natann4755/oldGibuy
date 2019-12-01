package t1dog;

import java.util.ArrayList;
import java.util.Random;

public class Dog {
    private String breed;
    private int size;
    private String name;
    private int id;
    private  String nameid;



    public Dog (String breed, int size,String name) {
        setBreed(breed);
        setBreed(breed);
        setName(name);
        rando();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameid() {
        return nameid;
    }

    public void setNameid(String nameid) {
        this.nameid = nameid;
    }
    static ArrayList<Integer> idd =new ArrayList<>();

    public void rando (){
        Random r =new Random();
        int rr = r.nextInt(3)+1;
           for (int i = 0; i < idd.size(); i++) {
               if (rr == idd.get(i)) {
                   rr = r.nextInt(3)+1;
                   i=-1;
               }
           }

        idd.add(rr);
        setId(rr);
        setNameid(getName()+" "+rr);
    }
}
