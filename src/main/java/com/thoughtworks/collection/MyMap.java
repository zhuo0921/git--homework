package com.thoughtworks.collection;

import com.sun.org.apache.xerces.internal.xs.StringList;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) { this.array = array; }

    public List<Integer> getTriple() {
        Add add=new Add();
        List<Integer> list=new ArrayList<>();
        list=add.getTripleofList(array);
        return list;
    }
    public List<String> mapLetter() {
        List<String> Letter=new ArrayList<>();
        for(Integer isToLetter:array){
            //int Index=isToLetter.intValue();
           // Letter.add(letters[Index-1]);
            Letter=intToLetter(isToLetter,Letter);
        }
        return Letter;
    }
    public List<String> intToLetter(Integer isToLetter,List<String> Letter){
        int Index=isToLetter.intValue();
        Letter.add(letters[Index-1]);
        return Letter;
    }
    public List<String> mapLetters() {
        List<String> list=new ArrayList<>();
        int len=letters.length;
        for(Integer isToLetter:array){
            int Index=isToLetter.intValue();
            String s=new String();
            while (Index>0){
                int m=Index%len;
                if(m==0) m=26;
                s=(char)(m+96)+s;
                Index=(Index-m)/len;
            }
            list.add(s);
        }
        return list;
    }

    public List<Integer> sortFromBig() {
        List<Integer> list=new ArrayList<>();
        Add add=new Add();
        list=add.decendofList(array);
        return list;
    }

    public List<Integer> sortFromSmall() {
        List<Integer> list=new ArrayList<>();
        Add add=new Add();
        list=add.ascendofList(array);
        return list;
    }
}
