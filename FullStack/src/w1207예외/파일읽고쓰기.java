package w1207����;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class �����а��� {
	public static void main(String[] args) {
		
		try {
			File file;
			file = new File("test.txt");
			FileInputStream fis = new FileInputStream(file);
			byte[] b = new byte[40];
			fis.read(b);
			
		} catch(FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("test.txt ������ ã�� �� �����ϴ�.");
		}
		catch(IOException e) {
			//e.printStackTrace();
			System.out.println("������ ���� �� �����ϴ�.");
		}
		finally {
			System.out.println("����");
		}
		
	}
}
