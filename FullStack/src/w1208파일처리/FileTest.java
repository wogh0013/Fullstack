package w1208파일처리;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	// 함수 옆에 예외를 던진다 - 이 함수를 호출하는 쪽에서 예외로 별도로 처리한다.
	void textFileWrite() throws IOException {
		File file = new File("test.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		if(file.isFile() && file.canWrite()) {
			writer.write("동해물과 백두산이\n");
			writer.write("마르고 닳도록\n");
			writer.write("하느님이 보우하사\n");
			writer.write("우리나라 만세\n");
		}
		writer.close(); //사용종료 후 닫아주기
	}
	
	void textFileRead() throws FileNotFoundException, IOException {
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		String line="";
		line = reader.readLine(); //더 이상 읽을 데이터가 없으면 null 반환
		while(line!=null) {
			System.out.println(line);
			line = reader.readLine(); //다음 줄 읽기
		}
		reader.close();
	}
	
	public static void main(String[] args) {
		FileTest ft = new FileTest();
		try {
			//ft.textFileWrite();
			ft.textFileRead();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
