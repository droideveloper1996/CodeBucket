package BinaryTree;

public class FindNodeX {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> treeNode = BinaryTreeRunner.takeInputLevelWise();
        boolean result = findX(treeNode, 5);
        System.out.println(result);
    }

    public static boolean findX(BinaryTreeNode<Integer> rootNode, int x) {
        if (rootNode == null)
            return false;
        if (rootNode.data.equals(x))
            return true;
        boolean smallAnsLeft = findX(rootNode.leftChild, x);
        boolean smallAnsRight = findX(rootNode.leftChild, x);

        if (smallAnsLeft || smallAnsRight) {
            return true;
        }
        return false;
    }
}
