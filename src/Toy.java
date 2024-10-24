public class Toy {
    private String name;
    private int id;
    private int weight;

    public Toy(String id, String name, String weight) {
        this.id = Integer.parseInt(id);
        this.name = name;
        this.weight = Integer.parseInt(weight);
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", weight=" + weight +
                '}';
    }
}
