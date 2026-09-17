public sealed abstract class Employee permits Manager, Salesman {

    private String code;
    private String nome;
    private String address;
    private int age;
    private double salary;

    public Employee(String code, String nome, String address, int age, double salary) {
        this.code = code;
        this.nome = nome;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public abstract double getFullSalary();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
