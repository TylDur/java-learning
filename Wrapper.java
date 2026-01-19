public class Wrapper {
    public static void main(String[] args) {

        // Wrapper Class (Non-Primitive)
        Byte number = 123;
        System.out.println("Byte Class(Non-Primitive): "+number);
        
        Short count = 2134;
        System.out.println("Short Class(Non-Primitive): "+count);

        Integer age = 23;
        System.out.println("Integer Class(Non-Primitive): "+age);

        Float average = 5.89f;
        System.out.println("Float Class(Non-Primitive): "+average);

        Double grade = 3.13;
        System.out.println("Double Class(Non-Primitive): "+grade);

        Character gender = 'M';
        System.out.println("Character Class(Non-Primitive): "+gender);

        //Unboxing
        byte num = number.byteValue();
        System.out.println("Un-Boxing of Byte: "+num);

        short cou = count.shortValue();
        System.out.println("Un-Boxing of Short: "+cou);

        int ag = age.intValue();
        System.out.println("Un-Boxing of Integer: "+ag); 

        float avg = average.floatValue();
        System.out.println("Un-Boxing of Float: "+avg);

        double gr = grade.doubleValue();
        System.out.println("Un-Boxing of Double: "+gr);

        char gen = gender.charValue();
        System.out.println("Un-Boxing of Character: "+gen);
        

        // Boxing 
        byte x1 = 23;
        Byte objByte = Byte.valueOf(x1);
        System.out.println("Boxing of Byte: "+objByte);

        short x2 = 343;
        Short objShort = Short.valueOf(x2);
        System.out.println("Boxing of Short: "+objShort);

        int x3 = 10;
        Integer objInteger = Integer.valueOf(x3);
        System.out.println("Boxing of Integer: "+objInteger);

        float x4 = 32.12f;
        Float objFloat = Float.valueOf(x4);
        System.out.println("Boxing of Float: "+objFloat);

        double x5 = 567.9;
        Double objDouble = Double.valueOf(x5);
        System.out.println("Boxing of Double: "+objDouble);

        char x7 = 'J';
        Character objCharacter = Character.valueOf(x7);
        System.out.println("Boxing of Character: "+objCharacter);

        
        
        
    }
}
