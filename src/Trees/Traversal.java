package Trees;

import java.util.function.ToDoubleBiFunction;

public class Traversal {
    public static void main(String[] args) {

        TreeNode<Integer> rootNode = TreeRunner.takeInputLevelwise();

        Inorder(rootNode);
        System.out.println();
        Preorder(rootNode);
        System.out.println();
        Postorder(rootNode);
        System.out.println();
        LevelOrder(rootNode);
    }

    private static void LevelOrder(TreeNode<Integer> rootNode) {

        if (rootNode == null)
            return;
        /**
         * TODO: Same as Level order Print
         */


    }

    private static void Inorder(TreeNode<Integer> rootNode) {
        //Not Applicable for Generic Trees
    }

    private static void Preorder(TreeNode<Integer> rootNode) {
        //Root left right
        if (rootNode == null)
            return;

        System.out.print(rootNode.data+" ");
        for (int i = 0; i < rootNode.children.size(); i++) {
            Preorder(rootNode.children.get(i));
        }

    }

    private static void Postorder(TreeNode<Integer> rootNode) {
        if (rootNode == null)
            return;

        for (int i = 0; i < rootNode.children.size(); i++) {
            Postorder(rootNode.children.get(i));
        }
        System.out.print(rootNode.data+" ");
    }

    //10 3 20 30 70 0 2 4 50 1 80 0 1 60 1 90 0 1 100 0
}
