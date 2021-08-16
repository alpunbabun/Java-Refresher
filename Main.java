package com.company;

import com.sun.source.tree.ContinueTree;
import jdk.jshell.MethodSnippet;
import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.awt.image.LookupOp;
import java.lang.ref.Reference;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Primitive Data Types
//        byte theByte = -128;
//        short theShort = 12_345;
//        int theInt = 1_221_312_423;
//        long theLong = 1_221_312_423_423L;
//
//        float pi = 3.14F;
//        Double doublePi = 3.141_5;
//
//        boolean isAdult = false;
//        char nameInitial = 'A';
//
//        System.out.println(theByte);
//        System.out.println(theShort);
//        System.out.println(theInt);
//        System.out.println(theLong);
//        System.out.println(pi);
//        System.out.println(doublePi);
//        System.out.println(isAdult);
//        System.out.println(nameInitial);

//        Non-Primitive Data Types
//        String name = new String("Company");
//        System.out.println(name.toUpperCase(Locale.ROOT));
//        LocalDate now = LocalDate.now();
//        System.out.println(now.getYear());

//        Difference between Primitives and Reference Types
//        int a = 10;
//        int b = a;
//        a = 100;
//        System.out.println("a " + a + " - b " + b);
//
//        Person alex = new Person("alex");
//        Person mariam = alex;
//
//        System.out.println("before changing alex");
//        System.out.println(alex.name + " " + mariam.name);
//
//        alex.name = "Alexander";
//        mariam.name = "Mariam";
//
//        System.out.println("after changing alex");
//        System.out.println(alex.name + " " + mariam.name);

//        Naming Variables
//        int zero = 0;
//        int one = 1;
//        double pi = 2.1415;
//        int subscriberCountForCompany = 1_000_000;

//        The String Class
//        String name = "Company";
//        System.out.println(name.toUpperCase(Locale.ROOT)); //toUpperCase(Locale.ROOT) - METHOD
//        System.out.println(name.toLowerCase(Locale.ROOT));
//        System.out.println(name.charAt(0));
//        String Company = "Company";
//        System.out.println(name.contains(Company));
//        System.out.println(name.equals(Company));

//        Packages and Import Keyword
//        Date date = new Date();
//        java.sql.Date dataSql = new java.sql.Date(1);
//        String s = new String();
//        LocalDate localDate = LocalDate.now();
//        LocalDateTime localDateTime = LocalDateTime.now();

//        Arithmetic Operations
//        System.out.println(10 + 2 + 90 * 20);
//        System.out.println(10 - 2);
//        // Bodmas
//        System.out.println(10 * 2 + 100);
//        System.out.println(10 % 3);

        // Math Class
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.max(6, 10));
//        System.out.println(Math.min(6, 10));
//        System.out.println((int) Math.pow(5, 2)); //casting result into int.
//        System.out.println(Math.sqrt(36));
//        System.out.println(Math.PI);

//        Comparison Operators
//        int khalidAge = 20;
//        int mariamAge = 20;
//        boolean isKhalidOlderThanMariam = khalidAge > mariamAge;
//        System.out.println(khalidAge > mariamAge);
//        System.out.println(khalidAge < mariamAge);
//        System.out.println(khalidAge >= mariamAge);
//        System.out.println(khalidAge <= mariamAge);
//        System.out.println(khalidAge == mariamAge);
//        System.out.println(khalidAge != mariamAge);

//        Logical Operators
//        boolean isAdult = false;
//        boolean isStudent = false;
//        boolean isCompany = true;
//        System.out.println(isAdult && isStudent);
//        System.out.println(isAdult || isStudent);
//        System.out.println((!isAdult || isStudent) && !isCompany);
//        System.out.println(!isAdult);
//        String name = "Mark";
//        System.out.println(
//                (10 > 8 || 2 <= 2) &&
//                        isAdult &&
//                        name.contains("Ma"));

//        If statements
//        int age = 16;
//        if (age >= 18) {
//            System.out.println("Hooray... You are an adult");
//        } else if (age >= 16 && age < 18){
//            System.out.println("You are almost an adult");
//        } else {
//            System.out.println("You are not an adult");
//        }

//        Ternary Operator
//        int age = 18;
//        String message = age >= 18 ?
//            "Hooray... I am an adult" :
//            "I am not an adult";
//        System.out.println(message);

//        Switch Statements
//            String gender = "FEMALE";
//            switch (gender.toUpperCase(Locale.ROOT)) {
//                case "FEMALE":
//                    System.out.println("I am a female");
//                    break;
//                case "MALE":
//                    System.out.println("I am a male");
//                    break;
//                case "PREFER_NOT_SAY":
//                    System.out.println("Prefer not to say");
//                    break;
//                default:
//                    System.out.println("Unknown Gender");
//            }

//        Arrays
//        int [] numbers = {2, 0, 1, 4, 100};
//        String [] names = {"Ali", "Maria"};
////        int [] numbers = new int [3];
////        numbers [0] = 0;
////        numbers [1] = 1;
////        numbers [2] = 1;
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(names));
//        System.out.println(names.length);

