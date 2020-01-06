package com.github.perschola;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encryptor {
      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          List<String> listPhrase = new ArrayList<>();
          String acronym = "";
          listPhrase = Arrays.asList(phrase.split(" "));
          for (int i = 0; i < listPhrase.size(); i++) {
              acronym += listPhrase.get(i).charAt(0);
          }
          return acronym.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String alphabet = "abcdefghijklmnopqrstuvwxyz";
          String encryptedWord = "" ;
          int index = 0;

          for (int i = 0; i < word.length(); i++) {
              Character tempChar = word.charAt(i);

              index = alphabet.indexOf(tempChar) + 3;
              if(index > 25){
                  index -= 26;
              }
              encryptedWord += alphabet.charAt(index);
          }
          return encryptedWord;
      }
}
