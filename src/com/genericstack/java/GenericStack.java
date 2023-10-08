package com.genericstack.java;

import java.util.EmptyStackException;


public class GenericStack<T> {
    CustomNode<T> headNode;
    int length;
    GenericStack(){
        headNode = null;
        length=0;
    }
    public void push(T data){
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
        try{
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
        catch (EmptyStackException e){
            System.out.println("Your Stack was Empty: "+e.getMessage());
        }
        finally {
            System.out.println("Pop function peacefully resolved");
        }


    }

    boolean isEmpty(){
        return headNode == null;
    }

    int size(){
        return length;
    }

    void print(){
        CustomNode<T> copy = headNode;
        System.out.print("The Data Members are: ");
        while(copy!=null){
            System.out.print(copy.dataPill + " -> ");
            copy=copy.ptr;
        }
        System.out.println();
    }


}
