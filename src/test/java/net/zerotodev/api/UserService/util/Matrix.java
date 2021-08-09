package net.zerotodev.api.UserService.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Matrix {

    public int[][] createMatrix(int row, int col){
       int[][] mtx = new int[row][col];
       int k = 1;
       for(int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               mtx[i][j] = k;
               k++;
           }
       }
       return mtx;
    }
}
