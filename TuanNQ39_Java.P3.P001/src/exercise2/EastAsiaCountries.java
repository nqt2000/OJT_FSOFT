package exercise2;

public class EastAsiaCountries extends Country implements Comparable<Country> {
	private String countryTerrain;
	public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
		super(countryCode, countryName, totalArea);
		this.countryTerrain = countryTerrain;
	}
	
	public EastAsiaCountries() {
		
	}

	public String getCountryTerrain() {
		return countryTerrain;
	}

	public void setCountryTerrain(String countryTerrain) {
		this.countryTerrain = countryTerrain;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.format("%1$-15s %2$-15s %3$-15s %4$-15s \n", "ID", "Name", "Total Area", "Terrain");
		System.out.format("%1$-15s %2$-15s %3$-15s %4$-15s \n", this.countryCode, this.countryName, this.totalArea, this.countryTerrain);
	}

	public int compareTo(Country t) {
		return this.getCountryName().compareTo(t.countryName);
	}
}
