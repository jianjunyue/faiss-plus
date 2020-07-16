/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bj58.spider.faiss;

public class GenHammingComputer8 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GenHammingComputer8(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GenHammingComputer8 obj) {
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
        swigfaissJNI.delete_GenHammingComputer8(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setA0(java.math.BigInteger value) {
    swigfaissJNI.GenHammingComputer8_a0_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getA0() {
    return swigfaissJNI.GenHammingComputer8_a0_get(swigCPtr, this);
  }

  public GenHammingComputer8(SWIGTYPE_p_unsigned_char a, int code_size) {
    this(swigfaissJNI.new_GenHammingComputer8(SWIGTYPE_p_unsigned_char.getCPtr(a), code_size), true);
  }

  public int hamming(SWIGTYPE_p_unsigned_char b) {
    return swigfaissJNI.GenHammingComputer8_hamming(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(b));
  }

}
