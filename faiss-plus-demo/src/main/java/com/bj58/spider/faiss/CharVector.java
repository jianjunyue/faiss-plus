/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bj58.spider.faiss;

public class CharVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CharVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CharVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_CharVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CharVector() {
    this(swigfaissJNI.new_CharVector(), true);
  }

  public void push_back(char arg0) {
    swigfaissJNI.CharVector_push_back(swigCPtr, this, arg0);
  }

  public void clear() {
    swigfaissJNI.CharVector_clear(swigCPtr, this);
  }

  public String data() {
    return swigfaissJNI.CharVector_data(swigCPtr, this);
  }

  public long size() {
    return swigfaissJNI.CharVector_size(swigCPtr, this);
  }

  public char at(long n) {
    return swigfaissJNI.CharVector_at(swigCPtr, this, n);
  }

  public void resize(long n) {
    swigfaissJNI.CharVector_resize(swigCPtr, this, n);
  }

  public void swap(CharVector other) {
    swigfaissJNI.CharVector_swap(swigCPtr, this, CharVector.getCPtr(other), other);
  }

}
