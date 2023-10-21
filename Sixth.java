public class Sixth {
   String name; //declare instance variables
   int age;
   double weight;
   
   public String getBuildersprofile(){//declare instance methods
    return name + "\tis competing from kawempe aged\t" + age + "\tweighing" + weight + ".";
   }
   void Buildersresults(){
      System.out.println(name+"weighing"+weight+"has come first and at the age of"+age+"wins the competion.");
   }
   public static void main(String[]args){
      Sixth Bodybuilder = new Sixth();
      Bodybuilder.name="Alfred";
      Bodybuilder.age=26;
      Bodybuilder.weight=97.3;

      System.out.println(Bodybuilder.getBuildersprofile());
      Bodybuilder.Buildersresults();

   }
}
