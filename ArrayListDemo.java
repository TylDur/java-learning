import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        //Adding Elements
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        //Printing Elements
        System.out.println("ArrayList: "+al);

        //Accessing Elements
        System.out.println("First Element: "+al.get(0));

        //Updating Elements
        al.set(2, 99);
        System.out.println("Updated ArrayList: "+al);

        //Removing Elements
        al.remove(1);        // by index
        al.remove(Integer.valueOf(3)); // by value
        System.out.println("ArrayList after Removing the elements: "+al);

        // ArrayList size 
        System.out.println("Size of the arraylist: "+al.size());

        //Check if the element exists
        System.out.println("If the list contains 4: "+al.contains(4));

        //Index of the element
        System.out.println("The index of the element 5: "+al.indexOf(5));
        
    }
}
