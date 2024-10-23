package ModulEmpat;
import java.util.Scanner;
public class LatiaanSwitch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int pil,hewan;
        String nama;
        
        System.out.println("=====<Username Generator>=====");
        System.out.print("insert your nickname: "); nama = inp.nextLine();
        System.out.println("\n1. Cat\n2. Dog\n3. Croc\n4. Hamster\n5. Fish\n6. Birdie\n7. Turtle\n8. Chicken\n9. Snake\n10. Gecko\n============");
        System.out.print("Choose one of your favourite pet (1-10): "); hewan = inp.nextInt();
        
        switch (hewan){
            case 1 : System.out.println(nama+"Paww");
                break;
            case 2 : System.out.println(nama+"Woofie");
                break;
            case 3 : System.out.println(nama+"Crocs");
                break;
            case 4 : System.out.println("Hammy"+nama);
                break;
            case 5 : System.out.println("Blubby"+nama);
                break;
            case 6 : System.out.println("Flappy"+nama);
                break;
            case 7 : System.out.println(nama+"Tortoys");
                break;
            case 8 : System.out.println(nama+"Cluck");
                break;
            case 9 : System.out.println("Hissy"+nama);
                break;
            case 10 : System.out.println("Squeky"+nama);
                break;
            default : System.out.println("Choose between 1-10!");
        }
        
        
    } 
}
