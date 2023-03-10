import java.util.Scanner;

class stringReverse{
    static int top=-1;
    //declare a char type array
    static char StackArray[]; 

    //push method to add new element to top
    static void push(char x){
        if (top == StackArray.length - 1) {
            System.out.println("Stack is full");
        } else {
            top=top+1;
            StackArray[top]=x;
        }
    }
    
    //pop method to remove and return the top element
    static char pop(){
        if (top == -1) {
            return '\0';
        } else {
            char temp;
            temp = StackArray[top];
            top=top-1;
            return temp;
        }
    }

 
    //Function return true if input is a Palindrome
    static void Reverse(char inputArray[]){
        //get the no of characters in userinput
        int length = inputArray.length;

        StackArray = new char[length*4];//each character in Java is two bytes 

        //Userinput is stored in the stack
        for (int i = 0; i <length; i++){
            push(inputArray[i]);
        }
           
        for (int i =0; i < length; i++) {
            char top = pop();
            System.out.print(top);
            }
        }
        
    
 
  //Main method
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your string");

    //Get user input
    String userInput = input.nextLine();
    //Split user input to a Char array
    char[] inputArray = userInput.toCharArray();
    //use the reverse method
    System.out.print("Reversed String is ");
    Reverse(inputArray);

    }
}