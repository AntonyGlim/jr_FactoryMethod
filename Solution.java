package com.javarush.task.task37.task3702;

import com.javarush.task.task37.task3702.female.FemaleFactory;

public class Solution {
    public static void main(String[] args) {
        FemaleFactory factory = new FemaleFactory();
        System.out.println(factory.getPerson(99));
        System.out.println(factory.getPerson(4));
        System.out.println(factory.getPerson(15));
    }
}
