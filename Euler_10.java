/*DONE BY:
 SAMBIT SAMAYA SARANGI
 */

package Project_Euler;

public class Euler_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long sum=0,c=0;
for(int i=2;i<2000000;i++){
	c=0;
	for(int j=2;j<=i;j++){
		if(i%j==0){
			
		
			c++;
		}
		}
		if(c==1){
			sum=sum+i;
		}
	}
	System.out.println(sum);
}
	}


