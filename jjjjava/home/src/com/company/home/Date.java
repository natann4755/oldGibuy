package com.company.home;

public class Date {
    int year, month,dey;

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", dey=" + dey +
                '}';
    }
    public boolean getLater(Date outher){
        if (outher.year<year) {
            return  true; }
            if (outher.year>year){
            return false;}
            if (outher.year==year){
                if (outher.month<month) {
                    return  true; }
                if (outher.month>month  ){
                    return false;}
                if (outher.month==month){
                    if (outher.dey<dey     ) {
                        return  true; }
                    if (outher.dey>dey||outher.dey==dey){
                        return false;}
                }
            }
           return false;

    }
    public static Date incrementDay (Date plus) {
        if (plus.dey < 30) {
            plus.dey ++;
        }
            else {
                if (plus.month<12){
                plus.month ++;
                plus.dey = 1;
            }
                else {
                    plus.year ++;
                    plus.month = 1;
                    plus.dey =1;
                }

        }
        return plus;
    }
}
