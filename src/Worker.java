import animals.Animal;
import animals.IVoice;
import foods.Food;

public class Worker {
    public void feed(Animal animal, Food food) { animal.eat(food); }

    public void getVoice(IVoice voiceableAnimal) { voiceableAnimal.voice(); }
}