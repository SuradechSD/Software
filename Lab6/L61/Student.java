package Lab6.L61;

public class Student {
    private String name;
    private int id;
    private double Gpa;

    public Student(int id,String name,double Gpa){
        this.id = id;
        this.name = name;
        this.Gpa = Gpa;
    }
    public Student(int id,double Gpa){
        this.id = id;
        this.name = " ";
        this.Gpa = Gpa;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return Gpa;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }    
    public String toString(){
		return "Student : \nID : "+getId()+"\nName : "+getName()+"\nGPA : "+getGpa()+"\n";
    }
}