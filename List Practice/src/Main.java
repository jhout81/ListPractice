import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> destroy = new ArrayList<String>();
        destroy.add("two");
        destroy.add("amoeba");
        destroy.add("niner");
        destroy.add("AMOEBAS are here");
        destroy.add("None here");
        destroy.add("some AmOeBas here");

        reverselist();
        System.out.println(stringToList("Ham"));
        System.out.println(createListWithBounds(11, 18, 3));
        System.out.println(findAndDestroyAllAmoebas(destroy));

    }

    public static void reverselist() {
        ArrayList<Integer> nums = new ArrayList<Integer>(0);
        Scanner in = new Scanner(System.in);
        int line = 0;
        int count = 0;

        System.out.println("Enter values (-1 to stop)");
        while (line != -1) {
            System.out.print(":");
            line = in.nextInt();
            nums.add(count, line);
            count += 1;
        }
        nums.remove(nums.size() - 1);
        System.out.println("Your values, reversed: ");
        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.println(nums.get(i));
        }

    }

    public static ArrayList<Character> stringToList(String someStr) {
        ArrayList<Character> charList = new ArrayList<Character>(0);

        for (int i = 0; i < someStr.length(); i++) {
            charList.add(someStr.charAt(i));
        }
        return charList;
    }

    public static ArrayList<Integer> createListWithBounds(int start, int end, int step) {
        ArrayList<Integer> boundedList = new ArrayList<Integer>();

        for (int i = start; i < end; i += step) {
            boundedList.add(i);
        }

        return boundedList;
    }

    public static ArrayList<String> findAndDestroyAllAmoebas(ArrayList<String> destroy) {

        //created new arraylist copy (only to make contains case insensitive)
        ArrayList<String> caseList = new ArrayList<String>(destroy);

        caseList.replaceAll(String::toLowerCase);

        for (int i = caseList.size() - 1; i >= 0; i--) {
            if (caseList.get(i).contains("amoeba")) {
                destroy.remove(i);
            }
        }
        return destroy;
    }

}