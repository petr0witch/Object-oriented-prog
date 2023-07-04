import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Lucky", 5, "Dog", true, "Brown", new Owner("Kirill"), 4);
        Animal animal1 = new Animal("Dog", "Black", 4); // animal1 - экземпляр класса
        System.out.println(animal.getAge());
        animal.setAge(6);
        System.out.println(animal.getAge());
        Animal.foo();

        System.out.println(animal);

        AnimalNew animalNew = new AnimalNew(null, null,null,null,null,null,null);
        animalNew.getAge();
        System.out.println(animalNew);

        Animal cat = new AnimalNew();
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog(null, null, null,null, null, null, null));
        animals.add(new Cat(null, null, null,null, null, null, null));

        animals.add(cat);
        animals.add(animal);
        animals.add(animal1);
        System.out.println(animals);

//        for (Animal item : animals) {
//            if(item instanceof AnimalNew) {
//                System.out.println(((AnimalNew) item).getEyes());
//            }
//            if(item instanceof Cat){
//                ((Cat) item).FindFood(3);
//                ((Cat) item).FindFood();
//            }
//        }
        Cat dymka = new Cat(null, null, null,null, null, null, null);
            dymka.Hunts(13);
//        dymka.FindFood();
//        dymka.Eat();
//        dymka.Sleep();

        Sova sova1 = new Sova(null, null, null,null, null, null, null);
        sova1.toFly();
        Crocodile croc1 = new Crocodile(null, null, null,null, null, null, null);
        croc1.toFly();
        dymka.toSwim();
        sova1.toSwim();
        animal.toSwim();

        animal.toGo();
        dymka.toGo();
        sova1.toGo();
    }
}
