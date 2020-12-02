package Trees;

public class CountTreeNodes {
    public static void main(String[] args) {
        int rootNode=countNumNodes(TreeRunner.takeInputLevelwise());
        System.out.println(rootNode);
    }

    static int countNumNodes(TreeNode<Integer> root) {
        if(root==null){
            return -1;
        }
        int count = 1;

        int finalAnswer=0;
        for(int i=0;i<root.children.size();i++){
            finalAnswer+=countNumNodes(root.children.get(i));
        }
        return finalAnswer+1;
    }
}
