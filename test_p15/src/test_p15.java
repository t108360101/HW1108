
public class test_p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1=new Car();
		 int number=1234;
		 double gasoline=20.5;
		 car1.setNumGas(number, gasoline);
		 
		
	}

}
class Car
{
	int num;
	double gas; 
	void setNumGas(int n, double g) {
		num=n;
		gas=g;
	System.out.println("將車號設為"+num+"將汽油設為"+gas);

	}
	void show() {
		System.out.println("車號是"+this.num);
	    System.out.println("汽油量是"+this.gas);

	}

}