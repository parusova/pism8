package by.bsuir.parusova;

import java.util.ArrayList;
import java.util.List;

import static by.bsuir.parusova.Printer.print;

public class Main {

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        int indexOfItemToRemove = 2;

        data.add("Some first string");
        data.add("Some second string");
        data.add("Some third string");
        data.add("Some fourth string");

        for(String str : data) {
            print(str);
        }

        data.remove(indexOfItemToRemove);

        for(String str : data) {
            print(str);
        }

    }
}
