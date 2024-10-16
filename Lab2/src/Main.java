import java.util.ArrayList;
import java.util.Scanner;


//Система управління зоопарком: Створіть ієрархію класів для різних типів тварин.
//Реалізуйте методи для годування, догляду та звуків, які видають тварини.
//Застосуйте поліморфізм для управління різними видами тварин через єдиний інтерфейс.


public class Main {
    public static void main(String[] args) {
        int choice;
        ZooManager zoo = new ZooManager();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("You`ve entered our Zoo!\nChoose how you can help us today:\n take care of the whole zoo - press 1\n check on one exact animal - press 2\n exit - press 0\n");

            while (!scanner.hasNextInt()) {  // Handle invalid input types
                System.out.println("Invalid input. Please enter a number 1, 2 or 0.");
                scanner.next();  // Consume the invalid input
            }

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You`re going to take care of the whole zoo!");
                    zoo.WholeZoo();
                    break;
                case 2:
                    System.out.println("You`re going to check on one animal. Please, enter the name of the animal:");
                    String animalName = scanner.next();
                    zoo.OneAnimal(animalName);
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }while(choice != 0);


    }
    }

abstract class Animal{
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    void feed(){System.out.println(name + " is fed now");};

    abstract void care();

    abstract void soundmake();

}


class Amphibian extends Animal{
    public Amphibian(String name) {
        super(name);
    }
    @Override
    void care(){System.out.println("An Amphibian " + name + " has access to clean water now");}
    @Override
    void soundmake(){System.out.println("An Amphibian " + name + " says 'Qua-qua'");}

}

class Reptile extends Animal{
    public Reptile(String name) {
        super(name);
    }
    @Override
    void care(){System.out.println("A reptile " + name + " has access to clean water and good grass now");}
    @Override
    void soundmake(){System.out.println("A reptile " + name + " says 'shhhhhh'");}

}

class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }
    @Override
    void care(){System.out.println("A bird " + name + " has clean cage now");}
    @Override
    void soundmake(){System.out.println("A bird " + name + " says 'chirp-chirp'");}

}

class Mammal extends  Animal{
    public Mammal(String name) {
        super(name);
    }
    @Override
    void care(){System.out.println("A mammal " + name + " has clean cage now");}
    @Override
    void soundmake(){System.out.println("A mammal " + name + " talks");}

}

class ZooManager{
    AnimalsArray animalsArray = new AnimalsArray();
    ArrayList<Animal> mainArray = animalsArray.main();

    void performAnimalActions(Animal animal){
        animal.feed();
        animal.care();
        animal.soundmake();
        System.out.println();
    }


    void WholeZoo(){
        for (Animal animal: mainArray ){
            performAnimalActions(animal);
        }
    }

    private Animal FindAnimalByName(ArrayList<Animal> arr, String name){
        for (Animal animal : arr) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }
    void OneAnimal(String animalName){
        Animal resultAnimal = FindAnimalByName(mainArray, animalName);
        if (resultAnimal != null){
            performAnimalActions(resultAnimal);
        }else{
            System.out.println("This animal is not found, enter the valid name");
        }
    }

}

class AnimalsArray{
    ArrayList<Animal> main() {
        ArrayList<Animal> arr = new ArrayList<>();
        Animal frog = new Amphibian("Quak");
        Animal kingSnake = new Reptile("Priscilla");
        Animal downyChicken = new Bird("Kyle");
        Animal whiteAlpaca = new Mammal("Derek");

        arr.add(frog);
        arr.add(kingSnake);
        arr.add(downyChicken);
        arr.add(whiteAlpaca);
        return arr;
    }
}