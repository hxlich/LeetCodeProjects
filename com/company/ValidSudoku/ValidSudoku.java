package com.company.ValidSudoku;

/**
 * Created by hanh on 12/24/2014.
 */
public class ValidSudoku {
    private static final int blank = '.'-48-1;
    private int [] mTable = new int[9];

    private void clearTable(){
        for(int j=0; j<mTable.length; j++){
            mTable[j] = 0;
        }
    }

    private boolean isValid(char number){
        int key = number - 48-1;
        if(key == blank) return true;
        int count =mTable[key];
        if(count != 0){
            return false;
        }
        mTable[key]++;
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        if( board.length % 3 != 0 ) return false;
        int [] table = new int[10];
        int c = board.length;
        for(int i=0 ; i< c ; i++){
            for(int j=0 ; j<c ; j++) {
                if(!isValid(board[i][j])){
                    return false;
                }
            }
            clearTable();

            for(int j =0 ; j<c ; j++){
                if(!isValid(board[j][i])){
                    return false;
                }
            }

            clearTable();

            if(i %3 == 0){
                for(int j=0 ; j<c; j+=3){
                    for(int k=i; k<i+3;k++){
                        for(int l =j; l<j+3; l++){
                            if(!isValid(board[k][l])){
                                return false;
                            }
                        }
                    }
                    clearTable();
                }
            }
        }

        return true;
    }

}
