public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String name, int idNumber, String department, String position){
        this.department = department;
        this.name = name;
        this.idNumber = idNumber;
        this.position = position;
    }

    public Employee(String name, int idNumber){
        this(name, idNumber, "","");
    }

    public Employee(){
        this("", 0);
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString(){
        return name + " " + idNumber + " " +
                department + " " + position;
    }
}
