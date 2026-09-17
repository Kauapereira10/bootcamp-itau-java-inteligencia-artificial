public class Main {

    public static void main(String[] args) {

        Employee manager = new Manager();

        printEmployee(new Manager());
        System.out.println("===========================");
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employee employee) {

        switch (employee) {
            case Manager manager -> {
                employee.setCode("123");
                employee.setNome("Kaua");
                employee.setAge(20);
                employee.setAddress("Jardim Juana");
                employee.setSalary(1200);
                manager.setCommission(250.32);
                manager.getFullSalary(50);
                manager.setLogin("kaua@gmail.com");
                manager.setPassword("1234");

                System.out.println(employee.getClass());
                System.out.println("Codigo: " + employee.getCode());
                System.out.println("Nome: " + employee.getNome());
                System.out.println("Idade: " + employee.getAge());
                System.out.println("Endereço: " + employee.getAddress());
                System.out.println("Salario com extra: " + manager.getFullSalary(50));
                System.out.println("Comissão: " + manager.getCommission());
                System.out.println("Login: " + manager.getLogin());
                System.out.println("Senha: " + manager.getPassword());
            }
            case Salesman salesman -> {
                employee.setCode("22");
                employee.setNome("Joao");
                employee.setAge(25);
                employee.setAddress("Lua Juana");
                employee.setSalary(2200);

                salesman.setPercentPerSoId(10);
                salesman.setSoldAmount(1000);

                System.out.println(employee.getClass());
                System.out.println("Codigo: " + employee.getCode());
                System.out.println("Nome: " + employee.getNome());
                System.out.println("Idade: " + employee.getAge());
                System.out.println("Endereço: " + employee.getAddress());
                System.out.println("Salario: " + salesman.getFullSalary());
                System.out.println("Comissão: " + salesman.getPercentPerSoId());
            }
            default -> throw new IllegalStateException("Unexpected value: " + employee);
        }

    }
}
