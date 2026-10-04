abstract class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
    abstract double calculateMonthlyStipend();

}
class UndergraduateStudent extends Student {
    double gpa;
    UndergraduateStudent(String name, double gpa) {
        super(name);
        this.gpa = gpa;

    }
    @override
    double calculateMonthlyStipend() {
        double stipend = 500;
        if (gpa > 3.5) {
            stipend +=150;
        }
return stipend;
    }
}
class GraduateStudent extends Student {
    double taHours;
    double yearlyResearchGrant;
    GraduateStudent(String name, double taHours, double yearlyResearchGrant) {
        super(name);
        this.taHours = taHours;
        this.yearlyResearchGrant = yearlyResearchGrant;
    }
    @Override 
    double calculateMonthlyStipend() {
        double base = 1200;
        double tapay = taHours * 25;
        double monthlyGrant = yearlyResearchGrant / 12;
return base + tapay + monthlyGrant;

    }
}
public class Main {
public static void main(String[] args) {
    Student[] students = {
        new UndergraduateStudent("Amina", 3.8),
        new UndergraduateStudent("Eric", 3.5),
        new GraduateStudent("Grace", 40, 12000)
    };

    for (Student s : students) {
        System.out.println(s.name + "gets $" + s.calculateMonthlyStipend());
    }
}
}
