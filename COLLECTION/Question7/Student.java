package COLLECTION.Question7;

public class Student {
	private Integer rollno;
	private String sname;
	private Integer totalmarks;
	
	public Student(Integer rollno, String sname, Integer totalmarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.totalmarks = totalmarks;
	}

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Integer getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(Integer totalmarks) {
		this.totalmarks = totalmarks;
	}

	public Integer getPercentage() {
		return this.totalmarks / 5;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", totalmarks=" + totalmarks + "]";
	}

}
