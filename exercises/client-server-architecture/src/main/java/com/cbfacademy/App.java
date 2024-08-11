package com.cbfacademy;

import java.net.URI;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class App {
    public static void main(String[] args) {
        try {
            // Creating and opening a connection to the cbf website
            URL url = new URI("https://codingblackfemales.com/").toURL();
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // GET request to load the website
            connection.setRequestMethod("GET");

            // Creating an instance of the BufferedReader class in order to gather the data 
                // Buffering is adding up all the bits of the data, gathering all the jigsaw pieces
                //InputStreamReader is reading each packet of 1s and 0s as they flow in a stream
                // BufferedReader is collecting them all up and assembling them in the correct way
            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                
                String inputLine;

                // While loop to loop through and read each line of the website
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }

                // Closing the connection
                connection.disconnect();
            }
        // Generic catch block to catch any kind of exception - anything from incorrect URL, incorrect data type, connection loss etc.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}