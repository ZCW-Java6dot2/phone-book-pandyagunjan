package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {

        this.phonebook=new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name, Collections.singletonList(phoneNumber));
    }

    public void addAll(String name, String... phoneNumbers) {
        for (int i=0 ; i<phoneNumbers.length;i++)
        {
            phonebook.put(name, Arrays.asList(phoneNumbers));
        }
    }

    public void remove(String name) {

        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {

        return  this.phonebook.containsKey(name);
    }
   public Boolean hasEntry(String name,String phoneNumber) {
       return this.phonebook.containsKey(name) && this.phonebook.get(name).contains(phoneNumber) ? true : false;
   }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
          //  for(String )
       for(Map.Entry<String, List<String>> keyValue : phonebook.entrySet())
       {
           if(keyValue.getValue().equals(phoneNumber))
               return keyValue.getKey();
       }
       return "not found";
    }

    public List<String> getAllContactNames() {

        List<String> list = new ArrayList<String>();
        for(String key : phonebook.keySet())
        {
         //   list.add(phonebook.)
            list.add(key);
        }
        return list;

    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
