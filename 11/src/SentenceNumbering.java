import java.io.*;

public class SentenceNumbering {
    public static void main(String[] args) {
        try {
            // Чтение текстового файла
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            int sentenceCount = 0;
            StringBuilder resultBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] sentences = line.split("[.!?]\\s");
                for (String sentence : sentences) {
                    sentenceCount++;
                    resultBuilder.append(sentence).append("[").append(sentenceCount).append("] ");
                }
            }
            reader.close();

            String result = resultBuilder.toString();

            // Вывод текста с нумерацией предложений
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
