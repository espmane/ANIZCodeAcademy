package Lesson04.Dato;

public class Dato {
    final int day;
    final int month;
    final int year;

    // constructor
    public Dato(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Figure out the date
    public String convert(boolean european) {

        if (european) {
            return String.format("%d %s, %d", day, getMonthName(month), year);
        } else {
            return String.format("%s %d, %d", getMonthName(month), day, year);
        }
    }

    public String getMonthName(int month) {
        if (month == 1) {
            return "Januar";
        }
        if (month == 2) {
            return "Februar";
        }
        if (month == 3) {
            return "Marts";
        }
        if (month == 4) {
            return "April";
        }
        if (month == 5) {
            return "Maj";
        }
        if (month == 6) {
            return "Juni";
        }
        if (month == 7) {
            return "Juli";
        }
        if (month == 8) {
            return "August";
        }
        if (month == 9) {
            return "September";
        }
        if (month == 10) {
            return "Oktober";
        }
        if (month == 11) {
            return "November";
        }
        if (month == 12) {
            return "December";
        }
        return "Ugyldig måned: " + month;
    }
}