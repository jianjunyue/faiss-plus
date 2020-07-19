/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bj58.spider.faiss;

public class ReadOnlyInvertedLists extends InvertedLists {
  private transient long swigCPtr;

  protected ReadOnlyInvertedLists(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.ReadOnlyInvertedLists_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ReadOnlyInvertedLists obj) {
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
        swigfaissJNI.delete_ReadOnlyInvertedLists(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public long add_entries(long list_no, long n_entry, SWIGTYPE_p_long_long ids, SWIGTYPE_p_unsigned_char code) {
    return swigfaissJNI.ReadOnlyInvertedLists_add_entries(swigCPtr, this, list_no, n_entry, SWIGTYPE_p_long_long.getCPtr(ids), SWIGTYPE_p_unsigned_char.getCPtr(code));
  }

  public void update_entries(long list_no, long offset, long n_entry, SWIGTYPE_p_long_long ids, SWIGTYPE_p_unsigned_char code) {
    swigfaissJNI.ReadOnlyInvertedLists_update_entries(swigCPtr, this, list_no, offset, n_entry, SWIGTYPE_p_long_long.getCPtr(ids), SWIGTYPE_p_unsigned_char.getCPtr(code));
  }

  public void resize(long list_no, long new_size) {
    swigfaissJNI.ReadOnlyInvertedLists_resize(swigCPtr, this, list_no, new_size);
  }

}
