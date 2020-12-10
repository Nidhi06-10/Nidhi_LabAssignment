import java.util.HashMap;
import java.util.Map.Entry;

class Country{
	HashMap<String, String> countryMap;
	public Country() {
		countryMap = new HashMap<String, String>();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Country{"
				+ "countryMap="+countryMap+
				 "}";
	}
	
	public HashMap<String, String> addCountryCapital(String countryName,String capital){
		countryMap.put(countryName, capital);
		return countryMap;
	}
	
	public String getCapital(String countryName) {
		String capital = null;
		if(countryMap.containsKey(countryName)) {
			capital = countryMap.get(countryName);
		}
		return capital;
	}
	
	public String getCountry(String capitalName) {
		String country = null;
		for(Entry<String, String> entry:countryMap.entrySet()) {
			if(entry.getValue().equals(capitalName)) {
				country = entry.getKey();
			}
		}
		return country;
	}
	
	public HashMap<String, String> swapKeyValue(){
		HashMap<String, String> worldMap = new HashMap<String, String>();
		for(Entry<String, String> entry:countryMap.entrySet()) {
			worldMap.put(entry.getValue(),entry.getKey());
		}
		return worldMap;
	}
}

public class Source {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country country = new Country();
		country.addCountryCapital("India", "Delhi");
		country.addCountryCapital("United Kingdom", "London");
		
		System.out.println(country.getCapital("United Kingdom"));
		System.out.println(country.getCountry("Delhi"));
		System.out.println(country.swapKeyValue());
	}

}