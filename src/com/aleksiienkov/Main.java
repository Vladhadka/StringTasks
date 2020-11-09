package com.aleksiienkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string:");
        String s=sc.nextLine();
        System.out.println("Enter your fragment:");
        String needle=sc.nextLine();
        int count = StringTasks.countOf(s, needle);
        System.out.printf("[%s] is count %d times in [%s] \n", needle, count, s);
        System.out.println("Enter the key of Cesar crypt");
        int caesarKey=sc.nextInt();
        sc.nextLine();
        String caesarS=StringTasks.caesarCrypt(s,caesarKey);
        System.out.printf("String in Cesar crypt: [%s] \n", caesarS);
        System.out.println("Enter the string of number");
        Contact[] contacts = StringTasks.parseContacts(sc.nextLine());
        for (int i = 0; i < contacts.length; i++) {
            System.out.println(contacts[i].toString());
    }
}}
