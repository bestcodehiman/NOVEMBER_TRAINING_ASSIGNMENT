package EXCEPTION_HANDLING.Question6;

public enum HardDiskType {
	SDD(1),
	HDD(2);
	
	public final Integer id;
	
	private HardDiskType(Integer id) {
    	this.id = id;
    }

}
