/*DONE BY:
 SAMBIT SAMAYA SARANGI
 */

package Project_Euler;

public class Euler_4 {

	
public static boolean Palindrome(int p1){
	int reverse=0,rem;
	int t=p1;
	while(p1>0){
		rem=p1%10;
		reverse=reverse*10+rem;
		p1/=10;
	}
	return t==reverse;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
int mpalin=-1;
for(int i=100;i<1000;i++){
for(int j=100;j<1000;j++){
	int pro=i*j;
	if(Palindrome(pro)&&pro>mpalin)
		mpalin=pro;
}
}
System.out.println("The largest palindrome made from the product of two 3-digit numbers=" +mpalin);
}

	}


