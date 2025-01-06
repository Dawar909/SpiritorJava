import java.util.Scanner;

class Spiritor {
    public static void main(String[] args) {
        System.out.println("this program makes a spiritual name");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type one:");
        System.out.println("D  A  C");
        String spiritualname = scanner.nextLine();
        System.out.println("Type one:"); 
        System.out.println("O  F  P");
        spiritualname = spiritualname + scanner.nextLine();
        System.out.println("Type one:");
        System.out.println("E  N  T");
        spiritualname = spiritualname + scanner.nextLine();   
        System.out.println("Type one:");
        System.out.println("A  H  J");
        spiritualname = spiritualname + scanner.nextLine();
        System.out.println("Type one:");
        System.out.println("I  L  S");
        spiritualname = spiritualname + scanner.nextLine();
        System.out.println("Type one:");
        System.out.println("S  I  D");
        spiritualname = spiritualname + scanner.nextLine();
        System.out.println("Your spiritual name is:  "+ spiritualname);
    }
}          