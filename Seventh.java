public class Seventh {
    int age;
    String name;
    void Service(){
        System.out.println(name + "aged" + age + "prints all the course work.");
    }
    void Obligation(){
            System.out.println(name + "aged" + age + "is supposed to wake us up for discussions."); 
        }
    public static void main(String[]args){
        Seventh Friend1 = new Seventh();
        Friend1.name="Arnold";
        Friend1.age=70;
        Friend1.Service();
        Seventh Friend2 = new Seventh();
        Friend2.name="Kalyango";
        Friend2.age=80;
        Friend2.Obligation();
    }
}
