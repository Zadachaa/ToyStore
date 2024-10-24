public class Main {
    public static void main(String[] args) {
        ToyQueue queue = new ToyQueue(new String[] { "1,sward,1", "2,shield,2", "3,helmet,2" });
        queue.put("4", "ball", "10");
        System.out.println("peek");
        for (int i = 0; i < 10; i++) {
            System.out.println(queue.peek());
        }
        System.out.println("poll");
        System.out.println(queue.poll());
        System.out.println("peek");
        for (int i = 0; i < 10; i++) {
            System.out.println(queue.peek());
        }
    }
}