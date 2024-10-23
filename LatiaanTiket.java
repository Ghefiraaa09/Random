package ModulEmpat;
import java.util.Scanner;
public class LatiaanTiket {
    public static void main(String[] args) {
        Scanner aha = new Scanner(System.in);
        
        String nama;
        int umur,cho,way,age;
        
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Welcome to the Gloria Land, new adventurer!\n<><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("\nMay i know your full name? "); nama = aha.nextLine();
        System.out.println("Hey "+nama+", I assure you to follow what being said next.");
        System.out.println("So, What can i help you?");
        System.out.println("1. Exit way\n2. Join the journey\n3. Who are you?");
        System.out.print("Select(1/2/3): "); cho = aha.nextInt();
        
        if (cho==1){
            System.out.print("Which way did you come from (1.left/2.right): ");
            way = aha.nextInt();
                if(way==1){
                    System.out.println("You can pass this way, and knock that black door 3x.");
                }else if(way==2){
                    System.out.println("Go to the downstair and you'll meet a cat there.");
                }else{
                    System.out.println("BONK!!(you died)");
                }
        
        
        }else if (cho==2){
            System.out.print("\nAre you ready for the thrilling journey\n(1.Yes/2.No): ");
            cho = aha.nextInt();
            if(cho==1){
                System.out.println("You're accepted!");
               
                System.out.print("\nWait! are you legal yet to be a member?\n(1.Yes/2.No): ");
                cho = aha.nextInt();
                    if(cho==1){                      
                        System.out.print("How old are you? ");
                        age = aha.nextInt();
                        System.out.println("\nHey, "+nama+" this is your new member card.\nDon't ever lose it during your journey.");
                        System.out.println("\n<><><><><><><><><><><><><><><><><><><><><><><>");
                        System.out.println("               ADVENTURER CARD                ");
                        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><>");
                        System.out.println("\n\t\t"+nama+"\t\t");
                        System.out.println("\t\t"+age+" years old\t\t\n");
                        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><>");
                             
                    }else if (cho==2){
                        System.out.println("Where's your momma kids? get out from here.");
                    }else{
                        System.out.println("BONK!! (you died)");
                    }
                
            }else if(cho==2){
                System.out.println("Get out from here.");
            
            }else{
                System.out.println("BONK!! (you died)");
            }
        }else if(cho==3){
            System.out.println("You're curious?");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("You died.");
        
        }else{
            System.out.println("You have some time to re-run the program. ");
        }
        
    }
}
