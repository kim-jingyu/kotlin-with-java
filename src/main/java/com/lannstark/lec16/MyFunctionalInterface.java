package com.lannstark.lec16;

@FunctionalInterface
interface MyFunctionalInterface {
    void foo();
    default void bark() { /*..*/ }
    static void fly() { /*..*/ }
}
