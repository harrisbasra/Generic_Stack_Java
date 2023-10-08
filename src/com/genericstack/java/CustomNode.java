package com.genericstack.java;

public class CustomNode<T> {
    CustomNode<T> ptr;
    T dataPill;
    CustomNode(T dP){
        ptr = null;
        dataPill = dP;
    }

}
