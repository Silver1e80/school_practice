
public class Main {

	public static void main(String[] args) {
		CStudent Peter = new CStudent();
		CStudent David = new CStudent(300);
		CStudent Mary = new CStudent(180,78);
		
		System.out.println("Peter的資料\n"+" 身高是:"+Peter.Height+"\n 體重是:"+Peter.Weigth);
		System.out.println("David的資料\n"+" 身高是:"+David.Height+"\n 體重是:"+David.Weigth);
		System.out.println("Mary的資料\n"+" 身高是:"+Mary.Height+"\n 體重是:"+Mary.Weigth);
	}

}
