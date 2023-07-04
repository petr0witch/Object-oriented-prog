import com.sun.management.GarbageCollectionNotificationInfo;

public class Animal {
    private String name;
    private Integer age;
    private String species;
    private Boolean vaccinated;
    private String color;
    private Owner owner;
    private Integer legs;

    // private - внутри класса, public - везде, protected - поля видны в классе и его наследниках
    public Animal(String name, Integer age, String species, Boolean vaccinated,
                  String color, Owner owner, Integer legs) {
        this.name = name; //левое - private; правое name - это name из "public Animal(String name,.."
        this.age = age;
        this.species = species;
        this.vaccinated = vaccinated;
        this.color = color;
        this.owner = owner;
        this.legs = legs;
    }
    public Animal(String species, String color, Integer legs) { // Animal - тип объекта и имя
                        this(null, null, species, null, color, null, legs);
    }
    // public Animal(String a, String b, Double c){} - можно создать такой же класс, но с другими типами или кол-вом
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) { // а не static - относятся к экземпляру класса
        this.age = age;
    }

    public static void foo(){ // static - метод относящийся к классу,
        System.out.println("I'm foo");
    }

    // HW
    protected void toGo(){
        System.out.println("Animal is going to ");
    }
    public void toFly(){
        System.out.println("Animal is flying ");
    }
    protected void toSwim(){
        System.out.println("Animal is swimming ");
    }

    @Override
    public String toString() {
        return String.format("Animal: {name = %s, owner = %s}", name, owner); // не static, so обращение к экземпляру
    }
}
