package JavaBreakthrough.ClassesAndObjects.AnonClasses;

public class AnimalTest {

    public void eatTest() {
        System.out.println("Animal is eating");
    }
}

class OtherAnimalTest extends AnimalTest {

    @Override
    public void eatTest() {
        System.out.println("Other Animal is eating");
    }

}
