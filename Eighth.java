public class Eighth {
    String model;
    String name;
    int year;
    public String drives(){
        return name + "drives a" + year + model;
    }
    public String races(){
        return name + "races with his" + year + model;
    }
    public static void main(String[]args){
        Eighth Driver1 = new Eighth();
        Driver1.name="Diana";
        Driver1.model="Toyota ist";
        Driver1.year=2008;
        Eighth Driver2 = new Eighth();
        Driver2.name="Alex";
        Driver2.model="Subaru";
        Driver2.year=2022;
        System.out.println(Driver1.drives());
        System.out.println(Driver2.races());
    }
}
