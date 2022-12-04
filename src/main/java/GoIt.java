
import java.util.ArrayList;
import java.util.Arrays;

class  MyArrayList {
    public static void main(String[] args) {

        ArrayList<String> myArray = new ArrayList<String>();
        myArray.add("Tom");
        myArray.add("John");
        myArray.add("Alex");
        myArray.add("Ron");
        myArray.add("Max");
        myArray.add("Nick");
        myArray.add("Ben");

        System.out.println("Removed: "+ myArray.get(1));
        myArray.remove(1);

        System.out.printf("ArrayList has %d elements \n", myArray.size());

        for (String myArrayTest:myArray) {
            System.out.println(myArrayTest);
        }
        for (String myArrayTest1:myArray) {
            if (myArrayTest1.equals("Nick")){
                myArray.clear();
                System.out.println("ArrayList was cleaned");
            }
            else {
                System.out.println("Nick wasn`t found!");
            }
        }


    }

}