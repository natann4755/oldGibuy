package tttt;

import com.company.home.Date;

public class Parson {
    String name,id;
    Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parson{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", date=" + date +
                '}';

    }
    public boolean howBiggre (com.company.home.Parson oo){
        return date.getLater(oo.date);
    }
}
