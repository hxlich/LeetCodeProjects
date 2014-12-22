package com.company.Sorting.MergeSorting;

import java.util.Arrays;

/**
 * Created by hanh on 12/22/2014.
 */
public class MergeSorting {

    public static int [] sort(int [] m){
        if(m.length <= 1){
            return m;
        }

        for(int s=1; s< m.length ; s *= 2){
            int k = 2 * s;
            for(int i = 0; i*s < m.length ; i +=2){

                int lFrom = s*i;
                int lTo = m.length < s*(i+1) ? m.length : s*(i+1);
                int [] left = Arrays.copyOfRange(m, lFrom, lTo);
                int rFrom = lTo;
                int rTo = m.length < s*(i+2) ? m.length : s*(i+2);
                int [] right = Arrays.copyOfRange(m,rFrom, rTo);
                int [] t = sortSub(left, right);
                m = cpBack(m, t, lFrom, rTo);
            }
        }
        return m;
    }


    private static int[] cpBack(int [] dest, int [] src , int from, int end){
        for(int i=from, j=0 ; i< end ; i++){
            dest[i] = src[j++];
        }
        return dest;
    }

    private static int [] sortSub(int [] left, int [] right){
        int l = 0, r = 0;
        int [] result = new int[left.length + right.length];

        for(int i = 0; i < result.length ; i++){

            if( l == left.length){
                for(; r<right.length ; i++){
                    result[i] = right[r++];
                }
                break;
            }

            if( r == right.length){
                for(; l<left.length ; i++){
                    result[i] = left[l++];
                }
                break;
            }

            if(left[l] < right[r]){
                result[i] = left[l++];
            }else {
                result[i] = right[r++];
            }
        }

        return result;
    }
}
