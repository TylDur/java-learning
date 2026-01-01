public class Conditionalstatements {
    public static void main(String args[]){

        int a = 5;
       

        // Conditional Statements (if , if-else , if-else-if , switch , ternary operator)

        System.out.println("If Statement");

        if(a > 4){
            System.out.println("A is Greater than 4");
        }

        System.out.println("If Else Statement");

        if(a > 10){
            System.out.println("A is Greater than 10");
        }
        else{
            System.out.println("A is Lesser than 10");
        }

        System.out.println("If Else If Statement");

        if(a > 10){
            System.out.println("A is Greater than 10");
        }
        else if(a > 5 && a != 5){
            System.out.println("A is Greater than 5");
        }
        else{
            System.out.println("A is Lesser than 10");
        }

        System.out.println("Switch Statement");
        int day = 3;
        switch (day) {

             case 1: System.out.println("Monday"); 
             break;
             case 2: System.out.println("Tuesday");
              break;
             case 3: System.out.println("Wednesday");
              break;
             default: System.out.println("Invalid");
        }

        System.out.println("Ternary Operator");

        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result);



    }
    
}
