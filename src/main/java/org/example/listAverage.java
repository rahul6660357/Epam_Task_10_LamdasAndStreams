package org.example;
import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

public class listAverage {
    public static void main(String args[]){
        IntStream listStream=IntStream.range(5,15);
        OptionalDouble optionalDouble=listStream.average();
        if(optionalDouble.isPresent()){
            System.out.println("Average is: "+optionalDouble.getAsDouble());
        }
        else{
            System.out.println("Try again!");
        }
    }
}
