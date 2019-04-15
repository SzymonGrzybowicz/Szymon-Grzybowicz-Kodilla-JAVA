package com.kodilla.testing.Duplicate;

import java.util.List;

public class Duplicate {

    public int getDuplicateValue(List<Integer> list) {
        int sum = 0;
        int max = list.size() - 1;
        int sumWithoutDuplicate = 0;

        for (Integer temp : list) {
            sum = sum + temp;

        }

        sumWithoutDuplicate = max * (max + 1) / 2;

        return sum - sumWithoutDuplicate;

    }
}
