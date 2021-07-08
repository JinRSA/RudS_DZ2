package animals;

import foods.Food;
import foods.Grass;

public abstract class Herbivore extends Animal {
    public Herbivore() {}

    public Herbivore(final String name) { super(name); }

    public Herbivore(final String name, final int prettiness, final int satiety) {
        super(name, prettiness, satiety);
    }

    @Override
    public void eat(final Food food) {
        if (food instanceof Grass) {
            addSatiety(food.getCalorie());
            System.out.println("Животное " + getName() + " полакомилось " + food.getName() + ", сытость = " + getSatiety());
        }
        else {
            System.out.println(getName() + ". Травоядное не употребляет мясо.");
        }
    }
}