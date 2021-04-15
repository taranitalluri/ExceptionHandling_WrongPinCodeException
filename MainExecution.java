package DAY7;


public class MainExecution {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();
		CityService service1 = new CityService();
		try {
			String cityCodes[] = service.getCityCodes();
			for(int i =0; i<codes.length;i++) {	
				service1.doCheckCity(codes[i],cityCodes[i]);

			}
		}
		catch(Exception e){
			System.out.println(e);
		}
/*for (String empid : codes) {
System.out.println(empid);
}
for (String depid : ids) {
System.out.println(depid);
}*/
/*for (String cityCode : cityCodes) {
System.out.println(cityCode);
}*/
}//end main
}//end class
//Perform the following operation
// Question 1

//Following is the new requirement from Client
// Print employee id with their respective job location
// for example
// 101 : Delhi
// 102 : Mumbai
// and so on