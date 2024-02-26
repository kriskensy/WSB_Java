package pl.kriskensy.testing;

public class TestCharacter {
    private String name;
    private String characterClass;
    private String race;
    private int strength;

    public TestCharacter(String name, String characterClass, String race, int strength) {
        this.name = name;
        this.characterClass = characterClass;
        this.race = race;
        this.strength = strength;
    }

    public static void main(String[] args) {

        TestCharacter Person = new TestCharacter("Staszek", "warrior ", "tiki-taki", 20);
        System.out.println("Test character " + Person.toString());
    }

    @Override
    public String toString() {
        return "Name: " + name + ", class: " + characterClass + ", race: " + race + ", strength: " + strength;
    }
}