package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetAllContactNames {
    @Test
    public void test1() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"John", "Joe", "Jim", "Jay"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }
        List<String> expected= new ArrayList<>(Arrays.asList(names));
        // when
        List<String> actualNames = phoneBook.getAllContactNames();

        // then
        //Assert.assertEquals(Arrays.asList(names), actualNames);

        Assert.assertTrue(expected.size() == actualNames.size()
                && expected.containsAll(actualNames)&& actualNames.containsAll(expected));
    }
    @Test
    public void test2() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"Chris", "Christian", "Christopher", "Christina"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }
        List<String> expected= new ArrayList<>(Arrays.asList(names));
        // when
        List<String> actualNames = phoneBook.getAllContactNames();



        // then
        //Assert.assertEquals(Arrays.asList(names), actualNames);

        Assert.assertTrue(expected.size() == actualNames.size()
                && expected.containsAll(actualNames)&& actualNames.containsAll(expected));
    }

    @Test
    public void test3() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"Ashley", "Aaron", "Albert", "Alfred"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }
        List<String> expected= new ArrayList<>(Arrays.asList(names));
        // when
        List<String> actualNames = phoneBook.getAllContactNames();

        // then
        Assert.assertTrue(expected.size() == actualNames.size()
                && expected.containsAll(actualNames)&& actualNames.containsAll(expected));
    }
}
