package w1208����ó��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	// �Լ� ���� ���ܸ� ������ - �� �Լ��� ȣ���ϴ� �ʿ��� ���ܷ� ������ ó���Ѵ�.
	void textFileWrite() throws IOException {
		File file = new File("test.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		if(file.isFile() && file.canWrite()) {
			writer.write("���ع��� ��λ���\n");
			writer.write("������ �⵵��\n");
			writer.write("�ϴ����� �����ϻ�\n");
			writer.write("�츮���� ����\n");
		}
		writer.close(); //������� �� �ݾ��ֱ�
	}
	
	void textFileRead() throws FileNotFoundException, IOException {
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		String line="";
		line = reader.readLine(); //�� �̻� ���� �����Ͱ� ������ null ��ȯ
		while(line!=null) {
			System.out.println(line);
			line = reader.readLine(); //���� �� �б�
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
