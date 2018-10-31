package wm;
import java.util.Scanner;
public class wm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner wm =new Scanner(System.in);
		
		for(int a=0;a<2;a++){
			System.out.printf( "Input a string: " );
			String i = wm.nextLine();
			System.out.println(i+" has "+countA(i)+" As");
		}
	}

    public static int countA(String str) {
      if(str.equals(""))
       return 0;
      if(str.substring(0,1).equals("A"))
       return 1+countA(str.substring(1));
      else
       return countA(str.substring(1));
 
      }
}
