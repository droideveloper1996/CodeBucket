package BinaryTree;

public class TreeHeight {
    public static void main(String[] args) {
        System.out.println(getHeight(BinaryTreeRunner.takeInputLevelWise()));
    }

    static int getHeight(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        int leftHeight =  getHeight(root.leftChild);
        int rightHeight =  getHeight(root.rightChild);

        int ans = Math.max(leftHeight, rightHeight);
        return 1+ans;

    }
}
