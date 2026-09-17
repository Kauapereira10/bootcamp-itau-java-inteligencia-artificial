public non-sealed class Salesman extends Employee{

    private double percentPerSoId;

    private double soldAmount;

    public Salesman(String code, String nome, String address, int age, double salary, double percentPerSoId, double soldAmount) {
        super(code, nome, address, age, salary);
        this.percentPerSoId = percentPerSoId;
        this.soldAmount = soldAmount;
    }

    public Salesman() {

    }

    @Override
    public double getFullSalary() {
        return this.getSalary() + ((soldAmount + percentPerSoId) / 100);
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode() {
        return "Codigo do Salesman " + super.getCode();
    }

    public double getPercentPerSoId() {
        return percentPerSoId;
    }

    public void setPercentPerSoId(double percentPerSoId) {
        this.percentPerSoId = percentPerSoId;
    }
}
