import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinaryInOrderTraversal {

	    public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> list = new ArrayList<Integer>();
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        TreeNode current = root;
	        while(current != null || !stack.isEmpty()){
	            while(current != null){
	                stack.push(current);
	                current = current.left;
	            }
	            current = stack.pop();
	            list.add(current.val);
	            current = current.right;
	        }
	        return list;
	    }
	}

