import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode root = createTree(scanner);
        MaximumInBinaryTree solution = new MaximumInBinaryTree();
        int max = solution.findMax(root);
        System.out.println("Максимум в дереве: " + max);    }
    private static TreeNode createTree(Scanner scanner) {
        System.out.println("Введите значение узла (или 'null' для пустого узла):");
        String input = scanner.nextLine();
        if (input.equals("null")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(input));
        System.out.println("Введите левого потомка для узла " + node.val + ":");
        node.left = createTree(scanner);
        System.out.println("Введите правого потомка для узла " + node.val + ":");
        node.right = createTree(scanner);
        return node;    }
}


