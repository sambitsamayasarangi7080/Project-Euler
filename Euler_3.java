/*DONE BY: 
 SAMBIT SAMAYA SARANGI
 */


package Project_Euler;

public class Euler_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	long num=600851475143l;
	int i=2;while(i<=num){
		if(num%i==0){
			num/=i;
			
			System.out.println("The largest prime factor=" +i);
		}
	i++;
	}
	
	}

}
