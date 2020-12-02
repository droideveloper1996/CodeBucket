package BinaryTree;

public class Diameter {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> rootNode = BinaryTreeRunner.takeInputLevelWise();
        int ans=diameter(rootNode);
        System.out.println("Diameter of Tree is: "+ans);

        int b[][]={{}};

        System.out.println(b.length);
        System.out.println(b[0].length);

    }


    int[] reverse(int a[]){
        int k=0;
        int b[]=new int[a.length];
        for(int j=a.length-1;j>=0;j--){
            b[j]=a[k++];
        }
        return b;
    }
    static public int diameter(BinaryTreeNode<Integer> rootNode) {
        if (rootNode == null)
            return 0;

        int option1=getHeight(rootNode.leftChild)+getHeight(rootNode.rightChild);
        int option2=diameter(rootNode.leftChild);
        int option3=diameter(rootNode.rightChild);
        int answer=Math.max(option3,Math.max(option1,option2));
        return answer;

    }

    static int getHeight(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        int leftHeight =  getHeight(root.leftChild);
        int rightHeight =  getHeight(root.rightChild);

        int ans = Math.max(leftHeight, rightHeight);
        return 1+ans;

    }



    // 1 2 4 3 5 -1 -1 9 -1 -1 6 10 -1 -1 7 11 -1 -1 8 -1 -1 -1 -1
}
