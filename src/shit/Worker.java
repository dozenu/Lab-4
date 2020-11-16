package shit;

public abstract class Worker implements Object, Employee {
    protected String name;
    protected String surname;
    protected String middleName;
    protected String sex;
    protected String dateOfBirth;
    protected int workExperience;
    protected double salary;
    protected int workshopNumber;
    protected int workCategory;

    public Worker () {
        name="no information";
        surname="no information";
        middleName="no information";
        sex="no information";
        dateOfBirth="no information";
        workExperience=0;
        salary=0;
        workshopNumber=0;
        workCategory=0;
    }

    public Worker(String name, String surname, String middleName, String sex, String dateOfBirth, int workExperience, double salary, int workshopNumber, int workCategory) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.workExperience = workExperience;
        this.salary = salary;
        this.workshopNumber = workshopNumber;
        this.workCategory = workCategory;
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

    public int getWorkshopNumber() {
        return workshopNumber;
    }

    public void setWorkshopNumber(int workshopNumber) {
        this.workshopNumber = workshopNumber;
    }

    public int getWorkCategory() {
        return workCategory;
    }

    public void setWorkCategory(int workCategory) {
        this.workCategory = workCategory;
    }
}
