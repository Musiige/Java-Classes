public class Department {
    public String name; // Social Sciences
    public String institute; // Ndejje University

    public String getDepartmentDetails() {
        return name + " department belongs to " + institute + ".";
    }

    public String getHOD(String HOD) {
        return name + " department is headed by "+HOD+" at " + institute + ".";
    }

    public static void main(String[] args) {
        Department department1 = new Department();
        department1.name = "Computer Science";
        department1.institute = "Ndejje University";
        System.out.println(department1.getDepartmentDetails());
        System.out.println(department1.getHOD("Dr. A. B. Banda"));

        System.out.println("\n");

        Department department2 = new Department();
        department2.name = "Social Sciences";
        department2.institute = "Makerere University";
        System.out.println(department2.getDepartmentDetails());
        System.out.println(department2.getHOD("Dr. A. C. Tom"));
    }
}