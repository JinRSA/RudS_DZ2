package animals;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    public Duck(final String name) { super(name); }

    public Duck(final String name, final int prettiness, final int satiety) { super(name, prettiness, satiety); }

    @Override
    public void fly() {
        System.out.println("Уточка " + getName() + " полетела.");
        spendEnergy(15);
    }

    @Override
    public void run() {
        System.out.println("Уточка " + getName() + " убегает.");
        spendEnergy();
    }

    @Override
    public void swim() {
        System.out.println("Уточка " + getName() + " плавает.");
        spendEnergy(8);
    }

    @Override
    public String voice() {
        spendEnergy(2);
        return getName() + ": Кря-кря.";
    }
}