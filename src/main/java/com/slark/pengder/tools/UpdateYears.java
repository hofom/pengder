package com.slark.pengder.tools;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengwei on 16/7/15.
 */
public class UpdateYears {
    final int FirstYear = 2000;
    final int LastYear = 2100;
    boolean[] years = new boolean[LastYear - FirstYear];

    UpdateYears() {
        this.clear();
    }

    boolean set(int aYear) {
        if (aYear > FirstYear && aYear < LastYear) {
            years[aYear % FirstYear] = true;
            return true;
        } else {
            return false;
        }
    }

    void clear() {
        for (int i = 0; i < this.years.length; i++) {
            this.years[i] = false;
        }
    }

    List<Integer> get() {
        List<Integer> intArrayList = new ArrayList<Integer>(this.years.length);
        for (int i = 0; i < this.years.length; i++) {
            if (true == this.years[i]) {
                intArrayList.add(i + FirstYear);
            }
        }
        return intArrayList;
    }
}
