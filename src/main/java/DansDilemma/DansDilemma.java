package DansDilemma;

import java.util.*;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Set<Double> set = new HashSet<Double>();

        // Non-Unique Order

        set.add(input1 * input2);

        set.add(input1 + input2);

        // Unique Order

        set.add(input1 - input2);

        set.add(input2 - input1);

        if (!(input1 == 0 && input2 == 0)) {
            set.add(input1 / input2);
        }

        if (!(input1 == 0 && input2 == 0)) {
            set.add(input2 / input1);
        }

        // System.out.println("total size: " + set.size());
        return set.size();

    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Set<Double> set = new HashSet<Double>();

        // Non-Unique Order
        // System.out.println("1" + set);

        set.add(input1 * input2);
        set.add(input1 * input3);
        set.add(input2 * input1);
        set.add(input2 * input3);
        set.add(input3 * input1);
        set.add(input3 * input2);

        set.add(input1 + input2);
        set.add(input1 + input3);
        set.add(input2 + input1);
        set.add(input2 + input3);
        set.add(input3 + input1);
        set.add(input3 + input2);

        set.add(input1 - input2);
        set.add(input1 - input3);
        set.add(input2 - input1);
        set.add(input2 - input3);
        set.add(input3 - input1);
        set.add(input3 - input2);

        if (input1 != 0 || (input2 != 0) || (input3 != 0)) {

            set.add(input1 / input3);
            set.add(input2 / input3);
            set.add(input3 / input2);
            set.add(input1 / input2);
            set.add(input2 / input1);
            set.add(input3 / input1);
        }

        // System.out.println("final" + set);

        return set.size();
    }

    public Integer dilemmaOfN(Double... args) {
        List<Double> argList = new ArrayList<Double>();
        Set<Double> set = new HashSet<Double>();

        for (Double arg : args) {
            argList.add(arg);
        }

        //System.out.println("arglist:" + argList);

        int arg1 = 0;

        for (int j = 0; j < argList.size(); j++) {
            for (int i = 0; i < argList.size(); i++) {

                // System.out.println("initial: " + set);
                // System.out.println("arg1 = " + argList.get(arg1) + " i is = " +
                // argList.get(i));

                if (arg1 == i) {
                    //System.out.println("SKIPPED");
                    continue; // skip
                }

                set.add(argList.get(arg1) * argList.get(i));
                // System.out.println("multiplication: " + set);
                // System.out.println("arg1 = " + argList.get(arg1) + " i is = " +
                // argList.get(i));
                set.add(argList.get(arg1) + argList.get(i));
                // System.out.println("Addition: " + set);
                // System.out.println("arg1 = " + argList.get(arg1) + " i is = " +
                // argList.get(i));
                set.add(argList.get(arg1) - argList.get(i));
                // System.out.println("Subtraction: " + set);
                // System.out.println("arg1 = " + argList.get(arg1) + " i is = " +
                // argList.get(i));

                if (argList.get(arg1) != 0 && argList.get(i) != 0) {

                    set.add(argList.get(arg1) / argList.get(i));
                    // System.out.println("Division: " + set);
                    // System.out.println("arg1 = " + argList.get(arg1) + " i is = " +
                    // argList.get(i));

                }

            }

            arg1++;

        }

        return set.size();
    }
}
