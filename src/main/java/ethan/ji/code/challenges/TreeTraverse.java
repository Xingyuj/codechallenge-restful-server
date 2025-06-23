package ethan.ji.code.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraverse {

    public static List<TreeNode> inorderTraversal(TreeNode root) {
        Stack<TreeNode> treeNodeStack = new Stack<>();
        List<TreeNode> inOrderList = new ArrayList<>();

        while (root != null || !treeNodeStack.empty()) {
            if (root == null) {
                root = treeNodeStack.pop();
                inOrderList.add(root);
                root = root.right;
            } else {
                treeNodeStack.add(root);
                root = root.left;
            }
        }
        return inOrderList;
    }

    public static void inorderRecursive(TreeNode root, List<TreeNode> inorderResult) {
        if (root == null) {
            return;
        }
        inorderRecursive(root.left, inorderResult);
        inorderResult.add(root);
        inorderRecursive(root.right, inorderResult);
    }

    public static List<TreeNode> inorderTraversalRecursive(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        inorderRecursive(root, result);
        return result;
    }

    public static List<TreeNode> preorderTraversal(TreeNode root) {
        Stack<TreeNode> treeNodeStack = new Stack<>();
        List<TreeNode> preOrderList = new ArrayList<>();
        treeNodeStack.add(root);

        while (!treeNodeStack.empty()) {
            TreeNode node = treeNodeStack.pop();
            preOrderList.add(node);
            if (node.right != null) {
                treeNodeStack.add(node.right);
            }
            if (node.left != null) {
                treeNodeStack.add(node.left);
            }
        }
        return preOrderList;
    }

    public static List<TreeNode> postorderTraversal(TreeNode root) {
        Stack<TreeNode> treeNodeStack = new Stack<>();
        List<TreeNode> postOrderList = new ArrayList<>();
        treeNodeStack.add(root);

        while (!treeNodeStack.empty()) {
            while (root.left != null) {
                treeNodeStack.add(root);
                root = root.left;
            }
            if (root.right == null) {
                postOrderList.add(root);
                root = treeNodeStack.pop();
            } else {
                treeNodeStack.add(root.right);
            }

        }
        return postOrderList;
    }

    public static void main(String[] args) {

    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
