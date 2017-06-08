package com.notahelloworld.kotlin.convertion;

import java.util.concurrent.atomic.AtomicInteger;

public class OldJavaClass {

  private final static AtomicInteger atomicInteger = new AtomicInteger(0);

  public static int generateRandomInt() {
    return atomicInteger.incrementAndGet();
  }

}
