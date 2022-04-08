package com.company;

import javax.swing.*;
import java.util.*;


import java.util.prefs.NodeChangeEvent;

class Solution{
    class  Interval implements Comparable<Interval> {
        int start;
        int end;
        Interval(int s,int e){
            start=s;
            end=e;
        }

        @Override
        public int compareTo(Interval o) {
            if(this.start <  o.start) return  -1;
            else if(this.start >  o.start) return 1;
            else return 0;
        }

        int[] toArray(){
            int[] arr={start,end};
            return arr;
        }
    }

    public int[][] merge(int[][] intervals) {
        ArrayList<Interval>  input= new  ArrayList<Interval>();
        ArrayList<Interval>  result= new  ArrayList<Interval>();
        for(int[] arr : intervals){
            input.add(new Interval(arr[0],arr[1]));
        }
        Collections.sort(input);
        int i=0;
        while(i<input.size()){
            int start = input.get(i).start ;
            int end = input.get(i).end;
            int j=i+1;
            while (j<intervals.length && intervals[j][0]<=end) {
                    end = Math.max(end, input.get(j).end);
                    j++;
            }

            result.add(new Interval(start,end));
            i=j;

        }
        int[][] finalResult = new int[result.size()][2];
        int index=0;
        for(Interval array : result){
            finalResult[index]=array.toArray();
            index ++;
        }
        return finalResult;

    }
    public static void main(String[] args) {
        Main main=new Main();
        int[][] intervals={{1,4},{0,5}};
        int[][] result = main.merge(intervals);
        for(int[] s : result){
            System.out.print(s[0]);
            System.out.print(' ');
            System.out.print(s[1]);
            System.out.println();
        }

    }

}