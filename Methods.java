public class Methods {



 // using static because there is no need for an oject for calling the function

   static void print(){    // without parameters without return type
       
    System.out.println("Hello World!");
    }

    static int sum(int a , int b){        // with parameters with return type
       
        return a+b;
    }

    static void product(int a , int b){   // with parameters without return type
        
        System.out.println("The product: "+ (a*b)); 
    }



        public static void main(String[] args) {
        print();
         System.out.println("The sum: "+(sum(3,4)));
        product(3,4 );

    }
}
