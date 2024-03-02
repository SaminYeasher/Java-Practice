// Flying interface
interface Flying {
    public void fly();
}

// Swimming interface
interface Swimming {
    public void swim();
}

// Bird class implementing Flying interface
class Bird implements Flying,Swimming {
     String species;

    public Bird(String species) {
        this.species = species;
    }

    public void fly() {
        System.out.println(species + " is flying.");
    }
    public void swim() {
        System.out.println(species + " is swimming.");
    }

    public String getSpecies() {
        return species;
    }
}

// Fish class implementing Swimming interface
class Fish implements Swimming {
    String species;

    public Fish(String species) {
        this.species = species;
    }

    public void swim() {
        System.out.println(species + " is swimming.");
    }

    public String getSpecies() {
        return species;
    }
}
// Main class to demonstrate multiple classification
public class Main10 {
    public static void main(String[] args) {
        Bird eagle = new Bird("Eagle");
        Fish shark = new Fish("Shark");

// Demonstrate flying
        System.out.println(eagle.getSpecies() + ":");
        eagle.fly();
        eagle.swim();
        System.out.println();

// Demonstrate swimming
        System.out.println(shark.getSpecies() + ":");
        shark.swim();
    }
}
