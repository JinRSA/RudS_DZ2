import animals.*;
import foods.*;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Duck("Даки"),
                new Elephant("Джамбо"),
                new Fish("Золотая рыбка"),
                new Horse("Пегас"),
                new Tiger("Шерхан"),
                new Wolf("Фенрир")
        };
        Food[] foods = {
                new Fillet(40),
                new RawMeat(56),
                new Shrub(36),
                new Steak(48),
                new TreeLeaves(8),
                new Wormwood(10)
        };
        Swim[] pond = {
                (Duck)animals[0],
                (Fish)animals[2]
        };
        Worker acolyte = new Worker();
        for (Animal animal : animals) {
            for (Food food : foods) {
                acolyte.feed(animal, food);
                try {
                    acolyte.getVoice((Voice)animal);
                } catch (Exception ignored) {}
            }
        }
        System.out.println();
        for (Swim swim : pond) {
            swim.swim();
        }
    }
}