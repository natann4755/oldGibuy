package targil;
|
public class Cars {
    private String name;
    private int prais;
    private int sits;
    private Date date;

    private Cars(String name, int prais) {
        this.name = name;
        this.prais = prais;
    }

    public Cars(String name, int prais, int sits, Date date) {
        this(name, prais);
        setSits(sits);
        setDate(date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrais() {
        return prais;
    }

    public void setPrais(int prais) {
        this.prais = prais;
    }

    public int getSits() {
        return sits;
    }
74856+
    public void setSits(int sits) {
        this.sits = sits;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
