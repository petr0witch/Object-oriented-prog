import java.util.Arrays;

public class Cat extends Animal {

    public Cat(String name, Integer age, String species, Boolean vaccinated, String color, Owner owner, Integer legs) {
        super(name, age, species, vaccinated, color, owner, legs);
    }

    // Полиморфизм на уровне метода:
    //Перегрузка метода, есть несколько вариантов исполнения
    private void FindFood() {
        System.out.println("Cat found food!");
    }
    private void FindFood(int... args){
        System.out.println("Cat found food, count = " + Arrays.toString(args));
    }
    private void WakeUp(){
        System.out.println("Cat wakes up ");
    }
    private void Sleep(){
        System.out.println("Cat sleeps ");
    }
    private void Eat(){ // Инкапсуляция, сокрытие логики от внешних воздействий
        System.out.println("Cat is eating ");
    }
    public void toFly(){
        System.out.println("Cat cannot fly ");
    }
    public void Hunts(int... args){
        WakeUp();
        FindFood(args);
        Eat();
        Sleep();
    }
}
