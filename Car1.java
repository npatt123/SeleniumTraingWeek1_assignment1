package week1.Day2;

public class Car1 {
	
	public void applyBreak() {
	   System.out.println("breakapplied");
		
	}
	
	public void applyGear() {
		System.out.println("gearapplied");
		
	}
	
	public void  switchOnAc() {
		System.out.println("switchedonAC");
		
	}
	
	public void applyAcclerate() {
		System.out.println("acceleratorapplied");
		
	}
	//
	
	/*applyBreak()
	 applyGear()
	 switchOnAc()
	 applyAcclerate()
	 create object and excute for same class
	 create new class as MyCar class and create object for existing class and excute*/
	
	public static void main(String[] args) {
		
		Car1 obj = new Car1();
		obj.applyBreak();
		obj.applyGear();
		obj.applyAcclerate();
		obj.switchOnAc();
		
	}

	
	

}
