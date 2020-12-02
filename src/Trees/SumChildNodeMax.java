package Trees;

public class SumChildNodeMax {
    public static void main(String[] args) {

        TreeNode<Integer> rootNode = TreeRunner.takeInputLevelwise();
        System.out.println(maxSumNode(rootNode).data);
        System.out.println(maxSumNode2(rootNode).node.data);
    }

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> rootNode) {

        if (rootNode == null || rootNode.children.size() == 0)
            return rootNode;

        TreeNode<Integer> result = rootNode;
        int sum = rootNode.data;
        for (int i = 0; i < rootNode.children.size(); i++) {
            TreeNode<Integer> childNode = rootNode.children.get(i);
            sum = sum + childNode.data;
        }

        for (int i = 0; i < rootNode.children.size(); i++) {
            TreeNode<Integer> smallAns = maxSumNode(rootNode.children.get(i));
            int tmp = smallAns.data;
            for (int j = 0; j < smallAns.children.size(); j++)
                tmp += smallAns.children.get(j).data;
            if (tmp > sum) {
                result = smallAns;
                sum = tmp;
            }
        }
        return result;
    }

    /**
     * Approach Better
     */


    public static MaxNodePair<Integer> maxSumNode2(TreeNode<Integer> rootNode) {

        if (rootNode == null) {
            MaxNodePair<Integer> maxNodePair = new MaxNodePair();
            maxNodePair.node = null;
            maxNodePair.sum = Integer.MIN_VALUE;
            return maxNodePair;
        }

        int sum = rootNode.data;
        for (TreeNode<Integer> node : rootNode.children) {
            sum = sum + node.data;
        }
        MaxNodePair<Integer> result = new MaxNodePair<>();
        result.sum = sum;
        result.node = rootNode;

        for (TreeNode<Integer> node : rootNode.children) {
            MaxNodePair<Integer> smallAns = maxSumNode2(node);
            if (smallAns.sum > result.sum)
                result = smallAns;
        }
        return result;
    }

    static class MaxNodePair<U> {
        TreeNode<U> node;
        int sum;
    }
}
