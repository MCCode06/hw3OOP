import java.util.Arrays;

public class Pet {
    public String species;
    public String nickname;
    public String[] habits;
    public int age;
    public int trickLevel;

    public Pet() {}

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    @Override
    public String toString() {
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}",
                species, nickname, age, trickLevel, Arrays.toString(habits));
    }

    public void eat(){
        System.out.println("I am eating...");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + this.species + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

}

