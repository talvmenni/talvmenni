package org.forritan.talvmenni.visitor;

public interface Switchable<T> {
   void apply(
         Switch<T> sw);
}