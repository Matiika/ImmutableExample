package com.immutable;

public class immutableExample {

    private final int price;
    private final int[] arr;
    private final String str;
    private final Dog dog;
    private final Dog[] dogArray;

    public immutableExample(int price, int[] arr, String str, Dog dog, Dog[] godArray) {
        this.price = price;
        this.arr = arr;
        this.str = str;
        this.dog = dog;
        this.dogArray = godArray;
    }

    public int getPrice() {
        return price;
    }

    public int[] getArr() {
        int[] copyArr = arr.clone();
        return copyArr;
    }

    public String getStr() {
        return str;
    }

    public Dog getDog() throws CloneNotSupportedException {
        Dog tempDog = new Dog();
        tempDog = (Dog) this.dog.clone();
        return tempDog;
    }

    public Dog[] getDogArray(Dog[] dogArray) throws CloneNotSupportedException {
        Dog[] tempDogArr = new Dog[dogArray.length];
        for (int i = 0; i < dogArray.length; i++) {
            tempDogArr[i] = (Dog) dogArray[i].clone();
        }
        return tempDogArr;
    }

}
