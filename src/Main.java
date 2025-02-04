
public class Main {
    public static void main(String[] args) {
        // Family 1
        String[] habits = {
                "eat",
                "play",
                "bite",
                "sleep"
        };
        Pet pet1 = new Pet("dog", "Qezenfer", 5, 31, habits);
        Human mother1 = new Human("Jane", "Karleone", 1950);
        Human father1 = new Human("Vito", "Karleone", 1945, null, null);
        String[][] schedule1 = {
                {"Monday", "Gym"},
                {"Tuesday", "School"}
        };
        Human child1 = new Human("Michael", "Karleone", 1977, 90, pet1, mother1, father1, schedule1);

        System.out.println(mother1);
        System.out.println(father1);
        System.out.println(child1);

        child1.greetPet();
        mother1.feedPet(false, pet1);
        pet1.eat();
        pet1.foul();
        child1.describePet();

        // Family 2
        Pet pet2 = new Pet("cat", "Mesi");
        Human mother2 = new Human("Anna", "Karenina", 1880);
        Human father2 = new Human("Alexei", "Karenin", 1878, mother2, null);
        Human child2 = new Human("Sergey", "Karenin", 1905, 69, pet2, mother2, father2, null);

        System.out.println(mother2);
        System.out.println(father2);
        System.out.println(child2);

        child2.greetPet();
        pet2.respond();
        child2.describePet();
    }
}
