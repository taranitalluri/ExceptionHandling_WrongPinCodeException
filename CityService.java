package DAY7;


public class CityService {
	public void doCheckCity(String code,String cityCode) throws CityException{
		if(cityCode.equals("011")) {
			System.out.println(code+" "+" Delhi");
		} else if(cityCode.equals("022")) {
			System.out.println(code+" "+" Banglore");
		} else if(cityCode.equals("080")) {
			System.out.println(code+" "+" Mumbai");
		} else if(cityCode.equals("020")) {
			System.out.println(code+" "+" Pune");
		} else {
			throw new CityException(" For code "+cityCode+" there is no city");
		}
	}

	
}
