public non-sealed class Manager extends Employee{

    private String login;
    private String password;
    private double commission;

    public Manager(String code, String nome, String address, int age, double salary, String login, String password, double commission) {
        super(code, nome, address, age, salary);
        this.login = login;
        this.password = password;
        this.commission = commission;
    }

    public Manager() {
    }

    @Override
    public double getFullSalary() {
        return this.getSalary() + this.commission;
    }

    public double getFullSalary(double extra) {
        return this.getSalary() + extra;
    }

    @Override
    public String getCode() {
        return "Codigo do Manager " + super.getCode();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
