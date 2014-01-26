/*
 * Copyright (c) 2014. Licensed under GPL-2. See license.txt in project folder.
 */

package de._0x29.xkpasswd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import static java.util.Locale.*;

/**
 * Created by christian on 1/26/14.
 */
public class Dictionary {
    private HashMap<Integer, ArrayList<String>> words;

    public Dictionary() throws IOException {
        words = new HashMap<Integer, ArrayList<String>>();

        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("top10000de.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String word;
        while ((word = bufferedReader.readLine()) != null) {
            if (!word.trim().contains(" ")) {
                //System.out.println("" + word.trim());

                int length = word.trim().length();
                if (!words.containsKey(length)) {
                    words.put(length, new ArrayList<String>());
                }
                ArrayList<String> strings = words.get(length);
                strings.add(word.trim());
            }

        }

//        for (Integer key : words.keySet()) {
//            System.out.println("length: " + key);
//
//            ArrayList<String> strings = words.get(key);
//            for (String string : strings) {
//                System.out.println(string);
//            }
//        }

    }

    public HashMap<Integer, ArrayList<String>> getWords() {
        return words;
    }
}
