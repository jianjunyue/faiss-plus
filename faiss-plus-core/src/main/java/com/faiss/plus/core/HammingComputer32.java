/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.faiss.plus.core;

public class HammingComputer32 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HammingComputer32(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HammingComputer32 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_HammingComputer32(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setA0(long value) {
    swigfaissJNI.HammingComputer32_a0_set(swigCPtr, this, value);
  }

  public long getA0() {
    return swigfaissJNI.HammingComputer32_a0_get(swigCPtr, this);
  }

  public void setA1(long value) {
    swigfaissJNI.HammingComputer32_a1_set(swigCPtr, this, value);
  }

  public long getA1() {
    return swigfaissJNI.HammingComputer32_a1_get(swigCPtr, this);
  }

  public void setA2(long value) {
    swigfaissJNI.HammingComputer32_a2_set(swigCPtr, this, value);
  }

  public long getA2() {
    return swigfaissJNI.HammingComputer32_a2_get(swigCPtr, this);
  }

  public void setA3(long value) {
    swigfaissJNI.HammingComputer32_a3_set(swigCPtr, this, value);
  }

  public long getA3() {
    return swigfaissJNI.HammingComputer32_a3_get(swigCPtr, this);
  }

  public HammingComputer32() {
    this(swigfaissJNI.new_HammingComputer32__SWIG_0(), true);
  }

  public HammingComputer32(SWIGTYPE_p_unsigned_char a8, int code_size) {
    this(swigfaissJNI.new_HammingComputer32__SWIG_1(SWIGTYPE_p_unsigned_char.getCPtr(a8), code_size), true);
  }

  public void set(SWIGTYPE_p_unsigned_char a8, int code_size) {
    swigfaissJNI.HammingComputer32_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(a8), code_size);
  }

  public int hamming(SWIGTYPE_p_unsigned_char b8) {
    return swigfaissJNI.HammingComputer32_hamming(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(b8));
  }

}