package concepts;

public class Car {
	private String model;
	private String owner;
	private int plateNo;
	public Car(String model, String owner,int platno) {
		super();
		this.model = model;
		this.owner = owner;
		this.plateNo = platno;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "This Car has model="+model+"\n Owner="+owner+"\n Plate no="+plateNo;
	}
}
