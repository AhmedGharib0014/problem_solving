package Champagne_tower;

import java.util.*;

public class ChampagneTower {

    public static double champagneTower(int poured, int query_row, int query_glass) {
        ArrayList<ArrayList<Double>> glasses = new ArrayList<ArrayList<Double>>();
        for (int i = 0; i <= query_row + 1; i++) {
            ArrayList<Double> temp = new ArrayList<Double>();
            for (int j = 0; j <= i; j++) {
                temp.add(0.0);
            }
            glasses.add(temp);
        }

        glasses.get(0).set(0, glasses.get(0).get(0) + poured);

        for (int i = 0; i < query_row + 1; i++) {
            for (int j = 0; j <= i; j++) {
                double value = glasses.get(i).get(j);

                if (value > 1) {
                    double remaining = value - 1;

                    glasses.get(i).set(j, 1.0);

                    // left child
                    glasses.get(i + 1).set(j, glasses.get(i + 1).get(j) + remaining / 2);
                    // right child
                    glasses.get(i + 1).set(j + 1, glasses.get(i + 1).get(j + 1) + remaining / 2);
                }

            }

        }

        return glasses.get(query_row).get(query_glass);

    }

    public static void main(String[] args) {
        System.out.println(champagneTower(25, 6, 1));
    }

}
