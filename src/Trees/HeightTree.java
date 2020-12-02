package Trees;

public class HeightTree {
    public static void main(String[] args) {
        TreeNode<Integer> rootNode= TreeRunner.takeInputLevelwise();
        int height=getHeight(rootNode);
        System.out.println(height);
    }
    static public int getHeight(TreeNode<Integer> rootNode){

        if(rootNode==null)
            return -1;
        int maxHeight=0;
        for(int i=0;i<rootNode.children.size();i++){
            int smallHeight=getHeight(rootNode.children.get(i));
            maxHeight=Math.max(smallHeight,maxHeight);
        }
        return 1+maxHeight;
    }
}
