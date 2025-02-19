package ru.khananov;

public class MinimumDistanceBetweenBSTNodes {
  public static void main(String[] args) {
    System.out.println(new MinimumDistanceBetweenBSTNodes().minDiffInBST(
        new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6))
    ));
  }

  public int minDiffInBST(TreeNode root) {
    method(root);
    return res;
  }

  private Integer res = Integer.MAX_VALUE;
  private Integer prevVal;

  private void method(TreeNode node) {
    if (node != null) {
      method(node.left);
      if (prevVal != null) {
        res = Math.min(res, node.val - prevVal);
      }
      prevVal = node.val;
      method(node.right);
    }
  }
}
