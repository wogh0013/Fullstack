package w1208��Ƽ������;

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
		mt1.start(); //run�� ���� ���� ȣ������ �ʴ´�. start�� ȣ���ؾ� �����尡 ���ư���.
	}
}
