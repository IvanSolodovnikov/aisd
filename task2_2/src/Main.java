import java.util.Scanner;

public class Main {
    private static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode root = createTree(scanner);
        MinimumTree solution = new MinimumTree();
        Integer min = solution.findMin(root);
        System.out.println("Минимум в дереве: " + min);

    }
    private static TreeNode createTree(Scanner scanner) {

        System.out.println("Введите значение узла (или 'q' для пустого узла):");
        String input = scanner.nextLine();
        if (input.equals("q")) {
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(input), ++count);
        System.out.println("Введите левого потомка для узла " + node.count + ":");
        node.left = createTree(scanner);
        System.out.println("Введите правого потомка для узла " + node.count + ":");
        node.right = createTree(scanner);
        return node;    }
}


