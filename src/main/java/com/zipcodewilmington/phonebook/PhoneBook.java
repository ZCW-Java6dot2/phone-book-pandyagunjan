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

        return  phonebook.containsKey(name);
    }
    public Boolean hasEntry(String name,String phoneNumber) {

       return phonebook.containsKey(name) && phonebook.containsValue(phoneNumber) ? true : false;
    }
    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        return null;
    }

    public List<String> getAllContactNames() {

        List<String> list = new ArrayList<String>();
        for(String key : phonebook.keySet())
        {
            list.add(key);
        }
        return list;

    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
