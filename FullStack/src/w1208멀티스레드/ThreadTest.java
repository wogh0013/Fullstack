package w1208멀티스레드;

class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		mt1.start(); //run을 절대 직접 호출하지 않는다. start로 호출해야 스레드가 돌아간다.
	}
}
