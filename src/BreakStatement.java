public class BreakStatement {
    public static void main(String[] args){
        //BREAK STATEMENT
        int i = 0;
        while(true){
            System.out.println(i);
            i = i + 1;
            if(i>5) {
                break;
            }
        }
    }
}
