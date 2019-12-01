public class Cids extends Person {
   private Toy M_toy;

    public Cids(String name, int age, Toy m_toy) {
        super(name, age);
        setM_toy(m_toy);
    }

    public Toy getM_toy() {
        return M_toy;
    }

    public void setM_toy(Toy toy) {
        M_toy = toy;
    }

    @Override
    protected String text(){
        return super.text()+ "toy: "+getM_toy().getName()+",cloro: "+getM_toy().getColor()+",age: "+getM_toy().getM_age();
    }



}