//        Arrays and Indexes
//        int [] numbers = {2, 0, 1, 4, 100, 4, 90, 78};
//        int oneHundred = numbers[4];
//        int four = numbers[numbers.length - 1];
//        System.out.println(oneHundred);
//        System.out.println(four);

//        ++&--
        // Loops
//        int [] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
//        String [] names = {"Anna", "Ali"};
//
//        int number = 0;
//        number--;
//        number++;
//        number += 5;
//        System.out.println(number);
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i+=2]);
//        }
//
//        // Reverse order
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i-=2]);
//        }

//        Enhanced For Loop
//        for (int i = 0; i < numbers.length; i++) {
//        System.out.println(numbers[i+=2]);
//        }
//
//        System.out.println("Enhanced for loop");
//
//        for (String name : names) {
//            System.out.println(name);
//        }

//        Bonus Tip
//        int [] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
//        String[] names = {"Anna", "Ali"};
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i+=2]);
//        }
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        Arrays.stream(numbers).forEach(System.out::println);
//        Arrays.stream(names).forEach(System.out::println);

//        Break & Continue
//        String[] names = {"Anna", "Ali", "Bob", "Mike"};
//        for (String name : names) {
//            if (name.startsWith("A")) {
//                continue;
//            } else {
//                System.out.println(name);
//            }
//        }

//        While Loop
//        int count = 21;
//
//        while (count <= 20) {
//            System.out.println("count" + count);
//            count++;
//        }

//        Do While Look
//        int count = 21;
//
//        do {
//            System.out.println(count);
//            count++;
//        }
//        while (count <= 20);

//        Scanner Class
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userName = scanner.nextLine();
//        System.out.println("Hello " + userName);
//
//        System.out.println("How old are you?");
//        int age = scanner.nextInt();
//        int year = LocalDate.now().minusYears(age).getYear();
//        System.out.println("You were born in " + year);
//
//        if (age < 18) {
//            System.out.println("and you are not an adult");
//        } else {
//            System.out.println("and you are an adult");
//        }

//        Methods
//        System.out.println("Hello");
//        String brand = "Samsung";
//        System.out.println(brand.toUpperCase(Locale.ROOT));
//        System.out.println(brand.startsWith("S"));

//        Understanding Method
//        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
//        int count = countOccurrences(letters, 'D');
//        System.out.println(count);

//        Classes and Objects
//        creating objects
//        Lens lensOne = new Lens("sony", "88mm", true);
//        Lens lensTwo = new Lens("canon", "30mm", true);
//        Lens lensThree = new Lens("sony", "24-70mm", false);

//        Printing Object Attributes
//        System.out.println("Lens 1");
//        System.out.println(lensOne.brand);
//        System.out.println(lensOne.focalLength);
//        System.out.println(lensOne.isPrime);
//        System.out.println();
//        System.out.println("Lens 2");
//        System.out.println(lensTwo.brand);
//        System.out.println(lensTwo.focalLength);
//        System.out.println(lensTwo.isPrime);
//        System.out.println();
//        System.out.println("Lens 3");
//        System.out.println(lensThree.brand);
//        System.out.println(lensThree.focalLength);
//        System.out.println(lensThree.isPrime);

//        Passport Example
//        Passport ukPassport = new Passport(
//              "1234", "England (UK)", LocalDate.of(2025, 1, 1));
//        Passport usPassport = new Passport(
//              "1234", "USA", LocalDate.of(2025, 1, 1));
//
//        System.out.println("UK PASSPORT:");
//        System.out.println(ukPassport.number);
//        System.out.println(ukPassport.country);
//        System.out.println(ukPassport.expiryDate);
//        System.out.println();
//        System.out.println("USA PASSPORT:");
//        System.out.println(usPassport.number);
//        System.out.println(usPassport.country);
//        System.out.println(usPassport.expiryDate);

    }
//    }
//    static  class Person {
//        String name;
//
//        Person(String name) {
//            this.name = name;
//        }
//    }


//        Understanding Method
//    public static int countOccurrences(char [] letters, char searchLetter) {
//        int count = 0;
//        for (char letter : letters) {
//            if (letter == searchLetter) {
//                count++;
//            }
//        }
//        return count;

//        creating classes
//        static class Lens {
//        String brand;
//        String focalLength;
//        boolean isPrime;
//
//        Lens(String brand,
//             String focalLength,
//             boolean isPrime) {
//            this.brand = brand;
//            this.focalLength = focalLength;
//            this.isPrime = isPrime;
//        }
//    }

//        Passport Example

//        static class Passport {
//            String number;
//            String country;
//            LocalDate expiryDate;
//
//            Passport(String number, String country, LocalDate expiryDate) {
//                this.number = number;
//                this.country = country;
//                this.expiryDate = expiryDate;
//            }
//        }
}