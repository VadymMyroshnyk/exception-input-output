package com.example.exception.multiple;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class MultipleCatchBlock {

    public static void main(String[] args) {
        MultipleCatchBlock multipleCatchBlock = new MultipleCatchBlock();
        multipleCatchBlock.run("/path");
//        multipleCatchBlock.runTwo("/path");
    }

    public void run(String file) {
        try {
            readAndParse(file);
        } catch (FileNotFoundException ex) {
            // do something when file is not found
        } catch (ParseException ex) {
            // do something if the parsing fails
        }
    }

//    public void runTwo(String file) {
//        try {
//            readAndParse(file);
//        } catch (Exception ex) {
//            // this block will catch all exceptions
//        } catch (ParseException ex) {
//            // this block will not be executed
//        }
//    }

    public void runSingleCatch(String file) {
        try {
            readAndParse(file);
        } catch (FileNotFoundException | ParseException ex) {
            // do something when file is not found
        }
    }

    public static void readAndParse(String file) throws FileNotFoundException, ParseException {
        // some business code
    }
}
