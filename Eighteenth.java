
public class Eighteenth{
    public String name;
    public int id;

    public String getLecturerDetails(){
        return "Lecturer : " + name + " has ID: " + id + " teaches Structured programing: ";
    }

    public String getQualification(){
        return "Lecturer : " + name + " with ID: " + id + " teaches Linear programming ";
    }
    public static void main(String[]args){
        Eighteenth Lec1 = new Eighteenth();
        Eighteenth Lec2 = new Eighteenth();
        Lec1.name="Luyima";
        Lec1.id=155;
        Lec2.name="Kityo";
        Lec2.id=208;
        System.out.println(Lec1.getLecturerDetails());
        System.out.println(Lec2.getQualification());

    }
}