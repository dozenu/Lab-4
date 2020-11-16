package shit;

public class Turner extends Worker {
    private int machineNumber;

    public Turner() {
        super();
        machineNumber = 0;
    }

    public Turner(String name, String surname, String middleName, String sex, String dateOfBirth, int workExperience, double salary, int workshopNumber, int workCategory, int machineNumber) {
        super(name, surname, middleName, sex, dateOfBirth, workExperience, salary, workshopNumber, workCategory);
        this.machineNumber = machineNumber;
    }

    public int getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(int machineNumber) {
        this.machineNumber = machineNumber;
    }

    @Override
    public double Taxes() {
        double salaryWithTaxes;
        salaryWithTaxes = salary-salary*0.40;
        System.out.println("Зарплата Токаря с уплатой налогов: "+salaryWithTaxes);
        return salaryWithTaxes;
    }

    @Override
    public void print() {
        System.out.println("\nИмя: "+getName()+"\nФамилия: "+getSurname()+"\nОтчество: "+getMiddleName()+"\nПол: "+getSex()+"\nДата рождения: "+getDateOfBirth()+"\nСтаж работы: "+getWorkExperience()+"\nЗарплата: "+getSalary()+"\nНомер цеха: "+workshopNumber+"\nРазряд: "+workCategory+"\nНомер станка: "+getMachineNumber());
    }
}
