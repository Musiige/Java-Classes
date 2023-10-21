
public class Last{
    String name;
    String regnumber;
    String course;
    int age;
    double weight;
    Last(String name,String regnumber,String course,int age,double weight){
        this.name=name;
        this.regnumber=regnumber;
        this.course=course;
        this.age=age;
        this.weight=weight;
    }


public static void main(String[]args){
        Last first = new Last("Alfred","22/w/208","DCS",26,90.0);
        Last second = new Last("Diana","22/w/155","Law",26,55);
        System.out.println(first.name+ "" +first.regnumber+ "" + first.course+ ""+ first.age+"" +first.weight);
        System.out.println(second.name);
    }
}