
public class Main {

	public static void main(String[] args) {
		CStudent Peter = new CStudent();
		CStudent David = new CStudent(300);
		CStudent Mary = new CStudent(180,78);
		
		System.out.println("Peter�����\n"+" �����O:"+Peter.Height+"\n �魫�O:"+Peter.Weigth);
		System.out.println("David�����\n"+" �����O:"+David.Height+"\n �魫�O:"+David.Weigth);
		System.out.println("Mary�����\n"+" �����O:"+Mary.Height+"\n �魫�O:"+Mary.Weigth);
	}

}
