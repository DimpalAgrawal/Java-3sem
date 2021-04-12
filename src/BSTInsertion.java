/*   Created by IntelliJ IDEA.
 *   Author: Dimpal Agrawal
 *   Date: 4/10/2021
 *   Time: 6:49 PM
 *   File: BSTInsertion.java
 */

class Node {
    int data;
    Node left;
    Node right;

    Node newnode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
}

public class BSTInsertion {

    static Node newnode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return newnode(data);
        }
        if (data < (root.data)) {
            root.left = insert(root.left, data);
        } else if (data > (root.data)) {
            root.right = insert(root.right, data);

        }
        return root;
    }


    static void inorder(Node root) {

        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }


    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 3);
        root = insert(root, 0);
        root = insert(root, 9);
        root = insert(root, 1);
        inorder(root);

    }
}
