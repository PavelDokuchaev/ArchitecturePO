package SRP;

public class CalculateSalary {
    private int baseSalary;

    public CalculateSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 1.5);
        return baseSalary - tax;
    }

}
