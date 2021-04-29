package Aula7;

public class DateV2 {

    private int day, month, year;

    public DateV2() {
        day = 0;
        month = 0;
        year = 0;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        boolean validation = false;
        if (year % 4 == 0 && year % 100 != 0) {
            validation = true;
        }
        return validation;
    }

    public boolean ValidateMonth() {
        boolean validation = false;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day <= 31) {
                validation = true;
            } else {
                validation = false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                validation = false;
            }
        } else if (month == 2) {
            if (day <= 29 && isLeap()) {
                validation = true;
            } else if (day <= 28 && isLeap() == false) {
                validation = true;
            } else {
                validation = false;
            }
        } else {
            validation = false;
        }
        return validation;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
