import java.util.Scanner;

class Person {
    String Name;
    String Gender;
    String Address;
    int Age;

    Person(String name, String gender, String address, int age) {
        this.Name = name;
        this.Gender = gender;
        this.Address = address;
        this.Age = age;
    }
}

class Employee extends Person {
    int Empid;
    String Company_name;
    String Qualification;
    long Salary;

    Employee(String name, String gender, String address, int age, int empid, String company_name, String qualification,
            long salary) {
        super(name, gender, address, age);
        this.Empid = empid;
        this.Company_name = company_name;
        this.Qualification = qualification;
        this.Salary = salary;
    }
}

public class Teacher extends Employee {
    String Subject;
    String Department;
    String Teacherid;

    Teacher(String name, String gender, String address, int age, int empid, String company_name, String qualification,
            long salary, String subject, String department, String teacherid) {
        super(name, gender, address, age, empid, company_name, qualification, salary);
        this.Subject = subject;
        this.Department = department;
        this.Teacherid = teacherid;
    }

    void display() {
        System.out.println("Name: " + Name);
        System.out.println("Gender: " + Gender);
        System.out.println("Address: " + Address);
        System.out.println("Age: " + Age);
        System.out.println("Employee id: " + Empid);
        System.out.println("Company Name: " + Company_name);
        System.out.println("Qualification: " + Qualification);
        System.out.println("Salary: " + Salary);
        System.out.println("Subject: " + Subject);
        System.out.println("Department: " + Department);
        System.out.println("Teacher id: " + Teacherid);
    }

    public static void main(String[] args) {
        System.out.println("\nEnter the No. of Teachers");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        Teacher[] arr = new Teacher[num];
        System.out.println("\nEnter the Teacher Details\n");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            int x = i + 1;
            System.out.println("\n" + x + ").");
            System.out.println("\nName: ");
            String a = sc.next();
            System.out.println("\nGender: ");
            String b = sc.next();
            System.out.println("\nAddress: ");
            String c = sc.next();
            sc1.nextline();
            System.out.println("\nAge: ");
            int d = sc.nextInt();
            System.out.println("\nEmployee id: ");
            int e = sc.nextInt();
            System.out.println("\nCompany name: ");
            String f = sc.next();
            System.out.println("\nQualification: ");
            String g = sc.next();
            System.out.println("\nSalary: ");
            long h = sc.nextLong();
            System.out.println("\nSubject: ");
            String k = sc.next();
            System.out.println("\nDepartment: ");
            String l = sc.next();
            System.out.println("\nTeacher Id: ");
            String n = sc.next();
            arr[i] = new Teacher(a, b, c, d, e, f, g, h, k, l, n);
        }
        sc.close();
        System.out.println("\n********Information of all the Teachers************");
        for (int i = 0; i < num; i++) {
            int j = i + 1;
            System.out.println("\n" + j + ").");
            arr[i].display();
        }
        sc1.close();
    }
}


