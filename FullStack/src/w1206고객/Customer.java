package w1206��;

public class Customer { //����� ���, ���� protected�� ����.
	protected int customerID=0;
	protected String customerName="";
	protected String customerGrade="";
	protected int bonusPoint=0;
	protected double bonusRatio=0;
	
	public Customer() {
		this.customerGrade="SILVER";
		this.bonusRatio=0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this(); //���� �ִ� �ڽ��� ������ ȣ���ϱ�
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public void ShowCustomerInfo() {
		System.out.printf("%d %s %s %d\n", customerID, customerName, customerGrade, bonusPoint);
	}

	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
}
