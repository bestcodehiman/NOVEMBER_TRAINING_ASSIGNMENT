package OOPS.Question1;

import java.util.Date;

public class Customer extends Person {
	private Date dateOfRegistration;
	private String deliveryAddress;
	private String contactNo;
	private String emailId;

	@Override
	public String toString() {
		return "Customer [dateOfRegistration=" + dateOfRegistration + ", deliveryAddress=" + deliveryAddress
				+ ", contactNo=" + contactNo + ", emailId=" + emailId + ", pid=" + super.getPid() + ", pname="
				+ super.getPname() + ", paddress=" + super.getPaddress() + ", dob=" + super.getDob() + "]";
	}

	public Customer(Integer pid, String pname, String paddress, Date dob, Date dateOfRegistration,
			String deliveryAddress, String contactNo, String emailId) {
		super.setPid(pid);
		super.setPname(pname);
		super.setPaddress(paddress);
		super.setDob(dob);
		this.dateOfRegistration = dateOfRegistration;
		this.deliveryAddress = deliveryAddress;
		this.contactNo = contactNo;
		this.emailId = emailId;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
