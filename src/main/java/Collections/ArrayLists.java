package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }

        return list1;

    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int total = 0;

        for (int i = 0; i < list1.size(); i++) {
            total += list1.get(i);
        }

        for (int i = 0; i < list2.size(); i++) {
            total += list2.get(i);
        }

        return total;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {

        ArrayList<Integer> result = original;

        result.removeAll(Arrays.asList(toRemove));

        return result;
    }

    public boolean happyList(ArrayList<String> original) {

        boolean happy = false;

        for (int i = 1; i < original.size() - 1; i++) {

            for (int j = 0; j < original.get(i).length(); j++) {

                // System.out.println(original.get(i - 1));
                // System.out.println(
                // "the word is: " + original.get(i) + " char is: " +
                // String.valueOf((original.get(i).charAt(j))));
                // System.out.println(original.get(i + 1));

                String charAt = String.valueOf((original.get(i).charAt(j)));

                if (original.get(i - 1).contains(charAt)
                        || original.get(i + 1).contains(charAt))

                {
                    happy = true;
                }

            }

            if (happy == false) {
                return false;
            }

            happy = false;

        }

        return true;

    }
}
