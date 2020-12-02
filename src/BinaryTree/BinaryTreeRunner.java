package BinaryTree;

import com.sun.source.tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeRunner {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> rootNode = takeInputLevelWise();
        printBinaryTreeLevelWise(rootNode);
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() {

        System.out.println("Enter Root Node's Data");
        Scanner scanner = new Scanner(System.in);
        int root = scanner.nextInt();

        BinaryTreeNode<Integer> rootNode = new BinaryTreeNode<Integer>(root);
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(rootNode);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> leftNode = null;
            BinaryTreeNode<Integer> rightNode = null;
            BinaryTreeNode<Integer> front = queue.remove();
            System.out.println("Enter Left Child of " + front.data);
            int left = scanner.nextInt();
            if (left != -1) {
                leftNode = new BinaryTreeNode<Integer>(left);
                queue.add(leftNode);
            }
            front.leftChild = leftNode;
            System.out.println("Enter Right Child of " + front.data);
            int right = scanner.nextInt();
            if (right != -1) {
                rightNode = new BinaryTreeNode<Integer>(right);
                queue.add(rightNode);
            }
            front.rightChild = rightNode;
        }
        return rootNode;
    }

    public static void printBinaryTreeLevelWise(BinaryTreeNode<Integer> binaryTreeNode) {
        Queue<BinaryTreeNode<Integer>> pendingNode = new LinkedList<>();
        pendingNode.add(binaryTreeNode);
//        System.out.println(binaryTreeNode.data);
        while (!pendingNode.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingNode.remove();
            System.out.println(front.data);
            if (front.leftChild != null)
                pendingNode.add(front.leftChild);
            if (front.rightChild != null)
                pendingNode.add(front.rightChild);
        }
    }
}
