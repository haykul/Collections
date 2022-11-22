package be.intecbrussel;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MyCollection {
    // stap 1 maak een lege array van string
    // stap2 maak constructor die een array van string ontvangt
    // stap 3 add methode
    // stap 4 get methode
    // stap 5 size methode
    // stap 6 remove methode
    private String[] arr;
    public MyCollection(String[] arr) {
        this.arr = arr;
    }
    public void add(String value) {
        arr=Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=value;



    }
    public void remove(int index) {
    String[]tmpArr=new String[arr.length-1];
    int count=0;
    for (int i=0; i<arr.length; i++){
        if (i !=index){
            tmpArr[i]=arr[i];
            count++;
        }
        }
    arr=tmpArr;
    }
    public int size() {
        return arr.length;
    }

    public String get(int index) {
        return arr[index];
    }
}


