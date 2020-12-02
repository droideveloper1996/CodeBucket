package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Traversals {

    public static void main(String[] args) {

        BinaryTreeNode<Integer> rootNode = BinaryTreeRunner.takeInputLevelWise();
        printLevelwise(rootNode);
    }

    public static void printLevelwise(BinaryTreeNode<Integer> rootNode) {
        Queue<BinaryTreeNode<Integer>> pending = new LinkedList<>();
        if (rootNode == null)
            return;
        BinaryTreeNode<Integer> nullNode = null;
        pending.add(rootNode);
        pending.add(nullNode);
        while (pending.size()!=1) {
            BinaryTreeNode<Integer> front = pending.remove();
            if (front == nullNode) {
                System.out.println();
                pending.add(nullNode);
            } else {
                System.out.print(front.data+" ");
                if (front.leftChild != null)
                    pending.add(front.leftChild);
                if (front.rightChild != null)
                    pending.add(front.rightChild);
            }

        }

    }

}
