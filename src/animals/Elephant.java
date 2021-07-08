package animals;

public class Elephant extends Herbivore implements IRun, ISwim, IVoice {
    public Elephant(final String name) { super(name); }

    public Elephant(final String name, final int prettiness, final int satiety) { super(name, prettiness, satiety); }

    @Override
    public void run() {
        System.out.println("Слон " + getName() + " бежит.");
        spendEnergy(16);
    }

    @Override
    public void swim() {
        System.out.println("Слон " + getName() + " плывёт.");
        spendEnergy(10);
    }

    @Override
    public String voice() {
        spendEnergy(2);
        return "Слон " + getName() + " трубит.";
    }
}