package com.jessitron.hg.RenameMethod;

public class CallerOfRenamedMethod {

    public void doTheThing(DefinerOfRenamedMethod corm) {
        // blah blah

        System.out.println("Here is the result: " + corm.oldMethodName());
    }
}