package com.jonathan.datastructures;

import com.jonathan.datastructures.List;


public class List{
     private String[] elements = new String[8];

     public String get(int index){
       return this.elements[index];
     }

     public void set(int index, String value){
    this.elements[index] = value;
    public int add(String value) {
        int index = -1;
        
        //if there is already a null element in the array, assign value at that index
        for (int i = 0; i < elements.length; i++) {
            if (null == elements[i]) {
                elements[i] = value;
                return i;
            
            
        }
        public String remove() {
            int index = -1;
            String value = "";
        
            //loop through list backwards and remove last element
            for (int i = elements.length-1; i >= 0; i--) {
                if (null != elements[i]) {
                    index = i;
                    value = elements[i];
                    elements[i] = null;
                    break;
                }
            }
        

        //if here then we need to increase the size of the elements array
        String[] temp = new String[elements.length*2];
 
        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }
 
        //add in new value
        index = elements.length;
        temp[elements.length] = value;

        //copy temp to elements variable
        elements = temp;

        return index;
  }
}