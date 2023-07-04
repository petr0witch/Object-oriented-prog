public class AnimalNew extends Animal{
    private Integer eyes;
    public AnimalNew(String name, Integer age, String species, Boolean vaccinated, String color, Owner owner, Integer legs) {
        super(name, age, species, vaccinated, color, owner, legs);
        this.eyes = 2;

    }
    public AnimalNew(){
        super(null, null, null, null, null, null, null);

    }
    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public String toString() {
        return "I'm animalNew";
    }

    public Integer getEyes() {
        return eyes;
    }
}
