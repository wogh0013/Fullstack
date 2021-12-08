package pct;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PCTDao {
	
	ArrayList<PCTData> list = new ArrayList<PCTData>();
	Scanner sc = new Scanner(System.in);
	
	public void append()
	{
		PCTData data = new PCTData();
		System.out.print("�̸� : ");
		data.setName( sc.next() );
		
		data.setWrite(  getScore("�ʱ�", 400)    );
		data.setWord(   getScore("����", 200)    );//0~200
		data.setSpread( getScore("��������", 200) );//0~200
		data.setPpt(    getScore("������Ʈ", 200) );
	
		data.calculate();
		
		list.add( data );
	}
	
	int getScore(String subject, int limit)
	{
		int temp;
		System.out.printf("%s : ", subject);
		temp = sc.nextInt();
		while(temp<0 || temp>limit)
		{
			System.out.printf("0~%d ������ ���� �Է��ϼ���\n", limit);
			System.out.printf("%s : ", subject);
			temp = sc.nextInt();
		}
		
		return temp;
	}
	
	
	public void output()
	{
		for(PCTData pct : list)
		{
			System.out.printf("%s %d %d %d %d %d %s\n", 
					pct.getName(), pct.getWrite(), pct.getWord(),
					pct.getPpt(), pct.getSpread(), pct.getTotal(), 
					pct.getGrade());
		}
	}
	
	public void menuDisplay()
	{
		System.out.println("-----------");
		System.out.println("    �޴�    ");		
		System.out.println("-----------");
		System.out.println(" 1.�߰�     ");
		System.out.println(" 2.���     ");
		System.out.println(" 3.�˻�     ");
		System.out.println(" 4.�ҷ�����     ");
		System.out.println(" 5.�����ϱ�     ");
		System.out.println(" 0.����     ");
		System.out.println("-----------");	
	}
	
	public void start()
	{
		while(true)
		{
			menuDisplay();
			System.out.print("���� : ");
			int menu = sc.nextInt();
			switch(menu)
			{
				case 1: append(); break;
				case 2: output(); break;
				case 3: System.out.println("�˻�"); break;
				case 4: load();	output(); break;
				case 5: save(); break;
				case 0: System.out.println("���α׷��� �����մϴ�.");
						return;
				default: System.out.println("��~");
			}
		}
	}
	
	void load() {
		list.clear(); //���� ������ ��� ����
		File file = new File("pctdata.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			line = reader.readLine();
			while(line!=null) {
				//ȫ�浿 300 200 100 -> temps[0]="ȫ�浿", temps[1]=300 ...
				String[] temps = line.split(" "); //�����Ͱ� ������ �������� ����� �迭�� ��ȯ��
				PCTData data = new PCTData();
				data.setName(temps[0]);
				data.setWrite(Integer.parseInt(temps[1]));
				data.setWord(Integer.parseInt(temps[2]));
				data.setSpread(Integer.parseInt(temps[3]));
				data.setPpt(Integer.parseInt(temps[4]));
				
				data.calculate();
				list.add(data); // ������ �����Ͱ� ������ �� �ڿ� �߰��� ��
				line = reader.readLine();
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	void save() {
		File file = new File("pctdata.txt");
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			for(PCTData data : list) {
				writer.write(String.format("%s %d %d %d %d", data.getName(), data.getWrite(),
						data.getWord(), data.getSpread(), data.getPpt()));
			}
			
			writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}















