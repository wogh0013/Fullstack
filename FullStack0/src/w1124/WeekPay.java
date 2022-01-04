package w1124;
import java.util.Scanner;

public class WeekPay {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int per_pay = 10000;
		int work_time;
		int weekpay;
		work_time = sc.nextInt();
		sc.close();
		
		System.out.println("일한 시간은 " + work_time + "입니다.");
		
		if(work_time>20) {
			weekpay = (int)((per_pay * work_time) + ((work_time - 20) * per_pay * 0.5)); 
			System.out.println("주급은 : " + weekpay);
		}
		else {
			weekpay = (per_pay * work_time);
			System.out.println("주급은 : " + weekpay);
		}
	}
}
		
/*
 	if(work_time>20){
 		over_pay = (int)((work_time-20)*per_pay*0.5);
 	}
 	else{
 		over_pay=0;
 	}
 */ 	
