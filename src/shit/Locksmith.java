package shit;

public class Locksmith extends Worker {
    private String processingMaterial;

    public Locksmith() {
        super();
        processingMaterial = "no information";
    }

    public Locksmith(String name, String surname, String middleName, String sex, String dateOfBirth, int workExperience, double salary, int workshopNumber, int workCategory, String processingMaterial) {
        super(name, surname, middleName, sex, dateOfBirth, workExperience, salary, workshopNumber, workCategory);
        this.processingMaterial = processingMaterial;
    }

    public String getProcessingMaterial() {
        return processingMaterial;
    }

    public void setProcessingMaterial(String processingMaterial) {
        this.processingMaterial = processingMaterial;
    }

    @Override
    public double Taxes() {
        double salaryWithTaxes;
        salaryWithTaxes = salary-salary*0.45;
        System.out.println("Зарплата Слесаря с уплатой налогов: "+salaryWithTaxes);
        return salaryWithTaxes;
    }

    @Override
    public void print() {
        System.out.println("\nИмя: "+getName()+"\nФамилия: "+getSurname()+"\nОтчество: "+getMiddleName()+"\nПол: "+getSex()+"\nДата рождения: "+getDateOfBirth()+"\nСтаж работы: "+getWorkExperience()+"\nЗарплата: "+getSalary()+"\nНомер цеха: "+workshopNumber+"\nРазряд: "+workCategory+"\nВид материала: "+getProcessingMaterial());
    }
}
