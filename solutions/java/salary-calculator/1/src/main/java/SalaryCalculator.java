public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double booster = 1.00;
        boolean reduction = daysSkipped>=5 ;
        booster -= reduction ? 0.15:0.00 ;
        return booster;
            
    }

    public int bonusMultiplier(int productsSold) {
        boolean twenty = productsSold >=20;
        int mul = twenty ? 13:10;
        return mul;
            
    }

    public double bonusForProductsSold(int productsSold) {
        return  productsSold * bonusMultiplier(productsSold);
            
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double fi =  1000.00 *salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        boolean vrra = fi <=2000.00;
        double fin = vrra ? fi:2000.00;
        return fin;
    } 
}
