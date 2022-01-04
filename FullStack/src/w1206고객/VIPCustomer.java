package w1206°í°´;

public class VIPCustomer extends Customer {
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		System.out.println("VIP..........");
		bonusPoint += price * bonusRatio;
		return price-(int)(price*saleRatio);
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	
}
