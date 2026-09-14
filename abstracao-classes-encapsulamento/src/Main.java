public class Main {

    public static void main(String[] args) {
        Person person = new Person("Kaua", 20);
        System.out.println(person.getName() + " tem " + person.getAge() + " anos de idade.");

        Person2 person2 = new Person2("Kaua", 30);
        System.out.println(person2.name());
        System.out.println(person2.age());
    }
}
