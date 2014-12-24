package com.company.ValidSudoku;

/**
 * Created by hanh on 12/24/2014.
 */
public class ValidSudokuTest {

    private static char[][] sample1 = new char[][]{
                                    {'.','8','7','6','5','4','3','2','1'},
                                    {'2','.','.','.','.','.','.','.','.'},
                                    {'3','.','.','.','.','.','.','.','.'},
                                    {'4','.','.','.','.','.','.','.','.'},
                                    {'5','.','.','.','.','.','.','.','.'},
                                    {'6','.','.','.','.','.','.','.','.'},
                                    {'7','.','.','.','.','.','.','.','.'},
                                    {'8','.','.','.','.','.','.','.','.'},
                                    {'9','.','.','.','.','.','.','.','.'}};
    public static void test(){
        ValidSudoku vs = new ValidSudoku();
        boolean res = vs.isValidSudoku(sample1);
    }

}
