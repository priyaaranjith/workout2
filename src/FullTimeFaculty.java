import java.util.Scanner;

public class FullTimeFaculty extends Faculty {
    float basic;
    float allowance;

    public void AddData() {
        Scanner X = new Scanner(System.in);
        System.out.println("Enter Faculty ID:");
        super.facultyId = X.nextInt();
        System.out.println("Enter Basic:");
        this.basic = X.nextFloat();
        System.out.println("Enter Allowance:");
        this.allowance = X.nextFloat();
    }

    public void CalculateSalary() {
        super.salary = (basic + allowance);
    }

    public void ShowData() {
        CalculateSalary();
        System.out.println("ID= " + facultyId);
        System.out.println("Salary= " + salary);
    }
}

