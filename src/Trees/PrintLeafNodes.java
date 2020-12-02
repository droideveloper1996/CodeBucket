package Trees;

public class PrintLeafNodes {
    public static void main(String[] args) {
        TreeNode<Integer> rootNode = TreeRunner.takeInputLevelwise();
        int leafCount = countLeafNodes(rootNode);
        System.out.println(leafCount);
    }

    public static int countLeafNodes(TreeNode<Integer> rootNode) {
        if (rootNode == null)
            return 0;
        int ans = 0;
        if (rootNode.children.size() == 0) {
            return 1;
        }
        for (int i = 0; i < rootNode.children.size(); i++) {
            int smallAns = countLeafNodes(rootNode.children.get(i));
            ans = ans + smallAns;
        }
        return ans;
    }
}
