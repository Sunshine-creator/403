package cww403;

public class TreeTest {
    static class  TreeNode{
        public char val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(char val) {
            this.val = val;
        }
    }
    public static int index =0;
    public static TreeNode build(String Line){
        index=0;
        return createTreePreOrder(Line);
    }

    private static TreeNode createTreePreOrder(String line) {
        char cur = line.charAt(index);
        if(cur =='#'){
            return null;
        }
        TreeNode node = new TreeNode(cur);
        index++;
        node.left = createTreePreOrder(line);
        index++;
        node.right= createTreePreOrder(line);
        return node;
    }
}
