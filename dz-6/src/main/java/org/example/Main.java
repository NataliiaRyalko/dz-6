package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList words = new ArrayList<String>();
        //- приймає як вхідний параметр масив рядків; (наприклад "мама", "папа", "їж їжак желе");
        Methods.scanArray(words);
        //- із заданого списку рядків знаходить перші два, в яких кожен символ трапляється парну кількість разів;
        ArrayList findTwoWord = Methods.findTwoWordsWithDuoLetters(words);
        //- знаходить набір унікальних символів у словах знайдених слів (для наведеного прикладу "мама", "папа" це буде [м а п]);
        ArrayList wordsUniqueSym = Methods.findUniqueChars(words);
        //- повертає набір літер у вигляді масиву або будь-якого типу колекції, порядок літер при цьому значення не має.
        Methods.giveMeSyms(words);
    }
}
 