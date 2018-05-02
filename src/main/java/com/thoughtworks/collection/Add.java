package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sunofevens=0;
        int min=Math.min(leftBorder,rightBorder);
        int max=Math.max(leftBorder,rightBorder);
        while (min<=max){
            if(min%2==0){
                sunofevens+=min;
                min+=2;
            }
            else min++;
        }
        return sunofevens;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sumofodd=0;
        int min=Math.min(leftBorder,rightBorder);
        int max=Math.max(leftBorder,rightBorder);
        while (min<=max){
            if(min%2==1){
                sumofodd+=min;
                min+=2;
            }
            else min++;
        }
        return sumofodd;
    }
    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
       int suntripleandtwo=0;
        for(Integer i:arrayList){
            suntripleandtwo+=(i.intValue()*3+2);
        }
        return suntripleandtwo;
    }
    public List<Integer> getTripleofList(List<Integer> arrayList){//list的三倍
        List<Integer> triple=new ArrayList<>();
        for (Integer num:arrayList){
            int i=num.intValue();
            triple.add(i*3);
        }
        return triple;
    }
    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> tripleofoddandtwo=new ArrayList<>();
        for (Integer num:arrayList){
            int i=num.intValue();
            if(i%2==1){
                tripleofoddandtwo.add(i*3+2);
            }
            else tripleofoddandtwo.add(i);
        }
        return tripleofoddandtwo;
    }
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sumofprocessedodds=0;
        for (Integer num:arrayList){
            if(num%2==1){
                sumofprocessedodds+=(num*3+5);
            }
        }
        return sumofprocessedodds;
    }
    public List<Integer> getEvenofArray(List<Integer> arrayList){
        List<Integer> median=new ArrayList<>();
        for(Integer num:arrayList){
            if(num.intValue()%2==0){
                median.add(num);
            }
        }
        return median;
    }
    public List<Integer> getOddofArray(List<Integer> arrayList){
        List<Integer> median=new ArrayList<>();
        for(Integer num:arrayList){
            if(num.intValue()%2==1){
                median.add(num);
            }
        }
        return median;
    }
    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        double medianofeven=0;
        Add add=new Add();
        List<Integer> median=add.getEvenofArray(arrayList);
        medianofeven=getMedianofIndex(median);
        return medianofeven;
    }
    public double getMedianofIndex(List<Integer> arrayList){
        int len=arrayList.size();
        double Median=0;
        int Index=len/2;
        if(len%2==0){
            double low=arrayList.get(Index-1);
            double high=arrayList.get(Index);
            Median=(low+high)/2;
        }
        else Median=arrayList.get(Index);
        return Median;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        double medianofeven=0;
        Add add=new Add();
        List<Integer> median=add.getEvenofArray(arrayList);
        int evennum=median.size();
        for( Integer i:median)
            medianofeven+=i.intValue();
        if(evennum==0) return 0;
        return medianofeven/evennum;
    }
    public double getAverageofIndex(List<Integer> arrayList) {//求数组平均值
        int len = arrayList.size();
        double total = 0;
        for (Integer i : arrayList) {
            total += i.intValue();
        }
        if (len == 0) return 0;
        return total / len;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        Add add=new Add();
        List<Integer> evenelement=add.getEvenofArray(arrayList);
        boolean SpElement=evenelement.contains(specialElment);
        return SpElement;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {//这部分需不需要重新写
        Add add=new Add();
        List<Integer> evenelement=add.getEvenofArray(arrayList);
        List<Integer> unrepeatedFromEven=new ArrayList<>();
        for(Integer num:evenelement){
            if(!add.isIncludedInEvenIndex(unrepeatedFromEven,num)){
                unrepeatedFromEven.add(num);
            }
        }
        return unrepeatedFromEven;
    }
    public List<Integer> getUnpreatedIndex(List<Integer> arrayList){//在后面需要这部分抽象出来的时候，原来的代码需不要重新写?
        List<Integer> unrepeated=new ArrayList<>();
        for(Integer num:arrayList){
            if(!unrepeated.contains(num)){
                unrepeated.add(num);
            }
        }
        return unrepeated;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        Add add=new Add();
        List<Integer> even=add.getEvenofArray(arrayList);
        Collections.sort(even, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        List<Integer> Odd=add.getOddofArray(arrayList);
        Collections.sort(Odd, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return o2.compareTo(o1);
            }
        });
        even.addAll(Odd);
        return even;
    }
    public List<Integer> ascendofList(List<Integer> arrayList){//升序
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        return arrayList;
    }
    public List<Integer> decendofList(List<Integer> arrayList){//降序
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        return arrayList;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> processedlist=new ArrayList<>();
        for(int i=0;i<arrayList.size()-1;i++){
            int sum=arrayList.get(i).intValue()+arrayList.get(i+1).intValue();
            processedlist.add(sum*3);
        }
        return processedlist;
    }
}
