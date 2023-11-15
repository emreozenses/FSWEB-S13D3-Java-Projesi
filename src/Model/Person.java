package Model;

public class Person {

    String firstName;
    String lastName;
    int age;
    String gender;
    String homeTown;
    String job;



    public Person(String firstName,String lastName,int age){

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

     }

    public Person(String firstName,String lastName,int age,String gender,String homeTown,String job){
    this(firstName, lastName, age);
        this.gender=gender;
        this.homeTown=homeTown;
        this.job=job;
    }



    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;

    }

    public  int getAge(){
        return age;
    }

    public boolean isTeen(){

        return 13 <= age && age < 19;
    }

    @Override
    public String toString() {
        return "Model.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

}
