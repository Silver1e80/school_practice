package ArithmeticException;
import java.util.Scanner;
public class ArithmeticExceptionDemo {
	public static void main(String[] args) {
		Scanner wm = new Scanner(System.in);
		for(int i=0;i<3;i++){
			try{
				System.out.print("�п�J�Ĥ@�Ӽƭ�:");
				int a = Integer.parseInt(wm.nextLine());
				System.out.print("�п�J�ĤG�Ӽƭ�:");
				int b = Integer.parseInt(wm.nextLine());
				System.out.println(a+"/"+b+"="+a/b);
			}
			catch(ArithmeticException e){
				System.out.println("��N�B����~! �p���Ƭ�0!!");
			}
			catch(NumberFormatException e){
				System.out.println("���~! �r��L�k�ন�ƭ�!!");
			}
			System.out.println();
		}
	}

}
