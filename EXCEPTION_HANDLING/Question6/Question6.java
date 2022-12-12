package EXCEPTION_HANDLING.Question6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question6 {
	public static void main(String args[]) throws NumberFormatException, IOException, HardDiskNotSupportedException,
			InsufficientDiskSpaceException, MisMatchHardDiskException, LowerRAMSizeException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please select the processor no : ");
		for (SystemType value : SystemType.values()) {
			System.out.println(value.id + ". " + value.name());
		}
		SystemType selectedSystemType = null;
		Integer selectedSystemTypeNo = Integer.parseInt(bf.readLine());
		for (SystemType value : SystemType.values()) {
			if (selectedSystemTypeNo == value.id) {
				selectedSystemType = value;
				break;
			}
		}
		System.out.println("Enter no of type of disk to be used : ");
		for (HardDiskType value : HardDiskType.values()) {
			System.out.println(value.id + ". " + value.name());
		}
		HardDiskType selectedHardDiskType = null;
		Integer selectedHardDiskTypeNo = Integer.parseInt(bf.readLine());
		for (HardDiskType value : HardDiskType.values()) {
			if (selectedHardDiskTypeNo == value.id) {
				selectedHardDiskType = value;
				break;
			}
		}
		if (!selectedHardDiskType.equals(selectedSystemType.diskType)) {
			if (selectedHardDiskType.equals(HardDiskType.HDD)) {
				throw new MisMatchHardDiskException();
			} else {
				throw new HardDiskNotSupportedException();
			}
		}
		System.out.println("Select the disk size needed for System : ");
		Integer enteredDiskSize = Integer.parseInt(bf.readLine());
		if (selectedSystemType.diskSize > enteredDiskSize) {
			throw new InsufficientDiskSpaceException();
		}
		System.out.println("Select the RAM size needed for System : ");
		Integer enteredDiskRam = Integer.parseInt(bf.readLine());
		if (selectedSystemType.ramSize > enteredDiskRam) {
			throw new LowerRAMSizeException();
		}
		System.out.println("System successfully Configured");
	}

}
