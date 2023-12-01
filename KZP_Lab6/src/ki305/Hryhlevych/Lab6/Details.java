package ki305.Hryhlevych.Lab6;

public class Details {
    public static void main(String[] args) {
        Crafting<? super Cargo> crafting = new Crafting<Cargo>();
        crafting.load(new Bag(30));
        crafting.load(new Bag(20));
        crafting.load(new Box(70));
        crafting.load(new Bag(50));
        crafting.load(new Box(10));
        crafting.weight();
        crafting.remove(1);
        crafting.weight();
        Cargo cargo = crafting.findMin();
        System.out.println("The easiest cargo is: ");
        cargo.print();

    }
}
