/*DONE BY:
 SAMBIT SAMAYA SARANGI
 */


package Project_Euler;

public class Euler_7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0,n=2;
while(i<=10001){
	int c=0;
	for(int m=2;m<=n;m++){
		if(n%m==0)
			c++;
		}
	if(c==1)
		i++;
	if(i==10001){
		System.out.println("The 10001st prime number=" +n);
		break;
	}
		
	n++;
}
	}

}
