/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bj58.spider.faiss;

public class LongVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LongVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LongVector obj) {
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
        swigfaissJNI.delete_LongVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LongVector() {
    this(swigfaissJNI.new_LongVector(), true);
  }

  public void push_back(int arg0) {
    swigfaissJNI.LongVector_push_back(swigCPtr, this, arg0);
  }

  public void clear() {
    swigfaissJNI.LongVector_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_long data() {
    long cPtr = swigfaissJNI.LongVector_data(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_long(cPtr, false);
  }

  public long size() {
    return swigfaissJNI.LongVector_size(swigCPtr, this);
  }

  public int at(long n) {
    return swigfaissJNI.LongVector_at(swigCPtr, this, n);
  }

  public void resize(long n) {
    swigfaissJNI.LongVector_resize(swigCPtr, this, n);
  }

  public void swap(LongVector other) {
    swigfaissJNI.LongVector_swap(swigCPtr, this, LongVector.getCPtr(other), other);
  }

}
