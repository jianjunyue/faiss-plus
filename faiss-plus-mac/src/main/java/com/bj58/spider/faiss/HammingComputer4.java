/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bj58.spider.faiss;

public class HammingComputer4 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HammingComputer4(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HammingComputer4 obj) {
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
        swigfaissJNI.delete_HammingComputer4(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setA0(long value) {
    swigfaissJNI.HammingComputer4_a0_set(swigCPtr, this, value);
  }

  public long getA0() {
    return swigfaissJNI.HammingComputer4_a0_get(swigCPtr, this);
  }

  public HammingComputer4() {
    this(swigfaissJNI.new_HammingComputer4__SWIG_0(), true);
  }

  public HammingComputer4(SWIGTYPE_p_unsigned_char a, int code_size) {
    this(swigfaissJNI.new_HammingComputer4__SWIG_1(SWIGTYPE_p_unsigned_char.getCPtr(a), code_size), true);
  }

  public void set(SWIGTYPE_p_unsigned_char a, int code_size) {
    swigfaissJNI.HammingComputer4_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(a), code_size);
  }

  public int hamming(SWIGTYPE_p_unsigned_char b) {
    return swigfaissJNI.HammingComputer4_hamming(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(b));
  }

}
