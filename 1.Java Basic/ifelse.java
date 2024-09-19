public class ifelse {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        var c = 10;
        var d = 20;
        var e = 30;

        if((c < d) || (e < d)){
            System.out.println("Value of a :" + a);
        } 
        else if(!(c > d) && (e > d)){
            System.out.println("Value of b :" + b);
        }
        else{
            System.out.println("Stop");
        }
    }
}
