package com.objects;

public class Date {
    int year, month, day;

    public boolean isValid() {
        if(year > 0 && year < 2019){
            if(month > 0 && month <= 12){
                if(day > 0 && day < 31) {
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
