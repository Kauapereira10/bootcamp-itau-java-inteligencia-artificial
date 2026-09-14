public record Person2(
        String name,
        int age
) {

    public Person2 {
        System.out.println("==========");
        System.out.println(name);
        System.out.println(age);
        System.out.println("==========");
    }

    public String info(){
        return "Name: " + name + ", age: " + age;
    }
}
