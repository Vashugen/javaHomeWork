package com.orion.lesson6.tuple;

import java.util.Objects;

public class Triple<T1, T2, T3> extends Pair{

    public T1 first;
    public T2 second;
    public T3 third;

    public Triple(T1 first, T2 second, T3 third) {
        super(first, second);
        this.third = third;
    }

    public T3 getThird(){
        return third;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triple<?, ?, ?> triple = (Triple<?, ?, ?>) o;
        return Objects.equals(first, triple.first) && Objects.equals(second, triple.second) && Objects.equals(third, triple.third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }
}
