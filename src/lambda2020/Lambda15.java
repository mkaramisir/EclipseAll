package lambda2020;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Lambda15 {

    public static void main(String[] args) throws IOException {
        
        //How to work with Files by using Functional Programming
        
        //How to print file content on the console
        Files.lines(Paths.get("src/FileForLambda01")).forEach(System.out::println);
        
        //Convert all letters to uppercase
        Files.lines(Paths.get("src/FileForLambda01")).map(t->t.toUpperCase()).forEach(System.out::println);
        
        //Check if the word "Lambda" exists in the text
        System.out.println(Files.lines(Paths.get("src/FileForLambda01")).anyMatch(t->t.contains("Lambda"))); //true
        
        //Print distinct words on the console
        Files.lines(Paths.get("src/FileForLambda01")).map(t->t.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
        
        //Print all the words on the console in alphabetical order
        Files.lines(Paths.get("src/FileForLambda01")).map(t->t.split(" ")).flatMap(Arrays::stream).sorted().forEach(System.out::println);
        
        //Print the words which starts with "m" or "M" on the console
        Files.lines(Paths.get("src/FileForLambda01"))
             .map(t->t.split(" "))
             .flatMap(Arrays::stream)
             .map(t->t.toLowerCase())
             .filter(t->t.startsWith("m"))
             .forEach(System.out::println);     
    }
}
