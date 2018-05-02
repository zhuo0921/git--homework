package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        Add add=new Add();
        List<Integer> list=add.getEvenofArray(array);
        return list;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list=new ArrayList<>();
        for(Integer num:array){
            if(num.intValue()%3==0)
                list.add(num);
        }
        return list;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> popCommon=new ArrayList<>();
        for(Integer num:firstList){
            if(secondList.contains(num))
                popCommon.add(num);
        }
        return popCommon;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> differentElement=new ArrayList<>();
        for(Integer num:array){
            if(!differentElement.contains(num))
                differentElement.add(num);
        }
        return differentElement;
    }
}