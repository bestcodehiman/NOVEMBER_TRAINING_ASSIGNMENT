package EXCEPTION_HANDLING.Question6;

public enum SystemType {
	I3(1, HardDiskType.SDD, 250, 4),
	I5(2, HardDiskType.SDD, 250, 4),
	I7(3, HardDiskType.SDD, 250, 4),
	DUAL_CORE(4, HardDiskType.HDD, 160, 1),
	QUAD_CORE(5, HardDiskType.HDD, 160, 1),
	CORE_TO_DUAL(6, HardDiskType.HDD, 160, 1);
	
	public final Integer id;
	public final HardDiskType diskType;
	public final Integer diskSize;
	public final Integer ramSize;

    private SystemType(Integer id, HardDiskType diskType, Integer diskSize, Integer ramSize) {
    	this.id = id;
    	this.diskType = diskType;
        this.diskSize = diskSize;
        this.ramSize = ramSize;
    }

}
