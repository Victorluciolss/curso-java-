package entites;

public class Company extends TaxPlayer {

	private int numberOfEmployees;

	public Company() {
		super();
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public Company(String name, Double anuallncome, int numberOfEmployees) {
		super(name, anuallncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if (numberOfEmployees > 10) {
			return getAnuallncome() * 0.14;
		}
		else {
			return getAnuallncome() * 0.16;
		}
	}

}
