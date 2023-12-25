public class Main {
    public static void main(String[] args) {

        String str ="YOu are a loser";
        String newStr = str.toLowerCase().replaceAll("[a,e,i,o,u]","");
        System.out.println(newStr);
    }
}