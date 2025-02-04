import java.util.Random;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;


    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }


    void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.nickname);
        }
    }

    void describePet() {
        if (pet != null) {
            String slyness = pet.trickLevel > 50 ? "very sly" : "almost not sly";
            System.out.println("I have a " + pet.species + ". He is " + pet.age + " years old, he is " + slyness);
        }
    }

    boolean feedPet(boolean isTimeForFeeding, Pet pet) {
        if (pet != null) {
            if (isTimeForFeeding) {
                System.out.println("Hm... I will feed " + name + "'s " + pet.species);
                return true;
            }
            else {
                Random random = new Random();
                int randomNumber = random.nextInt(101);
                System.out.println("tricklevel is " + pet.trickLevel + " / random number is " + randomNumber);
                if (pet.trickLevel > randomNumber) {
                    System.out.println("Hm... I will feed " + name + "'s " + pet.species);
                    return true;
                }
                else {
                    System.out.println("I think " + name + "'s " + pet.species + " is not hungry.");
                    return false;
                }

            }
        }
        return false;

    }
    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, mother=%s, father=%s, pet=%s}",
                name, surname, year, iq,
                mother != null ? mother.name + " " + mother.surname : "null",
                father != null ? father.name + " " + father.surname : "null",
                pet);
    }
}





