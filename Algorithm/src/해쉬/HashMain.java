package 해쉬;

public class HashMain {
	public static void main(String[] args) {
		Hash hash = new Hash();
		hash.createHashTable();
		hash.display();
		System.out.println();
		
		hash.search("비비빅");
		hash.search("투게더");
		hash.search("dd");
				
	}
}
