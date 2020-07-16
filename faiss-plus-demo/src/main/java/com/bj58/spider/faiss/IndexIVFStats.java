/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bj58.spider.faiss;

public class IndexIVFStats {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IndexIVFStats(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexIVFStats obj) {
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
        swigfaissJNI.delete_IndexIVFStats(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNq(long value) {
    swigfaissJNI.IndexIVFStats_nq_set(swigCPtr, this, value);
  }

  public long getNq() {
    return swigfaissJNI.IndexIVFStats_nq_get(swigCPtr, this);
  }

  public void setNlist(long value) {
    swigfaissJNI.IndexIVFStats_nlist_set(swigCPtr, this, value);
  }

  public long getNlist() {
    return swigfaissJNI.IndexIVFStats_nlist_get(swigCPtr, this);
  }

  public void setNdis(long value) {
    swigfaissJNI.IndexIVFStats_ndis_set(swigCPtr, this, value);
  }

  public long getNdis() {
    return swigfaissJNI.IndexIVFStats_ndis_get(swigCPtr, this);
  }

  public void setNheap_updates(long value) {
    swigfaissJNI.IndexIVFStats_nheap_updates_set(swigCPtr, this, value);
  }

  public long getNheap_updates() {
    return swigfaissJNI.IndexIVFStats_nheap_updates_get(swigCPtr, this);
  }

  public void setQuantization_time(double value) {
    swigfaissJNI.IndexIVFStats_quantization_time_set(swigCPtr, this, value);
  }

  public double getQuantization_time() {
    return swigfaissJNI.IndexIVFStats_quantization_time_get(swigCPtr, this);
  }

  public void setSearch_time(double value) {
    swigfaissJNI.IndexIVFStats_search_time_set(swigCPtr, this, value);
  }

  public double getSearch_time() {
    return swigfaissJNI.IndexIVFStats_search_time_get(swigCPtr, this);
  }

  public IndexIVFStats() {
    this(swigfaissJNI.new_IndexIVFStats(), true);
  }

  public void reset() {
    swigfaissJNI.IndexIVFStats_reset(swigCPtr, this);
  }

}
