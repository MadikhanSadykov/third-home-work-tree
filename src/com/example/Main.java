package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the size of the fir tree: ");
        int size = scanner.nextInt();
        scanner.close();

        System.out.println("Here is Fir tree with size of " + size);

        FirTree tree = new FirTree(size);
        tree.drawFirTree();
    }

}
