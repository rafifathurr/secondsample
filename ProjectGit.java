package samplegit;

import java.util.Scanner;
public class ProjectGit {
    private String output ;
    
    //String scan
    public String scan(){
        //Input
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter Your Text");
        
        //Output
        output = input.nextLine();
        return output;
        
    }
    
    //Method static scan2
    static void scan2(){
        //Input
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter Your Second Text");
        
        //Output
        String res = input.nextLine();
        System.out.println("Your Second Text is : "+res);
    }
    
    public static void main(String[] args) {
        //Call Method
        ProjectGit pj = new ProjectGit();
        
        //Result
         String result = pj.scan();
        System.out.println("Result is : " + result );
        
        //Scan2
        scan2();
  }
}