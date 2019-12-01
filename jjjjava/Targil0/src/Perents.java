public class Perents extends Person {
   private String M_jab;

    public Perents(String name, int age, String jab) {
        super(name, age);
        setM_jab(jab);
    }

    public String getM_jab() {
        return M_jab;
    }

    public void setM_jab(String jab) {
        M_jab = jab;
    }

    @Override
    protected String text(){
        return super.text() + " ,job :" + M_jab;
    }

    }

