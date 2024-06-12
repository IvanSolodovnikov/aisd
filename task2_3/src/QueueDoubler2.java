import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDoubler2 {

    private static void processQueue(Queue<String> queue) {
        int i = 0;
        int len = queue.size();
        while (i < len) {
            String element = queue.remove();
            queue.add(element);
            queue.add(element);
            i++;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Queue Doubler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);

        JPanel panel = new JPanel(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(1, 1));
        JPanel bottomPanel = new JPanel(new GridLayout(1, 1));

        JTextArea outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        JButton button = new JButton("Обработать очередь");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Queue<String> queue = new LinkedList<>();
                try {
                    Scanner fileScanner = new Scanner(new File("H:\\Java прога\\task2_3\\src\\queue.txt"));
                    while (fileScanner.hasNextLine()) {
                        queue.add(fileScanner.nextLine());
                    }
                    fileScanner.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("Файл не найден!");
                    return;
                }

                processQueue(queue);
                outputArea.setText("результат:\n");
                while (!queue.isEmpty()) {
                    outputArea.append(queue.remove() + "\n");
                }
            }
        });

        topPanel.add(scrollPane);
        bottomPanel.add(button);
        panel.add(topPanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(panel);
        frame.setVisible(true);
    }
}