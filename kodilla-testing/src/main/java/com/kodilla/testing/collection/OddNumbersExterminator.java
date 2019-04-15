package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbersFromNumbers =  new ArrayList<>();

        for(Integer temp : numbers){
            if(temp % 2 == 0){
                evenNumbersFromNumbers.add(temp);
            }
        }
        return evenNumbersFromNumbers;
    }
}
