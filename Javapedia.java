import java.util.Scanner;

public class Javapedia {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        
        int people = in.nextInt();
        

        String[][] database = new String[people][3];       
         
    
        in.nextLine();
        for(int i = 0 ; i <database.length; i ++){
            System.out.println("\n\tFigure " + (i+1)); 
            System.out.print("\t - Name: ");
           database[i][0] =  in.nextLine();
            System.out.print("\t - Date of birth: ");
           database [i][1] = in.nextLine();
            System.out.print("\t - Occupation: ");
           database [i][2] = in.nextLine();
            System.out.print("\n");


        } 
        System.out.println("These are the values you stored:\n"); 
     
        print2DArray(database);
    
        
        System.out.print("\nWho do you want information on? ");  
        String name = in.nextLine();
        System.out.print("\n");
        for(int i = 0 ; i < database.length ; i++){
            if(database[i][0].equals(name)){
                System.out.println("\tName: " + database[i][0]);
                System.out.println("\tDate of birth: " + database[i][1]);
                System.out.println("\tOccupation: " + database[i][2]);
             
             }

        }  
     in.close();
    }
    

    
    public static void print2DArray(String[][] array){
        for(int i = 0 ; i < array.length ; i ++){
            System.out.print("\t");
            for(int j = 0 ; j < array[i].length ; j ++){
                System.out.print(array[i][j] + " ");

            }
            System.out.print("\n");
        }
           

    }


    }
    

