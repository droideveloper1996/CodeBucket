package Trees;

public class LargestNode {


    public static void main(String[] args) {
        TreeNode<Integer> rootNode = TreeRunner.takeInputLevelwise();
        System.out.println("Max Node is: "+getMaxNode(rootNode).data);
    }

    public static TreeNode<Integer> getMaxNode(TreeNode<Integer> rootNode) {

        if(rootNode==null){
            return rootNode;
        }
        TreeNode<Integer> maxNode=rootNode;
        for(int i=0;i<rootNode.children.size();i++){
            TreeNode<Integer> node=getMaxNode(rootNode.children.get(i));
            if(node.data>maxNode.data){
                maxNode=node;
            }
        }
        return maxNode;
    }

}
