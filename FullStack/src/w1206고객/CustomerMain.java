package w1206��;

public class CustomerMain {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		c1.setBonusPoint(100);
		c1.setBonusRatio(0.1);
		c1.setCustomerID(1);
		c1.setCustomerName("ȫCustomer");
		
		c1.ShowCustomerInfo();
		
		//
		VIPCustomer v1 = new VIPCustomer();
		
		v1.setAgentID(1);
		v1.setCustomerID(1);
		v1.setCustomerName("��VIP");
		
		v1.ShowCustomerInfo();
		
		//
		c1 = new VIPCustomer(); 
		
		c1.calcPrice(10000); //�θ��� �Լ��� ����޼���, ���� �������̵��� �� ������ ȣ���Ѵ�.
	}
}
