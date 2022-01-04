package javaProject1;

public class Product {
	int prdNo=0;
	String prdName="";
	int prdPrice=0;
	int prdYear=0;
	String prdMaker="";
	
	public Product() {
		
	}
	
	public Product(int prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}

	@Override
	public String toString() {
		
		return String.format("%3d %7s %10d %7d %6s", prdNo, prdName, prdPrice, prdYear, prdMaker);
	}
	
}
