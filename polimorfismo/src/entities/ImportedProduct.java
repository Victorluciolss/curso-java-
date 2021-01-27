package entities;

public class ImportedProduct extends Product {
	
	private Double customsfree;
	

	public ImportedProduct(String name, Double price, double customsfree) {
		super(name, price);
		this.customsfree = customsfree;
	}

	public double getCustomsfree() {
		return customsfree;
	}

	public void setCustomsfree(double customsfree) {
		this.customsfree = customsfree;
	}
	
	public Double totalPrice() {
		return getPrice() + customsfree;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ " (Customs fee: $ " 
				+ String.format("%.2f", customsfree)
				+ ")";
	}
}