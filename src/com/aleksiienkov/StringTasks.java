package com.aleksiienkov;

public class StringTasks {
    static int countOf(String s,String needle){
        int index;
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            index=s.indexOf(needle,i);
            if(index>=0){
                count++;
                i=index+1;
            }
            
        }
        return count;
    }
    static String caesarCrypt(String s,int key){
        char[] caesarArr=s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            int index=(int)caesarArr[i]+key;
            caesarArr[i]=(char)index;}
        String caesarS=String.valueOf(caesarArr);
        return caesarS;

        }
    static Contact[] parseContacts(String s){
        String[] namesAndNumbers = s.split(";");
        Contact[] contacts = new Contact[namesAndNumbers.length];
        for (int i = 0; i < contacts.length; i++) {
            String[] simple = namesAndNumbers[i].split(":");
            simple[0] = simple[0].trim();
            simple[1] = simple[1].trim();
            contacts[i] = new Contact(simple[0], simple[1]);
        }
        return contacts;
    }}





