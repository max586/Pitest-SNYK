package org.example;

import java.util.List;
import java.util.Objects;

public class SimpleMutatorOperatorsCheck {
    public static boolean compareNumbers(int a, int b){
        return a <= b;
    }
    public static List<Integer> sortList(List<Integer> l){
        l.sort(Integer::compareTo);
        return l;
    }

    static class A {
        int a;
        A(int a){this.a = a;}

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            A a1 = (A) o;
            return a == a1.a;
        }
    }

    public static A getA(int a){
        return new A(a);
    }

    public static int sum(int a, int b){
        if(a==b){
            System.out.println("Some message");
        }
        return a+b;
    }
}
