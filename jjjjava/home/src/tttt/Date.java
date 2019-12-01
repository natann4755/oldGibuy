package tttt;

public class Date {
    int day,month,yaer;

    public Date(int day, int month, int yaer) {
        this.day = day;
        this.month = month;
        this.yaer = yaer;
    }
//    public Date (int deyy,int monthy, int yaery ){
//        day=deyy;
//        month=monthy;
//        yaer=yaery;
//    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", yaer=" + yaer +
                '}';
    }
}
