package ArithmeticException;
import java.util.Scanner;
public class ArithmeticExceptionDemo {
	public static void main(String[] args) {
		Scanner wm = new Scanner(System.in);
		for(int i=0;i<3;i++){
			try{
				System.out.print("請輸入第一個數值:");
				int a = Integer.parseInt(wm.nextLine());
				System.out.print("請輸入第二個數值:");
				int b = Integer.parseInt(wm.nextLine());
				System.out.println(a+"/"+b+"="+a/b);
			}
			catch(ArithmeticException e){
				System.out.println("算術運算錯誤! 如除數為0!!");
			}
			catch(NumberFormatException e){
				System.out.println("錯誤! 字串無法轉成數值!!");
			}
			System.out.println();
		}
	}

}
