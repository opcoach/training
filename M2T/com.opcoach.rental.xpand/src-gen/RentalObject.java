public class RentalObject {

	private long ID;

	private String name;

	private org.eclipse.swt.graphics.Image picture;

	long getID() {
		return ID;
	}

	public void setID(long pID) {
		ID = pID;
	}

	String getName() {
		return name;
	}

	public void setName(String pname) {
		name = pname;
	}

	org.eclipse.swt.graphics.Image getPicture() {
		return picture;
	}

	public void setPicture(org.eclipse.swt.graphics.Image ppicture) {
		picture = ppicture;
	}

}
