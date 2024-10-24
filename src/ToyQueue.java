import java.util.ArrayList;

public class ToyQueue {
    ArrayList<Toy> toys = new ArrayList<>();

    public ToyQueue(String [] toys) {
        for (int i = 0; i < toys.length; i++) {
            String newToy = toys[i];
            String[] toyArgs = newToy.split(",");
            put(toyArgs[0], toyArgs[1], toyArgs[2]);
        }
    }

    public void put(String id, String name, String weight) {
        Toy toy = new Toy(id, name, weight);
        toys.add(toy);
    }

    public Toy peek() {
        int sumWeight = 0;
        for (int i = 0; i < toys.size(); i++) {
            sumWeight += toys.get(i).getWeight();
        }
        //Math.random() = [0, 1)
        //toy1: 2
        //toy2: 2
        //toy3: 5
        //sumWeight: 5
        // 0 1 2 3 4 5 6 7 8
        // random < sumWeightSoFar [0, sumWeight)
        // random 3 < 4
        int random = (int) (Math.random() * sumWeight);
//        System.out.println("random: " + random);
        int sumWeightSoFar = 0;
        for (int i = 0; i < toys.size(); i++) {
            sumWeightSoFar += toys.get(i).getWeight();
            if (random < sumWeightSoFar) {
//                System.out.println("chosen index: " + i);
                return toys.get(i);
            }
        }
        //Мы никогда сюда не попадем
        return null;
    }

    public Toy poll() {
        Toy toy = peek();
        toys.remove(toy);
        return toy;
    }

}
