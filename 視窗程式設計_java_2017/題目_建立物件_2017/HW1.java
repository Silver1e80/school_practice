
public class HW1 {

	public static void main(String[] args) {
		Ccar car1 = new Ccar();
		car1.gas=40.7;
		car1.tbo=13.6;
		double oil = car1.gas;
		car1.MaxDist();
		double distance = car1.Dist(10);
		
		System.out.println("car1�T����T:");
		System.out.println("�̤j���o�q: "+car1.gas+" L");
		System.out.println("�����Ӫo�q: "+car1.tbo+" km/L");
		System.out.println("�[���o�i��p "+car1.max_dist+" km");
		System.out.println("�[�o10L�i��p "+distance+" km");
	}

}
