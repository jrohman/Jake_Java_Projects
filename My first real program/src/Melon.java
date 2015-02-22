import java.util.Scanner;
/**
 * Write a description of class Melon here.
 * 
 * @author (Jake Rohman) 
 * @version (a version number or a date)
 */
public class Melon
{
    public static void main(){
        Scanner total=new Scanner(System.in);
        System.out.println("Would you like to eat Fish or a Plant?");
        String type_a=total.next();
        String type_aa=type_a.toLowerCase();
        if(type_a.equals("fish")){
            System.out.println("So you would like to eat fish? Thats nice!");
            System.out.println("Do you want Salmon or Herring?");
            String fish=total.next();
            String fisha=fish.toLowerCase();
            if(fisha.equals("herring")){
                System.out.print("Go cut down a tree.");}
                else{ 
                    System.out.println("Would you like your Salmon cooked or not cooked?");
                    String Salmon=total.next();
                    String Salmona=Salmon.toLowerCase();
                    if(Salmona.equals("cooked")){
                        System.out.println("How many cooked Salmon do you want?");
                        int Scount=total.nextInt();
                        int Stime=Scount*7;
                        System.out.println("It will take Kenji "+Stime+" minutes to catch your fish");
                        System.out.println("Do you think Kenji is fast enough? (yes or no)");
                        String Kfish=total.next();
                        String Kfisha=Kfish.toLowerCase();
                        if(Kfisha.equals("yes")){
                            System.out.println("Good Job Kenji!");}
                            else{System.out.println("Fish faster Kenji!");}    
                    }
                    else{System.out.println("Would you like to give your Salmon to Luke or Kenji?");
                        String rawsal=total.next();
                        String rawsala=rawsal.toLowerCase();
                        if(rawsala.equals("luke")){System.out.println("Luke doesn't like Salmon... you should have given it to Kenji.");
                        }
                        else{
                            System.out.println("Kenji loves Salmon and graciously gives you dirt and seed in gratitude.");
                        }
                    }
                }
            }
        
        else{
            System.out.println("Would you like Melons or Potatos");
            String type_b=total.next();
            String type_bb=type_b.toLowerCase();
            if(type_bb.equals("melons")){
            System.out.println("Enter the number of Melons you started with");
            int initial=total.nextInt();
            System.out.println("Enter the number of Melons you have eaten");
            int mfinal=total.nextInt();
            int Kenji=initial-mfinal;
            System.out.println("You have "+Kenji+" Melons left!");
            System.out.println("How hungry are you on a scale of 1 to 10?");
            int hunger=total.nextInt();
            int a=Kenji-hunger;
            if(a<0){System.out.println("I'm sorry! You don't have enough Melons left!");}
            else{
            System.out.println("You need to eat "+hunger+" more Melons to be full");
            System.out.println("If you eat "+hunger+" more Melons, you will have "+a+" Melons left.");
            }
            }
        
            
            else{
                System.out.println("So you want Potatos? Thats good!");
                System.out.println("Would you like your Potatos baked or raw?");
                String bak=total.next();
                String bak2=bak.toLowerCase();
                if(bak.equals("raw")){
                    double rawrand=Math.random()*100;
                    int rawranda=(int)rawrand;
                    System.out.println("Congratulations! You have been given "+rawranda+" raw Potatos!");
                    if(rawrand>40){System.out.println("You are the cause of the Irish Potato Famine...");
                    System.out.println("You ate way too many Potatos!");
                    }
                    else{System.out.println("Good job! You saved the Irish!");}
                } 
                else{
                    System.out.println("You like baked potatos? (true or false)");
                    boolean baked=total.nextBoolean();
                    while(baked){
                        System.out.println("You still like baked potatos? (true or false)");
                        baked=total.nextBoolean();
                    }
                    System.out.print("Wow... What kind of person doesn't like Potatos...");
                }
            }
        }
    }
    
}

