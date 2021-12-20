package com.woori.myapp2;

public class MyDic {
	   String eng;
	   String kor;
	   
	   public MyDic() {
	      eng="";
	      kor="";
	   }
	   
	   public MyDic(String eng, String kor)
	   {
	      this.kor = kor;
	      this.eng = eng;
	   }
	   
	   @Override
	   public boolean equals(Object obj) {
	      MyDic dic = (MyDic)obj;
	      return this.eng.equals(dic.eng);
	   }
	   
	   @Override
	   public String toString() {
	   
	      return this.eng + " : " + this.kor;
	   
	   }
}
