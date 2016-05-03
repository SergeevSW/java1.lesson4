/**
 * Created by serg on 03.05.16.
 */
public class MainClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//        e1.info();
//        e2.info();

        Employee[] newDepEmployees = new Employee[5];
        newDepEmployees[0] = new Employee("Ivanov Petr", "Engineer", "ivpetr@mailbox.com", "892312312", 30000, 30);
        newDepEmployees[1] = new Employee("Ivanov Petr", "Engineer", "ivpetr@mailbox.com", "892312312", 35000, 35);
        newDepEmployees[2] = new Employee("Ivanov Petr", "Engineer", "ivpetr@mailbox.com", "892312312", 40000, 40);
        newDepEmployees[3] = new Employee("Ivanov Petr", "Engineer", "ivpetr@mailbox.com", "892312312", 42000, 42);
        newDepEmployees[4] = new Employee("Ivanov Petr", "Engineer", "ivpetr@mailbox.com", "892312312", 48000, 48);

        for (int i = 0; i < newDepEmployees.length; i++) {
            if (newDepEmployees[i].age > 40) {
                newDepEmployees[i].info();
            }
        }
    }
}
