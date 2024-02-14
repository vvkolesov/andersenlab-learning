package com.andersenlab.lecture4.homework4.catsAndPlates;

public class Plate {

    private int foodQuantity;

    public Plate(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    //● Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например,
    // в миске 10 еды, а кот пытается покушать 15-20).
    //● Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
    // то есть не может быть наполовину сыт (это сделано для упрощения логики программы). --> This is why I used Exception
    public void decreaseFood(int n) throws Exception {
        if (n > foodQuantity) {
            throw new Exception("There are too little food in the plate: " + foodQuantity + " it's not enough");
        } else {
            foodQuantity -= n;
        }
    }

    public void info() {
        System.out.println("Leftover food in plate: " + foodQuantity);
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    //● Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public int putFoodToPlate(int foodQuantity, int extraFood) {
        return this.foodQuantity = foodQuantity + extraFood;
    }
}
