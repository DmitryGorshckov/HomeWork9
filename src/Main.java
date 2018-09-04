import ru.gorshckov.animals.Cat;
import ru.gorshckov.animals.Tiger;
import ru.gorshckov.human.Person1;
import ru.gorshckov.human.Person2;
import ru.gorshckov.human.Person3;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("barsik",7,"blue");
        cat1.getName();
        cat1.run();
        Tiger tiger1 = new Tiger("zeus",12,"orange and striped");
        tiger1.getName();
        tiger1.run();
        tiger1.swim();
        System.out.println("---------------");
        Person1 person1 = new Person1("ivan",32,2);
        person1.run();
        person1.swim();
        System.out.println("--------------");
        Person2 person2 = new Person2("oleg",56,2);
        person2.run();
        System.out.println("--------------");
        Person3 person3 = new Person3("Bob",40,0);
        person3.run();
        person3.swim();
    }
}
