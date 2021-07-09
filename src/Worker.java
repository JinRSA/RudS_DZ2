import animals.Animal;
import animals.Voice;
import foods.Food;

public class Worker {
    public void feed(Animal animal, Food food) { animal.eat(food); }

    public String getVoice(Voice voiceableAnimal) { return voiceableAnimal.voice(); }
}