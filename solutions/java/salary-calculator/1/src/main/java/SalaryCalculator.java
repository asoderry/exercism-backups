public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        int bonusMult = bonusMultiplier(productsSold);

        return bonusMult * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salaryMult = salaryMultiplier(daysSkipped);
        double bonus = bonusForProductsSold(productsSold);
        double baseSalary = 1000 * salaryMult;
        double finalSalary = Math.min(baseSalary + bonus, 2000);

        return finalSalary;
    }
}
