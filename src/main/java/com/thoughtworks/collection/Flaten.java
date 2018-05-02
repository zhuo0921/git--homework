package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        int len=0;
        for(Integer[] element:array){
            len+=element.length;
        }
        List<Integer> list=new ArrayList<>();
        for(Integer[] arr:array)
            for(Integer element:arr)
                list.add(element);
        return list;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        Add add=new Add();
        List<Integer> list=new ArrayList<>();
        list=transformToOneDimesional();
        List<Integer> unrepteadone = add.getUnpreatedIndex(list);
        return unrepteadone;
    }
}
