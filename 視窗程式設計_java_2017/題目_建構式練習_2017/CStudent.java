
public class CStudent {
	public int Height = 150,Weigth =40;
	
	CStudent(){
		Height = 150;
		Weigth =40;
	}
	CStudent(int H){
		if(H>=130 && H<=280){
			Height=H;
		}
	}
	CStudent(int H,int W){
		if(H>=130 && H<=280){
			Height = H;
			Weigth = W;
		}
	}
}
