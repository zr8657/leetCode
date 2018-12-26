/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null)
            return list;
       
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(true){
            Queue<TreeNode> temp = new LinkedList<>();
            List<Integer> tempList = new ArrayList<>();
            while(!queue.isEmpty()){
                TreeNode t = queue.poll();
                tempList.add(t.val);
                if(t.left!=null)
                    temp.add(t.left);
                if(t.right!=null)
                    temp.add(t.right);
            }
            
             
            list.add(0,tempList);
            System.out.println(list.size());
            if(temp.isEmpty())
                break;
            queue = temp;
        }
        return list;

    }
}
