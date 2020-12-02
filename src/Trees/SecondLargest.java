package Trees;

import BinaryTree.BinaryTreeNode;

public class SecondLargest {

    public static void main(String[] args) {

        TreeNode<Integer> rootNode = TreeRunner.takeInputLevelwise();
        Pair<TreeNode<Integer>> answer = getSecondMaximum(rootNode);
        System.out.println("First max is: " + answer.first.data);
        System.out.println("Second Max is: " + answer.second.data);

    }

    public static Pair<TreeNode<Integer>> getSecondMaximum(TreeNode<Integer> root) {
        Pair<TreeNode<Integer>> output;
        if (root == null) {
            output = new Pair<>(null, null);
            return output;
        }
        output = new Pair<>(root, null);
        for (TreeNode<Integer> childNode : root.children) {
            Pair<TreeNode<Integer>> childPair = getSecondMaximum(childNode);
            if (childPair.first.data > output.first.data) {

                if (childPair.second == null || output.first.data > childPair.second.data) {
                    /**
                     * Order is important
                     */
                    output.second = output.first;
                    output.first = childPair.first;
                }
                if (childPair.second != null && childPair.second.data > output.first.data) {
                    output.first = childPair.first;
                    output.second = childPair.second;
                }
            } else if (childPair.first.data.equals(output.first.data) && childPair.second != null) {

                output.second = childPair.second;

            } else if (!childPair.first.data.equals(output.first.data) && (output.second == null || childPair.first.data > output.second.data)) {
                output.second = childPair.first;
            }
        }

        return output;
    }

    static class Pair<T> {
        T first;
        T second;

        Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }
    }
}
