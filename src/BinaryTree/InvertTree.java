package BinaryTree;

import com.sun.source.tree.BinaryTree;

public class InvertTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> rootNode=BinaryTreeRunner.takeInputLevelWise();
        Traversals.printLevelwise(rootNode);
        System.out.println();
        System.out.println("------------------");
        BinaryTreeNode<Integer> result = invertTree(rootNode);
        Traversals.printLevelwise(result);
    }

    public static BinaryTreeNode<Integer> invertTree(BinaryTreeNode<Integer> root) {
        if (root == null)
            return null;
        BinaryTreeNode<Integer> leftInvert = invertTree(root.leftChild);
        BinaryTreeNode<Integer> rightInvert = invertTree(root.rightChild);
        root.leftChild = rightInvert;
        root.rightChild = leftInvert;

        return root;
    }
}
