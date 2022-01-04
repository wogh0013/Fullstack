package w1207예외;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 파일읽고쓰기 {
	public static void main(String[] args) {
		
		try {
			File file;
			file = new File("test.txt");
			FileInputStream fis = new FileInputStream(file);
			byte[] b = new byte[40];
			fis.read(b);
			
		} catch(FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("test.txt 파일을 찾을 수 없습니다.");
		}
		catch(IOException e) {
			//e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다.");
		}
		finally {
			System.out.println("종료");
		}
		
	}
}
