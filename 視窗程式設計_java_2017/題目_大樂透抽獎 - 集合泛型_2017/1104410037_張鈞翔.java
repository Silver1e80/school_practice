package src;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> test = new TreeSet<>();
		int order = 1;
		while(order<=6){
			int num = (int)(Math.random()*49)+1;
			if(test.add(num))order++;
		}
		System.out.println("���Ӹ��X���O��:");
		System.out.println(test);
	}
}
