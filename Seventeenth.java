public class Seventeenth {
    public int numOne;
    public int numTwo;
    
    public String add(){
        return "The summation of "+ numOne +" and "+ numTwo +" is " + (numOne + numTwo) + ".";
    }

    public String multiply(){
        return "The product of "+ numOne +" and "+ numTwo +" is " + (numOne * numTwo) + ".";
    }


    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.numOne = 10;
        calc1.numTwo = 20;
        System.out.println(calc1.add());
        System.out.println(calc1.multiply());

        System.out.println("\n");

        Calculator calc2 = new Calculator();
        calc2.numOne = 5;
        calc2.numTwo = 40;
        System.out.println(calc2.add());
        System.out.println(calc2.multiply());
    }
}

