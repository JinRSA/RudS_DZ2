package animals;

import foods.Food;
import foods.Meat;

public abstract class Carnivorous extends Animal {
    public Carnivorous() {}

    public Carnivorous(final String name) { super(name); }

    public Carnivorous(final String name, final int prettiness, final int satiety) {
        super(name, prettiness, satiety);
    }

    @Override
    public void eat(final Food food) {
        if (food instanceof Meat) {
            addSatiety(food.getCalorie());
            System.out.println("Животное " + getName() + " съело " + food.getName() + ", сытость = " + getSatiety());
        }
        else {
            System.out.println(getName() + ". Плотоядный не употребляет травку.");
        }
    }
}