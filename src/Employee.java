
public class Employee {
    private int id;
    private String name;
    private double salary;
    private int age;
    private String title;
    private String department;
    
//default constructor
    public Employee(){

    }
    public Employee(int id, String name, double salary, int age, String title, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.title = title;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getTitle() {
    	return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public String getDepartment() {
    	return department;
    }
    
    public void setDepartment(String department) {
    	this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", title=" + title +'\''+
                ", department=" + department + '\''+
                '}';
    }
}
