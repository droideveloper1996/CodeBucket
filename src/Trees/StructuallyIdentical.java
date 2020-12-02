package Trees;

import com.sun.source.tree.Tree;

public class StructuallyIdentical {
    public static void main(String[] args) {
        TreeNode<Integer> treeNode1=TreeRunner.takeInputLevelwise();
        TreeNode<Integer> treeNode2=TreeRunner.takeInputLevelwise();

        boolean result=checkIdentical(treeNode1,treeNode2);
        System.out.println(result);

    }

    static boolean  checkIdentical(TreeNode<Integer> tree1,TreeNode<Integer> tree2){
        if(tree1==null && tree2==null)
            return true;
        if(tree1==null || tree2==null)
            return false;

        if(tree1.children.size()!=tree2.children.size())
            return false;

        if(!tree1.data.equals(tree2.data))
            return false;

        for(int i=0;i<tree1.children.size();i++){
            if(!tree1.children.get(i).data.equals(tree2.children.get(i).data))
                return false;
        }
        return true;
    }
}
