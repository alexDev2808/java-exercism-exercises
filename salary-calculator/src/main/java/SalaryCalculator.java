public class SalaryCalculator {
    private final int SALARY = 1000;
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double result = (SALARY + bonusForProductsSold(productsSold)) * salaryMultiplier(daysSkipped);
        return result <= 2000 ? result : 2000;
    }
}
