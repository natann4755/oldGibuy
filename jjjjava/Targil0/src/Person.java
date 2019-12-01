public class Person {
   private String M_name;
   private int M_age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return M_name;
    }

    public void setName(String name) {
        M_name = name;
    }

    public int getAge() {
        return M_age;
    }

    public void setAge(int age) {
        M_age = age;
    }
    protected String text() {
        return "name "+ getName()+ " age "+ getAge();
    }
    public void tolk(){
        System.out.println(text());
    }

}
