package JavaBreakthrough.GenericsExp;

import java.util.ArrayList;
import java.util.List;

public class WildcardsExp {
    public static void main(String[] args) {

        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Animal(1));
        animalsList.add(new Animal(2));

        List<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog());
        dogsList.add(new Dog());

        test(animalsList);
        test(dogsList); // мы не можем использовать этот метод на наследника, хотя полиморфизм вроде так работает


    }

//    public static void test(List<Animal> list) { // Мы можем изменить конкретный List, на List<?>, чтобы метод работал на любые объекты,
//        // либо List<? extends Animal>, чтобы работал метод на объекты Animal и его наследниках,
//        // либо List<? super Animal>, чтобы работал метод на объекты Animal и все, что стоит выше, т.е. в данном случае на Object
//        for (Animal animal : list) {
//            System.out.println(animal);
//        }
//    }

    //С таким методом мы можем обращаться к методам наследника и к методам родителя
    public static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
            animal.eat(); // метод родителя и метод наследника
        }
    }

}
