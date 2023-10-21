public class Classes {
    public String color; // white
    public String use; // writing

    public String writing(){
        return color+ " colored boards are used for "+ use+".";
    }

    public String positioning(String location){
        return color+ " colored boards are usually positioned at the "+ location+".";
    }

    public static void main(String[] args) {
        Classes board1 = new Classes();
        board1.color = "White";
        board1.use = "writing";
        System.out.println(board1.writing());
        System.out.println(board1.positioning("floor"));

        System.out.println("\n");

         Classes board2 = new Classes();
        board2.color = "Black";
        board2.use = "writing";
        System.out.println(board2.writing());
        System.out.println(board2.positioning("wall"));
    }
}