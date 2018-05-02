package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list=new ArrayList<>();
       if(left<=right){
           while (left<=right) list.add(left++);
       }
       else {
           while (left>=right) list.add(left--);
       }
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
       CollectionOperator collectionOperator=new CollectionOperator();
       List<Integer> list=collectionOperator.getListByInterval(left,right);
       Add add=new Add();
       List<Integer> even=add.getEvenofArray(list);
       return even;
    }
    public List<Integer> intToInteger(int[] array){
        Integer[] num=new Integer[array.length];
        for(int i=0;i<array.length;i++)
            num[i]=Integer.valueOf(array[i]);
        List<Integer> list=Arrays.asList(num);
        return list;
    }
    public List<Integer> popEvenElments(int[] array) {
        CollectionOperator collectionOperator=new CollectionOperator();
        List<Integer> list=collectionOperator.intToInteger(array);
        Add add=new Add();
        List<Integer> even=add.getEvenofArray(list);
        return even;
    }

    public int popLastElment(int[] array) {
        int len=array.length;
        int lastElement=array[len-1];
        return lastElement;
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        CollectionOperator collectionOperator=new CollectionOperator();
        List<Integer> first=collectionOperator.intToInteger(firstArray);
        List<Integer> second=collectionOperator.intToInteger(secondArray);
        List<Integer> popCommon=new ArrayList<>();
        for(Integer num:first){
            if(second.contains(num))
                popCommon.add(num);
        }
        return popCommon;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        CollectionOperator collectionOperator=new CollectionOperator();
        List<Integer> first=Arrays.asList(firstArray);
        List<Integer> second=Arrays.asList(secondArray);
        List<Integer> addUncmmon=new ArrayList<>();
        addUncmmon.addAll(first);
        for(Integer num:second){
            if(!first.contains(num))
                addUncmmon.add(num);
        }
        return  addUncmmon;
    }
}
