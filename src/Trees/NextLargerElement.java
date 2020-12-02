package Trees;

public class NextLargerElement {
    /**
     * Very Important Question
     */

    public static void main(String[] args) {

        TreeNode<Integer> root = TreeRunner.takeInputLevelwise();
        System.out.println(getLarger(root, 21).data);
    }

    static public TreeNode<Integer> getLarger(TreeNode<Integer> root, int x) {

        if (root == null)
            return null;

        TreeNode<Integer> nextLargerNode = null;
        if (root.data > x)
            nextLargerNode = root;

        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> nextLargerInChild = getLarger(root.children.get(i), x);
            if (nextLargerInChild != null) {
                if (nextLargerNode == null || nextLargerInChild.data < nextLargerNode.data) {
                    nextLargerNode = nextLargerInChild;
                }
            }
        }
        return nextLargerNode;
    }
}
