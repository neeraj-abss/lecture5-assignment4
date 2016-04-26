abstract class Bank{

abstract void getRateOfInterest(float interest);
}

class Sbibank extends Bank{

	void getRateOfInterest(float interest){
System.out.println("Calling sbi class"+interest);
	}

}
class IciciBank extends Bank{
void getRateOfInterest(float interest){
System.out.println("Calling iiiccc class"+interest);
	}
}
class Hdfcbank extends Bank{
void getRateOfInterest(float interest){
System.out.println("Calling hdfc class"+interest);
	}
}

public class assignment4 {

	public static void main(String[] args){
		Sbibank b2= new Sbibank();
		IciciBank b3= new IciciBank();
		Hdfcbank b4= new Hdfcbank();
		b4.getRateOfInterest(5);
		b3.getRateOfInterest(6);
		b2.getRateOfInterest(7);
	}
}