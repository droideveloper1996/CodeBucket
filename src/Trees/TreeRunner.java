package Trees;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeRunner {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TreeNode root_node = takeInputLevelwise();
        printLevelWise(root_node);


    }

    public static void printTree(TreeNode<Integer> rootNode) {

        String data=rootNode.data+":";
        for(int i=0;i< rootNode.children.size();i++){
            data+=rootNode.children.get(i).data+", ";
        }
        System.out.println(data);

        for(int i=0;i<rootNode.children.size();i++){
            printTree(rootNode.children.get(i));
        }

    }

    public static TreeNode<Integer> takeInput(Scanner scanner) {
        System.out.println("Enter root node");
        int root_data = scanner.nextInt();
        TreeNode<Integer> rootNode = new TreeNode<>(root_data);
        System.out.println("Enter Child Count");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            TreeNode<Integer> childNode=takeInput(scanner);
            rootNode.children.add(childNode);
        }

        return rootNode;
    }


    public static TreeNode<Integer> takeInputLevelwise(){
        Queue<TreeNode> pendingNodes=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the root Node");
        int root_data=scanner.nextInt();
        TreeNode<Integer> rootNode=new TreeNode<>(root_data);
        pendingNodes.add(rootNode);
        while (!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode=pendingNodes.remove();
            System.out.println("Enter no of children of: "+frontNode.data);
            int count=scanner.nextInt();
            for(int i=0;i<count;i++){
                System.out.println("Enter the "+(i+1)+"th child of : "+frontNode.data);
                TreeNode<Integer> child=new TreeNode<>(scanner.nextInt());
                frontNode.children.add(child);
                pendingNodes.add(child);
            }
        }
        return rootNode;
    }

    public static void printLevelWise(TreeNode<Integer> treeNode) {
        TreeNode<Integer> nullNode=null;
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println(treeNode.data);
        pendingNodes.add(treeNode);
        pendingNodes.add(nullNode);
        while (pendingNodes.size()!=1) {
            TreeNode<Integer> front=pendingNodes.remove();
            if(front==null){
                System.out.println();
                pendingNodes.add(nullNode);
            }
            else{
                for (int i = 0; i < front.children.size(); i++) {
                    pendingNodes.add(front.children.get(i));
                    System.out.print(front.children.get(i).data+",");
                }
            }
        }
    }
}
