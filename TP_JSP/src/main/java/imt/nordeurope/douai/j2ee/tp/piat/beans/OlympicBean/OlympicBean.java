package imt.nordeurope.douai.j2ee.tp.piat.beans.OlympicBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OlympicBean {

	private List<String> countries;


	public OlympicBean() {
		countries = new ArrayList<>();
		countries.add("France");
		countries.add("Allemagne");
		countries.add("USA");
	}

	public List<String> getCountries() {
		return countries;
	}

	public String getCountry(int indice) {
		List<String> liste = this.getCountries();
		String country = liste.get(indice);
		return country;
	}


	public Integer getMedalsCountCountry(String country) {
		Integer medals = 0;
		switch (country) {
		case "France":
			medals = 17;
			break;
		case "Allemagne":
			medals = 28;
			break;
		case "USA":
			medals = 34;
			break;
		}
		return medals;
	}

	public String getCapitalesCountry(String country) {
		String capitales ="";
		switch (country) {
		case "France":
			capitales = "Paris";
			break;
		case "Allemagne":
			capitales ="Berlin";
			break;
		case "USA":
			capitales= "Washington";
			break;
		}
		return capitales;
	}

}