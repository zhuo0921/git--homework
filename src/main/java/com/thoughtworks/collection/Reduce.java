package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Reduce implements SingleLink<Integer> {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public Integer getHeaderData(){
        return arrayList.get(0);
    }

    @Override
    public Integer getTailData() {
        return arrayList.get(arrayList.size()-1);
    }

    @Override
    public int size(){
        return arrayList.size();
    }
    @Override
    public boolean isEmpty(){
        return  arrayList.isEmpty();
    }
    @Override
    public boolean deleteFirst(){
        Integer first=getHeaderData();
        return arrayList.remove(first);
    }
    @Override
    public boolean deleteLast(){
        Integer end=getTailData();
        return arrayList.remove(end);
    }
    @Override
    public void addHeadPointer(Integer item){
        arrayList.add(0,item);
    }
    @Override
    public void addTailPointer(Integer item){
        arrayList.add(item);
    }
    @Override
    public Integer getNode(int index){
        return arrayList.get(index-1);
    }

    public int getMaximum() {
        Add add=new Add();
        List<Integer> list=new ArrayList<>();
        list=add.decendofList(arrayList);
        return list.get(0);
    }

    public double getMinimum() {
        Add add=new Add();
        List<Integer> list=new ArrayList<>();
        list=add.ascendofList(arrayList);
        return list.get(0);
    }

    public double getAverage() {
        Add add=new Add();
        double average=add.getAverageofIndex(arrayList);
        return  average;
    }

    public double getOrderedMedian() {
        Add add=new Add();
        double median=add.getMedianofIndex(arrayList);
        return  median;
    }

    public int getFirstEven() {
        Add add=new Add();
        List<Integer> list=add.getEvenofArray(arrayList);
        return list.get(0);
    }

    public int getIndexOfFirstEven() {
      int firstEven=getFirstEven();
      int index=arrayList.indexOf(firstEven);
      return index;
    }

    public boolean isEqual(List<Integer> arraylist) {
        int lenA=arraylist.size();
        int lenB=arrayList.size();
        if(lenA!=lenB) return false;
        for(Integer i:arrayList)
            if(!arraylist.contains(i))
                return false;
        return true;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        this.arrayList.stream().sorted().mapToInt(num->num).forEach(singleLink::addTailPointer);
        return (double)((int)singleLink.getNode(this.arrayList.size()/2)+(int)singleLink.getNode(this.arrayList.size()/2+1))/2;
        /*int size=arrayList.size();
        Double Median=0.0;
        int Index=size/2;
        System.out.print(arrayList);
       // if(size%2==0){
           // System.out.print( singleLink.getNode(1));
            //Median=(double)((int)this.getNode(Index)+(int)singleLink.getNode(Index+1))/2;
       // }
       // else Median=(double) singleLink.getNode(Index);
        return (double)singleLink.getNode(0);
        */
    }

    public int getLastOdd() {
        Add add=new Add();
        List<Integer> list=add.getOddofArray(arrayList);
        int len=list.size()-1;
        return list.get(len);
    }

    public int getIndexOfLastOdd() {
        int lastOdd=getLastOdd();
        int index=arrayList.indexOf(lastOdd);
        return index;
    }
}
