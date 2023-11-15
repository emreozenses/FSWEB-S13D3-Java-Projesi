package Model;

import Model.Person;
import Model.Wall;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Emre","Özenses",39,"male","istanbul","dev");

        System.out.println("İsim:"+person1.getFirstName()+" Soyisim:"+person1.getLastName()+" Yaş:"+person1.getAge());
        System.out.println("Teen mi?:"+person1.isTeen());
        System.out.println(person1);


        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }


}