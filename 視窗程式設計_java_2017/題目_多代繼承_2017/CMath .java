package ch07;

public class CMath {
	void getMax(int a,int b){
		if(a>b)
			System.out.println(a+"�P"+b+"���̤j�Ȭ�"+a);
		else
			System.out.println(a+"�P"+b+"���̤j�Ȭ�"+b);
	}
}
class SonCMath extends CMath{
	void getFabonacci(int n){
		int a=0,b=1;
		int temp;
		System.out.printf("�O���ƦC:"+a+", "+b);
		for(int i=0;i<n;i++){
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(", "+b);
		}
		System.out.println();
	}
}
class SonCMath2 extends SonCMath{
	void getFactorial(int n){
		int temp = n;
		for(int i=n-1;i>1;i--){
			temp = temp*i;
		}
		System.out.println(n+"����="+temp);
	}
}