package com.genericstack.java;

import java.util.EmptyStackException;


public class GenericStack<T> {
    CustomNode<T> headNode;
    int length;
    GenericStack(){
        headNode = null;
        length=0;
    }
    void push(T data){
        CustomNode<T> newNode = new CustomNode<>(data);
        if(headNode == null){
            headNode = newNode;
        }
        else{
            CustomNode<T> copy = headNode;
            while(copy.ptr!=null){
                copy=copy.ptr;
            }
            copy.ptr=newNode;
        }
        length++;
    }
    void pop(){

        CustomNode<T> copy = headNode;
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        if(copy.ptr==null){
            headNode = null;
            return;
        }
        while(copy.ptr.ptr!=null){
            copy=copy.ptr;
        }
        copy.ptr = null;


    }



}
