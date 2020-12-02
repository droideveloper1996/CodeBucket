package Trees;

import java.util.ArrayList;

public class NodesAtDepthK {
    public static void main(String[] args) {


        TreeNode<Integer> rootNode=TreeRunner.takeInputLevelwise();
        NodeAtDepthK(rootNode,2);

    }
    public static void NodeAtDepthK(TreeNode<Integer> rootNode, int k){
        if(rootNode==null)
            return ;
        if(k==0){
            System.out.println(rootNode.data);
        }
        for(int i=0;i<rootNode.children.size();i++){
            NodeAtDepthK(rootNode.children.get(i),k-1);
        }
    }
    //10 3 20 30 70 0 2 4 50 1 80 0 1 60 1 90 0 1 100 0
}
