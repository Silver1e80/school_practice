package tue2;

public class CMath {
	void getMax(int a, int b){
		if(a>b)
			System.out.println(a+" �P "+b+"���̤j�Ƭ�"+a);
		else
			System.out.println(a+" �P "+b+"���̤j�Ƭ�"+b);
	}
}

class SonCMath extends CMath{
	void getFabonacci(int n){
		int a=0, b=1;
		int temp;
		System.out.print("�O���ƦC: "+a+", "+b);
		
		for(int i=2;i<=n;i++){
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(", "+b);
		}
		System.out.println();
	}
}