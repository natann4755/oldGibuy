package com.constructors;

public class Date {

    int day, month, year = 1990;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(int year) {
        this.year = year;
    }

    public void incrementDay() {
        int day = 900;
        if(getMaxDays() >= this.day + 1){
            this.day++;
        } else {
            if(month == 12){
                month = 1;
                year ++;
            } else {
                month ++;
            }
            this.day = 1;
        }
    }

    public boolean isLater(Date other){
        // return year != other.year ? year > other.year : month != other.month ? month > other.month : day > other.day;
        if(year != other.year){
            return year > other.year;
        }else if(month != other.month){
            return month > other.month;
        }else {
            return day > other.day;
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


    public String getDate() {
        return day + "/" + month +"/" + year;
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
