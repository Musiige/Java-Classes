public class Lecturer {
    public String name;
    public int id;

    public String getLecturerDetails(String courseUnit){
        return "Lecturer : " + name + " with ID: " + id + " teaches course unit: " + courseUnit;
    }

    public String getQualification(String courseUnit, String qualification){
        return "Lecturer : " + name + " with ID: " + id + " teaches course unit: " + courseUnit + " and has highest qualification of "+ qualification;
    }
}