import java.io.*;

public class Lopez_ProgrammingTask4 {

    static class Node { // tree node structure
        Node left;
        Node right;
        char charData;

    Node(char data) {
        this.charData = data;
        this.left = null;
        this.right = null;
        }
    }

    static Node root = null; // root of the tree

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input 3 Nodes [Format -> (A,B,C)] '0' if done: ");

        // building tree from input of the user
        while (true){
            String strLine = br.readLine().trim();
            if (strLine.equalsIgnoreCase("0")) 
                break;
            if (strLine.isEmpty()) 
                continue;

            strLine = strLine.replaceAll("[()]", "");
            String[] strNodes = strLine.split(",");
            if (strNodes.length != 3) {
                System.out.println("Invalid input. Use format (A,B,C).");
                continue;
            }
            // clearing whitespaces for nodes
            strNodes[0] = strNodes[0].trim();
            strNodes[1] = strNodes[1].trim();
            strNodes[2] = strNodes[2].trim();

            if (strNodes[0].isEmpty()) {
                System.out.println("Parent node cannot be empty.");
                continue;
            }
            // create parent node
            char parentData = strNodes[0].charAt(0);
            Node parentNode = search(root, parentData);

            if (parentNode == null) {
                parentNode = new Node(parentData);
                if (root == null) {
                    root = parentNode; 
                }
            }
            // left child
            if (!strNodes[1].equalsIgnoreCase("null")) {
                if (strNodes[1].isEmpty()) {
                    System.out.println("Left child cannot be empty (use 'null' for no child).");
                } else if (parentNode.left == null) {
                    char leftData = strNodes[1].charAt(0);
                    Node leftNode = new Node(leftData);
                    parentNode.left = leftNode;
                } else {
                    System.out.println("Warning: Left child already exists for " + parentData);
                }
            }
            // right child
            if (!strNodes[2].equalsIgnoreCase("null")) {
                if (strNodes[2].isEmpty()) {
                    System.out.println("Right child cannot be empty (use 'null' for no child).");
                } else if (parentNode.right == null) {
                    char rightData = strNodes[2].charAt(0);
                    Node rightNode = new Node(rightData);
                    parentNode.right = rightNode;
                } else {
                    System.out.println("Warning: Right child already exists for " + parentData);
                }
            }

            if (root != parentNode) {
                attachNode(root, parentNode);
            }
        }

        if (root == null) {
            System.out.println("No tree created.");
            return;
        }
        // printing tree info and its traversals
        System.out.println("\nRoot of the tree: " + root.charData);
        System.out.print("\nPreorder traversal: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        postorder(root);
        System.out.println();
    }
    // searching node by its value
    static Node search(Node node, char target) {
        if (node == null) 
            return null;
        if (node.charData == target) 
            return node;
        Node leftSearch = search(node.left, target);
        if (leftSearch != null) 
            return leftSearch;
            
        return search(node.right, target);
    }
    // attaching a node in an available position
    static boolean attachNode(Node current, Node newNode) {
        if (current == null) 
            return false;

        // if nodes match, attach children
        if (current.charData == newNode.charData) {
            if (current.left == null && newNode.left != null)
                current.left = newNode.left;
            if (current.right == null && newNode.right != null)
                current.right = newNode.right;

            return true;
        } else {

        return attachNode(current.left, newNode) || attachNode(current.right, newNode);
        }
    }
    // pre order
    static void preorder(Node node) {
        if (node == null) 
            return;
        System.out.print(node.charData + " ");
        preorder(node.left);
        preorder(node.right);
    }
    // in order
    static void inorder(Node node) {
        if (node == null) 
            return;
        inorder(node.left);
        System.out.print(node.charData + " ");
        inorder(node.right);
    }
    // post order
    static void postorder(Node node) {
        if (node == null) 
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.charData + " ");
    }
}