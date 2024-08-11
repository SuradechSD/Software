package Lab4;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void setday(int day){
        if(day>=1 && day<=31)
            this.day = day;
    }
    public int getday(){
        return day;
    }
    public int getmonth(){
        return month;
    }
    public void setmonth(int month){
        if(month>=1 && month<=12)
            this.month = month;
    }
    public int getyear(){
        return year+543;
    }
    public void setyear(int year){
            this.year = year;
    }
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }
}
