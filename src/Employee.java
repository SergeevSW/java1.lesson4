/**
 * Created by serg on 03.05.16.
 */
public class Employee {
    String name;
    String position;
    String email;
    String phone;
    float amount;
    int age;

    public Employee() {
        this.name = "vacancy name";
        this.position = "vacancy position";
        this.email = "noreply@acme.com";
        this.phone = "123-456-78-90";
        this.amount = 0;
        this.age = 18;
    }

    public Employee(String name, String position, String email, String phone, float amount, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.amount = amount;
        this.age = age;
    }

    public void info(){
        System.out.println("name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", amount=" + amount +
                ", age=" + age);
        System.out.println();
    }



}
