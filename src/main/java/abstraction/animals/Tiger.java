package abstraction.animals;

import abstraction.food.Food;

public class Tiger extends Animal {
    @Override
    public void eat(Food food) {
        if(food.getType().equals("meat")){
            System.out.println("Eaten!");
        }
        else System.out.println("NOOOO!");
    }
}
