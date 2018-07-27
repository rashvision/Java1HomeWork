import java.util.Random;
import java.util.Scanner;

/** Домашнее задание №5
 * @version 27.07.2018
 * @author Рашид Бахмутов
 *
 * * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * * Конструктор класса должен заполнять эти поля при создании объекта;
 * * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * * Создать массив из 5 сотрудников
 * Пример:
 * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 * persArray[1] = new Person(...);
 * ...
 * persArray[4] = new Person(...);
 *
 * * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */

class Homework5 {

    static void start() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович","Самый младший программист","prog1@mail.ru","111-11-11",10000f,20);
        employees[1] = new Employee("Иванян Иван Иванович","Младший программист","prog2@mail.ru","111-11-12",20000f,30);
        employees[2] = new Employee("Иванидзе Иван Иванович","Средний программист","prog3@mail.ru","111-11-13",30000f,40);
        employees[3] = new Employee("Иванько Иван Иванович","Старший программист","prog4@mail.ru","111-11-14",40000f,50);
        employees[4] = new Employee("Иванкевич Иван Иванович","Самый старший программист","prog5@mail.ru","111-11-15",50000f,60);

        for (Employee employee:employees) {
            if (employee.getAge() > 40)
                employee.printInformation();
        }

    }

    public static class Employee {
        private String name;
        private String position;
        private String email;
        private String phoneNumber;
        private Float salary;
        private Integer age;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getPosition() {
            return position;
        }
        public void setPosition(String position) {
            this.position = position;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        public Float getSalary() {
            return salary;
        }
        public void setSalary(Float salary) {
            this.salary = salary;
        }
        public Integer getAge() {
            return age;
        }
        public void setAge(Integer age) {
            this.age = age;
        }

        Employee(String name, String position, String email, String phoneNumber, Float salary, Integer age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this. phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        void printInformation() {
            System.out.println("Сотрудник: " + name + ", должность: " + position + ", email: " + email + ", номер телефона: " + phoneNumber + ", зарплата: " + salary + ", возраст: " + age) ;
        }

    }

}

