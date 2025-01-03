class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return 0;
        }
        int curr=0;
        q.add(root);
        while(!q.isEmpty()){
             curr=0;
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode s=q.poll();
                curr+=s.val;
                if(s.left!=null){
                    q.add(s.left);
                }
                if(s.right!=null){
                    q.add(s.right);
                }

            }
        }
        return curr;
    }

}