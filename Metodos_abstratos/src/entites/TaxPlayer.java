package entites;

public abstract class TaxPlayer {

	private String name;
	private Double anuallncome;

	public TaxPlayer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnuallncome() {
		return anuallncome;
	}

	public void setAnuallncome(Double anuallncome) {
		this.anuallncome = anuallncome;
	}

	public TaxPlayer(String name, Double anuallncome) {
		this.name = name;
		this.anuallncome = anuallncome;
	}

	public abstract double tax();
}
