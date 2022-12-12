package OOPS.Question1;

public class Department {
	private Integer deptId;
	private String dname;

	public Department(Integer deptId, String dname) {
		this.deptId = deptId;
		this.dname = dname;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}
