public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Emre","Özenses",39,"male","istanbul","dev");

        System.out.println("İsim:"+person1.getFirstName()+" Soyisim:"+person1.getLastName()+" Yaş:"+person1.getAge());
        System.out.println("Teen mi?:"+person1.isTeen());
        System.out.println(person1);
    }


}