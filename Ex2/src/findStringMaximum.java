import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class findStringMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> temp = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
           if(temp.size() >1 && str.charAt(i) <= temp.getLast() && temp.contains(str.charAt(i))){
               temp.clear();
           }
            temp.add(str.charAt(i));
           if (temp.size()> max.size()) {
           max.clear();
           max.addAll(temp);
           }
        }
        for (Character c : max) {
            System.out.print(c);
        }
        System.out.println();
    }
}
