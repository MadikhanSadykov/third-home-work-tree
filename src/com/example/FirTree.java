package com.example;

public class FirTree {

    private char[][] tree;
    private int high;

    public FirTree() {
        this(10); // default value
    }

    public FirTree(int high) {
        this.tree = new char[high][2 * high - 1];
        this.high = high;
        createFirTree();
    }

    private void createFirTree() {

        for (int row = 0; row < high; row++) {

            int space = 0;

            while (space < high - row) {
                this.tree[row][space] = ' ';
                space++;
            }

            space--;

            for (int star = 0; star < 2 * row + 1; star++) {
                this.tree[row][space + star] = '*';
            }

        }

    }

    public void drawFirTree() {

        for (int row = 0; row < high; row++) {

            for (int c = 0; c < tree[row].length; c++) {
                if (tree[row][c] != '\u0000') {
                    System.out.print(tree[row][c]);
                }
            }

            System.out.println();
        }

    }

    public char[][] getTree() {
        return tree;
    }

    public void setTree(char[][] tree) {
        this.tree = tree;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
