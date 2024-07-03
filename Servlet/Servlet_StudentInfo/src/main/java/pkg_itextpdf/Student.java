package pkg_itextpdf;

public class Student {
	private int sid;
	private String fullName;
	private String course;
	private String section;
	private int sub1;
	private int sub2;
	private int total;
	private int average;
	private String result;
	
	public Student() {		
		this.sid = 0;
		this.fullName = "";
		this.course = "";
		this.section = "";
		this.sub1 = 0;
		this.sub2 = 0;
		this.total = 0;
		this.average = 0;
		this.result = "";
	}
	
	public Student(int sid, String fullName, String course, String section, int sub1, int sub2, int total, int average,
			String result) {		
		this.sid = sid;
		this.fullName = fullName;
		this.course = course;
		this.section = section;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.total = total;
		this.average = average;
		this.result = result;
	}
	
	public Student(Student student) {		
		this.sid = student.sid;
		this.fullName = student.fullName;
		this.course = student.course;
		this.section = student.section;
		this.sub1 = student.sub1;
		this.sub2 = student.sub2;
		this.total = student.total;
		this.average = student.average;
		this.result = student.result;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fullName=" + fullName + ", course=" + course + ", section=" + section
				+ ", sub1=" + sub1 + ", sub2=" + sub2 + ", total=" + total + ", average=" + average + ", result="
				+ result + "]";
	}	
}