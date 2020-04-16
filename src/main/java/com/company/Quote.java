package com.company;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Quote extends Collection {
    private String Quote;

    public Quote(String quote) {
        Quote = quote;
    }

    public void Write() {


        String quo = Quote;
        FileWriter FW = null;


        {
            try {

                FW = new FileWriter("C:/Users/Public/test.txt", true);
                FW.write("\n" + Quote );
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    FW.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public void Add(){
        List1.add(Quote);
    };





}