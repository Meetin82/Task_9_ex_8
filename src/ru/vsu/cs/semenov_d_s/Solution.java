package ru.vsu.cs.semenov_d_s;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {

    public List<Integer> isOnlyInTheFirstAndSecondList(List<Integer> list1, List<Integer> list2) {
        List<Integer> inList1NotInList2 = isOnlyInOneListNotInOther(list1, list2);
        List<Integer> inList2NotInList1 = isOnlyInOneListNotInOther(list2, list1);
        inList1NotInList2.addAll(inList2NotInList1);
        return inList1NotInList2;
    }

    public List<Integer> isOnlyInOneListNotInOther(List<Integer> list1, List<Integer> list2) {
        List<Integer> locationOnlyInOneListNotInOther = new ArrayList<>();
        int temp;
        for (int i = 0; i < list1.size(); i++) {
            temp = 0;
            for (int j = 0; j < list2.size(); j++) {
                if (Objects.equals(list1.get(i), list2.get(j))) {
                    temp++;
                }
            }
            if (temp == 0) {
                locationOnlyInOneListNotInOther.add(list1.get(i));
            }
        }
        return locationOnlyInOneListNotInOther;
    }
}
