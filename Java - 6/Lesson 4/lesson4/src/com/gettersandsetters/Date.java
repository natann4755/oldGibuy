package com.gettersandsetters;

public class Date {
    private int day = 1, month = 1, year = 1990;
    public Date (){

    }

    public Date(int day, int month, int year) {
      //  this day= 40;
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day > 0 && day <= getMaxDays()){
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12){
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 1900 && year <= 2019){
            this.year = year;
        }
    }

    public int getMaxDays() {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2: default:
                return year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ? 29 : 28;
        }
    }


    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
