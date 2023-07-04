public class Sova extends Animal {
    private Integer wing; // Крыло
    public Sova (String name, Integer age, String species, Boolean vaccinated, String color, Owner owner, Integer legs) {
        super(name, age, species, vaccinated, color, owner, legs);
        this.wing = 2;
    }

    public void toSwim(){
        System.out.println("Sova cannot swim");
    }

}
