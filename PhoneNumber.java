import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String[] phoneNums = new String[100];
        String phoneNum;
        int filledElements = 0;
        
        System.out.print("Enter a phone number (or q to quit): ");
        phoneNum = inp.nextLine();
        
        while(!phoneNum.equalsIgnoreCase("q") 
            && filledElements < phoneNums.length) {
                if(phoneNum.length() < 1 || phoneNum.length() > 16) {
                    System.out.println("This is not a valid number. Please try again!");
                }
                else {
                    phoneNums[filledElements] = phoneNum;
                    filledElements++;
                }
                System.out.print("Enter a phone number (or q to quit): ");
                phoneNum = inp.nextLine();
            }
            
            System.out.println("\nContact List: ");
            for(int i=0; i < filledElements; i++) {
                System.out.println((i+1) + ". " + phoneNums[i]);
            }
            
        System.out.println("Success!");
        inp.close();
    }
}