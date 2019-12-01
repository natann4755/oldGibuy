package targil;

public class Otobus extends Cars {
    private String color;

    public Otobus(String name, int praise, int sits, Date date, String colore) {
        super(name, praise, sits, date);
        setColor(colore);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("bleu")||) {

        }
        this.color = color;
    }
}

