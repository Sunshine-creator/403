package cww403;
import java.util.LinkedList;
import java.util.Queue;
public class TestTree {
    static class Tree{
        public int val;
        public Tree left;
        public Tree right;
        public Tree(int val) {
            this.val = val;
        }
    }
    public boolean isCompleteTree(Tree root){   //判断是否为完全二叉树
        if(root==null){
            return  true;
        }
        boolean isSecondStage =  false;
        Queue<Tree> queue = new LinkedList <>();
        queue.offer(root);       //把根节点入队列
        while (!queue.isEmpty()){
            Tree cur =  queue.poll();
            if(!isSecondStage){
                if(cur.left!=null && cur.right!=null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }else if(cur.left!=null && cur.right==null){       //分两个阶段判断是否为完全二叉树
                    isSecondStage = true;
                    queue.offer(cur.left);
                }else  if(cur.left==null && cur.right!=null){
                    return false;
                }else {
                    isSecondStage =true;
                }
            }else {
                if(cur.left!=null ||cur.right!=null){
                    return false;
                }
            }
        }
        return true;
    }

}
