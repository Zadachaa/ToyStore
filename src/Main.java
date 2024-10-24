import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        ToyQueue queue = new ToyQueue(new String[] { "1,sward,1", "2,shield,2", "3,helmet,2" });
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("peek_results.csv"), StandardCharsets.UTF_8))) {
            for (int i = 0; i < 10; i++) {
                writer.write(queue.peek().toCsvString() + "\n");
            }
        }
        queue.put("4", "ball", "10");
        System.out.println("poll");
        System.out.println(queue.poll());
        System.out.println("peek");
        for (int i = 0; i < 10; i++) {
            System.out.println(queue.peek());
        }
    }
}