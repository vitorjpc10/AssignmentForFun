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
        return null;
    }
}
