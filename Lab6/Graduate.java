public class Graduate extends Student {
	private String thesisTitle;
	public  Graduate(int id,String name,double gpa,String thesisTitle) {
		super(id,name,gpa);
		this.thesisTitle = thesisTitle;
	}
	public void setThesisTitle(String thesisTitle) {
		this.thesisTitle = thesisTitle;
	}
	public String getThesisTitle() {
		return thesisTitle;
	}
	public String toString() {
		return "Gradute Student : \nID : "+getId()+"\nName : "+getName()+"\nGPA : "+getGpa()+"\nThesis : "+getThesisTitle();
	}
}