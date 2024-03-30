package lang.immutable.test;

public class ImmuableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmuableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmuableMyDate withYear(int year){
        return new ImmuableMyDate(year, this.month, this.day);
    }

    public ImmuableMyDate withMonth(int month){
        return new ImmuableMyDate(this.year, month, this.day);
    }

    public ImmuableMyDate withDay(int day){
        return new ImmuableMyDate(this.year, this.month, day);
    }

    @Override
    public String toString() {
        return year + " - " + month + " - " + day;
    }
}
