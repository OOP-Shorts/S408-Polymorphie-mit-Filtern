public class Main {

    private static final Animal[] ANIMAL_LIST = {
            new Dog("Rex", 5, "German Shepherd"),
            new Cat("Fluffy", 2, true),
            new Cat("Miezi", 13, false),
            new Cat("Moritz", 4, false),
            new Dog("Fiffy", 9, "Border Collie")
    };

    public static void main(String[] args) {
        Dog[] dogs = removeCatsFromList(ANIMAL_LIST);
        System.out.println(dogs.length);
    }


    private static Dog[] removeCatsFromList(Animal[] animals) {
        int numOfDogs = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                numOfDogs++;
            }
        }
        Dog[] dogs = new Dog[numOfDogs];
        int dogCounter = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogs[dogCounter] = (Dog) animal;
                dogCounter++;
            }
        }
        return dogs;
    }
}