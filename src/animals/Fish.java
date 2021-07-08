package animals;

public class Fish extends Carnivorous implements ISwim {
    public Fish(final String name) { super(name); }

    public Fish(final String name, final int prettiness, final int satiety) { super(name, prettiness, satiety); }

    @Override
    public void swim() {
        System.out.println("Рыбка " + getName() + " плавает.");
        spendEnergy(3);
    }
}