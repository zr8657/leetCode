package leetCode;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class L_257_BinaryTreePaths {

}

// Definition for a binary tree node.
// public class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;
//
// TreeNode(int x) {
// val = x;
// }
// }

class Solution {
	List<String> result = new ArrayList();

	public List<String> binaryTreePaths(TreeNode root) {
		if (root == null) { // 如果为空直接返回
			return result;
		}
		find(root, "");// 递归调用，第一次传路径为空

		return result;
	}

	public void find(TreeNode tn, String path) {

		if (tn.left != null) { // 如果左子树不是空那么记录当前节点然后继续调用下面的
			find(tn.left, path + tn.val + "->");
		}
		if (tn.left == null && tn.right == null) {// 如果左右节点都是空那么说明是叶子节点，加入结果集
			result.add(path + tn.val);
		}
		if (tn.right != null) {// 右子树不是空的话就继续递归调用
			find(tn.right, path + tn.val + "->");
		}

	}
}
