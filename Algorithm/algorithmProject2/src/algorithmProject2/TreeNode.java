package algorithmProject2;

public class TreeNode {
	int key;
	String data;
	TreeNode left;
	TreeNode right;
	 
	public TreeNode() {
		key=0;
		data="";
		left=null;
		right=null;
	}
	
	public TreeNode(int key, String data) {
		this.key = key;
		this.data = data;
		this.left=null;
		this.right=null;
	}
}
