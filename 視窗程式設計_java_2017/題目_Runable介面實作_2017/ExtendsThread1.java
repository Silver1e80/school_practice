class MyThread extends Thread{
	int i=0,m;
	String threadName;
	MyThread(String name,int a){
		m=a;
		threadName=name;
	}
	
	public void run(){
		while(true){
			i++;
			System.out.println(threadName+"�����"+i+"��");
			try{
				sleep(m);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			if(i>=5)
				break;
		}
	}
}
public class ExtendsThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread obT1=new MyThread("�����1",500);
		MyThread obT2=new MyThread("�����2",2000);
		obT1.start();
		obT2.start();
	}

}
