/*DONE BY:
 SAMBIT SAMAYA SARANGI
 */

package Project_Euler;

public class Euler_5 {
	
	public static int lcm(int m,int n){
		int pro=1;
		pro=m*n;
		while(n>0){
			int rem=m%n;
			m=n;
			n=rem;
		}
		int lcm=pro/m;
		return lcm;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ans=1;
for(int i=1;i<=20;i++){
	ans=lcm(ans,i);
	
}
System.out.println(ans);
		
}
}
