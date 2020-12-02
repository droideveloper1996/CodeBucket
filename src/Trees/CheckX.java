package Trees;

public class CheckX {
    public static void main(String[] args) {
        TreeNode<Integer> rootTreeNode=TreeRunner.takeInputLevelwise();
        Boolean result=checkX(rootTreeNode,4);
        System.out.println(result);
    }


    public static boolean checkX(TreeNode<Integer> rootNode,int x){

        if(rootNode==null)
            return false;

        if(rootNode.data.equals(x))
            return true;

        for(int i=0;i<rootNode.children.size();i++){
            boolean smallAns=checkX(rootNode.children.get(i),x);
            if(smallAns)
                return true;
        }
        return false;
    }
}
