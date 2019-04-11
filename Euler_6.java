/*DONE BY:
 SAMBIT SAMAYA SARANGI
 */


package Project_Euler;

public class Euler_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum1=0,sum2=0,sum3=0;
for(int i=1;i<=100;i++){
	sum1+=(i*i);
	sum2+=i;
	
}
sum3=sum2*sum2;
System.out.println(sum3-sum1);
	}

}
