package com.learn.oop;

public class TV {
	
  String Brand;
  String ModelName;
  Integer ScreenSize;
  Integer Price;
  String Color;
  String DisplayType;
  
  void insertData(String B,String Mn,Integer ss,Integer p, String c,String dt) {
	   Brand = B;
	   ModelName =Mn;
	   ScreenSize=ss;
	   Price=p;
	   Color=c;
	   DisplayType=dt;
  }
  
  void DisplayTV() {
	  System.out.println(Brand+" "+ModelName);
  }
  
  public static void main(String args[]) {
	  
	  TV lgoled = new TV();
	  TV SamsungFrame = new TV();
	  
	  
	  lgoled.Brand = "LG";
	  lgoled.ModelName = "4K oled 75' tv";
	  lgoled.ScreenSize = 75;
	  lgoled.Price = 100000;
	  lgoled.Color ="Black";
	  lgoled.DisplayType ="OLED";
	  
	  SamsungFrame.insertData("Samsung", "65' Frame TV",65, 65000, "Beige", "LED");
	  System.out.println(SamsungFrame.Brand+" "+ SamsungFrame.ModelName);
	  System.out.println(lgoled.Brand+" "+ lgoled.ModelName);
  }
  
  
  

}
