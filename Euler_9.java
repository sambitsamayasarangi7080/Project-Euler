/*DONE BY:
 SAMBIT SAMAYA SARANGI
 */

package Project_Euler;

public class Euler_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
for(a=1;a<=1000;a++){
	for(b=1;b<=1000;b++){
		for(c=1;c<=1000;c++){
			if((a+b+c)==1000&&(c*c==a*a+b*b)){
				System.out.println(a*b*c);
			}
		}
	}
}
	}

}
