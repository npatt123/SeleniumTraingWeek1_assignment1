package week1.Day2;

public class TwoWheeler {
	
	 int noOfWheels = 2;
	 short noOfMirrors =2;
	 long chassisNumber = 12345678;
	 boolean isPunctured = false;
	 String bikeName = "HondaCity";
	 double runningKM = 150.2;

	public  static void main(String[] args) {
		
		
		TwoWheeler obj= new TwoWheeler();
		String bName= obj.bikeName;	
		int wheels = obj.noOfWheels;
		long cNumber = obj.chassisNumber;
		boolean isPunctu= obj.isPunctured;
		double rKM= obj.runningKM;
		
		System.out.println(bName);
	    System.out.println(wheels);
	    System.out.println(cNumber);
	    System.out.println(isPunctu);
	    System.out.println(rKM);
	}
}
