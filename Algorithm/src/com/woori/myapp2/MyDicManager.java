package com.woori.myapp2;

import java.util.Iterator;

public class MyDicManager {
   MyList2<MyDic> list = new MyList2<MyDic>();
   public MyDicManager()
   {
      list.insertTail(new MyDic("rain", "��"));
      list.insertTail(new MyDic("cloud", "����"));
      list.insertTail(new MyDic("flower", "��"));
      list.insertTail(new MyDic("bear", "��"));
      list.insertTail(new MyDic("rabbit", "�䳢"));
      list.insertTail(new MyDic("snow", "�����"));
   }
   
   public void display()
   {
	   Iterator<MyDic> it = list.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
   }
   
   public void find()
   {
      MyDic dic = new MyDic("bear", "");
      
      dic = list.find(dic);
      if (dic != null)
         System.out.println(dic);
      else
         System.out.println("not found");
   }
}