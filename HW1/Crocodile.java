public class Crocodile extends Animal {
    public Crocodile (String name, Integer age, String species, Boolean vaccinated, String color, Owner owner, Integer legs) {
        super(name, age, species, vaccinated, color, owner, legs);
    }
    public void toFly(){
        System.out.println("Crocodile cannot fly ");
    }
}
