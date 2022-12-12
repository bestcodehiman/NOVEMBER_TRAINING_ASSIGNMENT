package OOPS.Question3;

public class Customer {

	private int CustId;
	private int accountno;
	private String custname;
	private String cust_dob;
	private String cust_account_opening_date;

	Branch Branch_Obj = new Branch(66, "Pune Branch", "Near Dewan Hospital");
	//

	public Customer(int custId, int accountno, String custname, String cust_dob, String cust_account_opening_date,
			String branch_Obj) {
		super();
		CustId = custId;
		this.accountno = accountno;
		this.custname = custname;
		this.cust_dob = cust_dob;
		this.cust_account_opening_date = cust_account_opening_date;

	}

	public int getCustId() {
		return CustId;
	}

	public void setCustId(int custId) {
		CustId = custId;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCust_dob() {
		return cust_dob;
	}

	public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}

	public String getCust_account_opening_date() {
		return cust_account_opening_date;
	}

	public void setCust_account_opening_date(String cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}

	public Branch getBranch_Obj() {
		return Branch_Obj;
	}

	public void setBranch_Obj(Branch branch_Obj) {
		Branch_Obj = branch_Obj;
	}

	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", accountno=" + accountno + ", custname=" + custname + ", cust_dob="
				+ cust_dob + ", cust_account_opening_date=" + cust_account_opening_date + ", Branch_Obj=" + Branch_Obj
				+ "]";
	}

}
