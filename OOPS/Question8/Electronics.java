package OOPS.Question8;

public class Electronics {
	public int id;
	public String semiconductorType;
	public String dateOfManufacturing;

	public Electronics(int id, String semiconductorType, String dateOfManufacturing) {
		this.id = id;
		this.semiconductorType = semiconductorType;
		this.dateOfManufacturing = dateOfManufacturing;
	}

	@Override
	public String toString() {
		return "Electronics{" + "id=" + id + ", semiconductorType='" + semiconductorType + '\''
				+ ", dateOfManufacturing='" + dateOfManufacturing + '\'' + '}';
	}
}
