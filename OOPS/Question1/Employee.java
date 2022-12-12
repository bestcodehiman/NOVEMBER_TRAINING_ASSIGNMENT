package OOPS.Question1;

import java.util.Date;

public class Employee extends Person {

	private Integer salary;
	private Date dateOfJoining;
	private String baseLocation;
	private Department deptObj;
	private String contactNo;
	private String EmailId;

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dateOfJoining=" + dateOfJoining + ", baseLocation=" + baseLocation
				+ ", deptObj=" + deptObj + ", contactNo=" + contactNo + ", EmailId=" + EmailId + ", pid="
				+ super.getPid() + ", pname=" + super.getPname() + ", paddress=" + super.getPaddress() + ", dob="
				+ super.getDob() + "]";
	}

	public Employee(Integer salary, Date dateOfJoining, String baseLocation, Department deptObj, String contactNo,
			String emailId, Integer pid, String pname, String paddress, Date dob) {
		super.setPid(pid);
		super.setPname(pname);
		super.setPaddress(paddress);
		super.setDob(dob);
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.baseLocation = baseLocation;
		this.deptObj = deptObj;
		this.contactNo = contactNo;
		EmailId = emailId;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public Department getDeptObj() {
		return deptObj;
	}

	public void setDeptObj(Department deptObj) {
		this.deptObj = deptObj;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return EmailId;
	}

	public void setEmailId(String emailId) {
		EmailId = emailId;
	}

}
