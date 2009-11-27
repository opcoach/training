public class Address {

	private StreetType streetType;

	private int number;

	private String zipCode;

	private String city;

	private String streetName;

	StreetType getStreetType() {
		return streetType;
	}

	public void setStreetType(StreetType pstreetType) {
		streetType = pstreetType;
	}

	int getNumber() {
		return number;
	}

	public void setNumber(int pnumber) {
		number = pnumber;
	}

	String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String pzipCode) {
		zipCode = pzipCode;
	}

	String getCity() {
		return city;
	}

	public void setCity(String pcity) {
		city = pcity;
	}

	String getStreetName() {
		return streetName;
	}

	public void setStreetName(String pstreetName) {
		streetName = pstreetName;
	}

}
