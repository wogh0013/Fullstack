package �ؽ�;

public class HashMain {
	public static void main(String[] args) {
		Hash hash = new Hash();
		hash.createHashTable();
		hash.display();
		System.out.println();
		
		hash.search("����");
		hash.search("���Դ�");
		hash.search("dd");
				
	}
}
