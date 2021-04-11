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
            root.left = insert(root.left, root.data);
        } else if (data > (root.data)) {
            root.right = insert(root.right, root.data);

        }
        return root;
    }


    static void preorder(Node root) {

        if (root != null) {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }


    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 2);
        insert(root, 5);
        insert(root, 4);
        insert(root, 9);
        preorder(root);

    }
}
