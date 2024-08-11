package Lab6.L61;

public class Undergrad extends Student{
    
    private String year;
    
    public Undergrad(int id,String name,double Gpa,String year){
        super(id,name,Gpa);
        this.year = year;
    }    
    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
       return year;
    }
    public String toString(){
        return "Undergraduate Student : \nID : "+getId()+"\nName : "+getName()+"\nGPA : "+getGpa()+"\nYear : "+getYear()+"\n";    
    }

}
