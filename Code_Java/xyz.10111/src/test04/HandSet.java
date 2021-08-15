package test04;

public abstract class HandSet {
	private String brand;
	private String species;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public abstract void call();
	 public abstract void sendInfo();
	@Override
	public String toString() {
		return "HandSet [brand=" + brand + ", species=" + species + "]";
	}
	 
}
