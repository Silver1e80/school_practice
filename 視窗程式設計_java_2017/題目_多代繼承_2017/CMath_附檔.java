package tue2;

public class CMath {
	void getMax(int a, int b){
		if(a>b)
			System.out.println(a+" 籔 "+b+"程计"+a);
		else
			System.out.println(a+" 籔 "+b+"程计"+b);
	}
}

class SonCMath extends CMath{
	void getFabonacci(int n){
		int a=0, b=1;
		int temp;
		System.out.print("禣Α计: "+a+", "+b);
		
		for(int i=2;i<=n;i++){
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(", "+b);
		}
		System.out.println();
	}
}