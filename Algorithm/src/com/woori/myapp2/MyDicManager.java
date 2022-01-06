package com.woori.myapp2;

import java.util.Iterator;

public class MyDicManager {
   MyList2<MyDic> list = new MyList2<MyDic>();
   public MyDicManager()
   {
      list.insertTail(new MyDic("rain", "ºñ"));
      list.insertTail(new MyDic("cloud", "±¸¸§"));
      list.insertTail(new MyDic("flower", "²É"));
      list.insertTail(new MyDic("bear", "°õ"));
      list.insertTail(new MyDic("rabbit", "Åä³¢"));
      list.insertTail(new MyDic("snow", "´«»ç¶÷"));
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