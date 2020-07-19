/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bj58.spider.faiss;

public class floatArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected floatArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(floatArray obj) {
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
        swigfaissJNI.delete_floatArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public floatArray(int nelements) {
    this(swigfaissJNI.new_floatArray(nelements), true);
  }

  public float getitem(int index) {
    return swigfaissJNI.floatArray_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, float value) {
    swigfaissJNI.floatArray_setitem(swigCPtr, this, index, value);
  }

  public SWIGTYPE_p_float cast() {
    long cPtr = swigfaissJNI.floatArray_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public static floatArray frompointer(SWIGTYPE_p_float t) {
    long cPtr = swigfaissJNI.floatArray_frompointer(SWIGTYPE_p_float.getCPtr(t));
    return (cPtr == 0) ? null : new floatArray(cPtr, false);
  }

}
