import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int sentenceCount = 0;
            StringBuilder resultBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                String[] sentences = line.split("[.!?]\\s");
                for (String sentence : sentences) {
                    sentenceCount++;
                    resultBuilder.append(sentence).append("[").append(sentenceCount).append("] ");
                }
            }
            reader.close();

            String result = resultBuilder.toString();

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}