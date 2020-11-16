package shit;

public class Director implements Object, Employee {
    private String name;
    private String surname;
    private String middleName;
    private String sex;
    private String dateOfBirth;
    private int workExperience;
    private double salary;
    private int termOfElection;

    public Director () {
        name="no information";
        surname="no information";
        middleName="no information";
        sex="no information";
        dateOfBirth="no information";
        workExperience=0;
        salary=0;
        termOfElection=0;
    }

    public Director(String name, String surname, String middleName, String sex, String dateOfBirth, int workExperience, double salary, int termOfElection) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.workExperience = workExperience;
        this.salary = salary;
        this.termOfElection = termOfElection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTermOfElection() {
        return termOfElection;
    }

    public void setTermOfElection(int termOfElection) {
        this.termOfElection = termOfElection;
    }

    @Override
    public void print() {
        System.out.println("\nИмя: "+getName()+"\nФамилия: "+getSurname()+"\nОтчество: "+getMiddleName()+"\nПол: "+getSex()+"\nДата рождения: "+getDateOfBirth()+"\nСтаж работы: "+getWorkExperience()+"\nЗарплата: "+getSalary()+"\nСрок избрания: "+termOfElection);
    }

    @Override
    public double Taxes() {
        double salaryWithTaxes;
        salaryWithTaxes = salary-salary*0.50;
        System.out.println("Зарплата Директора завода с уплатой налогов: "+salaryWithTaxes);
        return salaryWithTaxes;
    }
}
