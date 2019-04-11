/*DONE BY:
 SAMBIT SAMAYA SARANGI
 */

package Project_Euler;

public class Euler_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=1,n=2,s=0,sum=0;
		int i=1;
		
		while(s<4000000){
			System.out.println(m);
			System.out.println(n);
			s=m+n;
			if(m%2==0){
				sum+=m;
			}
			if(n%2==0){
				sum+=n;
			}
			if(s%2==0){
				sum+=s;
			}
			System.out.println(s);
			m=s+n;
			n=s+m;
			i++;
		}
		
		System.out.println("The sum of the even-valued terms=" +sum);
	}

}



