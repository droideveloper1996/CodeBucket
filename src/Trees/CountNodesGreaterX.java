package Trees;

public class CountNodesGreaterX {

    public static void main(String[] args) {
        TreeNode<Integer> rootNode=TreeRunner.takeInputLevelwise();
        int result=count(rootNode,5);
        System.out.println("Nodes Greater than 5 are: "+result);
    }

    static int count(TreeNode<Integer> rootNode,int x){
        if(rootNode==null)
            return 0;
        int result=0;

        if(rootNode.data>x)
            result++;

        for(int i=0;i<rootNode.children.size();i++){
            int smallAns=count(rootNode.children.get(i),x);
            result+=smallAns;
        }
        return result;
    }
}