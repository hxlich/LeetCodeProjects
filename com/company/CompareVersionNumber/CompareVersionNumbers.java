package com.company.CompareVersionNumber;

import java.util.ArrayList;

//Compare two version numbers version1 and version1.
//        If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
//
//        You may assume that the version strings are non-empty and contain only digits and the . character.
//        The . character does not represent a decimal point and is used to separate number sequences.
//        For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
//
//        Here is an example of version numbers ordering:
//
//        0.1 < 1.1 < 1.2 < 13.37
public class CompareVersionNumbers {

    private static final byte table[]={'0','1','2','3','4','5','6','7','8','9'};

    public int compareVersion(String version1, String version2) {
        ArrayList<Integer> al1 = convertVersion(version1);
        ArrayList<Integer> al2 = convertVersion(version2);

        return compare(al1,al2);
    }

    private int compare( ArrayList<Integer> v1,  ArrayList<Integer> v2){
        ArrayList<Integer> l,s;
        boolean rev = false;
        if(v1.size() > v2.size()){
            l = v1;
            s = v2;
        }else{
            s = v1;
            l = v2;
            rev = true;
        }
        for(int i=0; i<l.size(); i++){
            if(s.size() == i){
                for(int j=i ; j<l.size();j++){
                    if(l.get(j) != 0){
                        return (rev ? -1 : 1);
                    }
                }
                return 0;

            }
            if(l.get(i) > s.get(i)){
                return (rev ? -1 : 1);
            }else if(l.get(i) < s.get(i)){
                return (rev ? 1 : -1);
            }
        }
        return 0;
    }

    private ArrayList<Integer>  convertVersion(String sVer){
        byte [] v = sVer.getBytes();
        ArrayList<Integer> al = new ArrayList<Integer>();
        int c=0;
        for(int i=0 ; i<v.length ; i++){
            if(v[i] == '.'){
                al.add(c);
                c = 0;
            }else{
                c *= 10;
                c += ctoi(v[i]);
            }
        }
        if( c != 0) {
            al.add(c);
        }
        return al;
    }

    private float ctoi( byte b){
        for(int i=0 ; i< table.length ; i++){
            if(b == table[i]){
                return i;
            }
        }
        return 0;
    }
}
