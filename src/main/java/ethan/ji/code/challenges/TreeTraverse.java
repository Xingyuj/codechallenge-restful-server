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
