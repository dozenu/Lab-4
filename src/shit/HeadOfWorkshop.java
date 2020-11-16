package shit;

public class HeadOfWorkshop implements Object, Employee {
    private String name;
    private String surname;
    private String middleName;
    private String sex;
    private String dateOfBirth;
    private int workExperience;
    private double salary;
    private String workshopName;
    private int subordinateNumber;

    public HeadOfWorkshop() {
        name="no information";
        surname="no information";
        middleName="no information";
        sex="no information";
        dateOfBirth="no information";
        workExperience=0;
        salary=0;
        workshopName="no information";
        subordinateNumber=0;
    }

    public HeadOfWorkshop(String name, String surname, String middleName, String sex, String dateOfBirth, int workExperience, double salary, String workshopName, int subordinateNumber) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.workExperience = workExperience;
        this.salary = salary;
        this.workshopName = workshopName;
        this.subordinateNumber = subordinateNumber;
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

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public int getSubordinateNumber() {
        return subordinateNumber;
    }

    public void setSubordinateNumber(int subordinateNumber) {
        this.subordinateNumber = subordinateNumber;
    }

    @Override
    public void print() {
        System.out.println("\nИмя: "+getName()+"\nФамилия: "+getSurname()+"\nОтчество: "+getMiddleName()+"\nПол: "+getSex()+"\nДата рождения: "+getDateOfBirth()+"\nСтаж работы: "+getWorkExperience()+"\nЗарплата: "+getSalary()+"\nНазвание цеха: "+workshopName+"\nКоличество подчинённых: "+subordinateNumber);
    }

    @Override
    public double Taxes() {
        double salaryWithTaxes;
        salaryWithTaxes = salary-salary*0.60;
        System.out.println("Зарплата Начальника цеха с уплатой налогов: "+salaryWithTaxes);
        return salaryWithTaxes;
    }
}
