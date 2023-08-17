package maxsumbinarytree;

public class BinaryTreeMaxSum {

	private int GlobalMax = Integer.MIN_VALUE;
	
	public int findMaxSum(TreeNode root) {
		
		maxGain(root);		
		return GlobalMax;
	}
	
	public int maxGain(TreeNode node) {
		if(node == null)
			return 0;
		int leftGain = Math.max(maxGain(node.left), 0);
		int rightGain = Math.max(maxGain(node.right), 0);
		
		GlobalMax = Math.max(GlobalMax, rightGain + leftGain + node.value);
		
		return node.value + Math.max(leftGain, rightGain);
	}
	
	public static void main(int[] arr) {
		
	}
}
