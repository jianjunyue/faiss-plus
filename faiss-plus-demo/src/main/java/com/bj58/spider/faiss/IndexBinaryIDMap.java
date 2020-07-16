/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bj58.spider.faiss;

public class IndexBinaryIDMap extends IndexBinary {
  private transient long swigCPtr;

  protected IndexBinaryIDMap(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexBinaryIDMap_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexBinaryIDMap obj) {
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
        swigfaissJNI.delete_IndexBinaryIDMap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setIndex(IndexBinary value) {
    swigfaissJNI.IndexBinaryIDMap_index_set(swigCPtr, this, IndexBinary.getCPtr(value), value);
  }

  public IndexBinary getIndex() {
    long cPtr = swigfaissJNI.IndexBinaryIDMap_index_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IndexBinary(cPtr, false);
  }

  public void setOwn_fields(boolean value) {
    swigfaissJNI.IndexBinaryIDMap_own_fields_set(swigCPtr, this, value);
  }

  public boolean getOwn_fields() {
    return swigfaissJNI.IndexBinaryIDMap_own_fields_get(swigCPtr, this);
  }

  public void setId_map(SWIGTYPE_p_std__vectorT_long_long_t value) {
    swigfaissJNI.IndexBinaryIDMap_id_map_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_long_long_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_long_long_t getId_map() {
    long cPtr = swigfaissJNI.IndexBinaryIDMap_id_map_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_long_long_t(cPtr, false);
  }

  public IndexBinaryIDMap(IndexBinary index) {
    this(swigfaissJNI.new_IndexBinaryIDMap__SWIG_0(IndexBinary.getCPtr(index), index), true);
  }

  public void add_with_ids(long n, SWIGTYPE_p_unsigned_char x, SWIGTYPE_p_long_long xids) {
    swigfaissJNI.IndexBinaryIDMap_add_with_ids(swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(x), SWIGTYPE_p_long_long.getCPtr(xids));
  }

  public void add(long n, SWIGTYPE_p_unsigned_char x) {
    swigfaissJNI.IndexBinaryIDMap_add(swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(x));
  }

  public void search(long n, SWIGTYPE_p_unsigned_char x, long k, SWIGTYPE_p_int distances, SWIGTYPE_p_long_long labels) {
    swigfaissJNI.IndexBinaryIDMap_search(swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(x), k, SWIGTYPE_p_int.getCPtr(distances), SWIGTYPE_p_long_long.getCPtr(labels));
  }

  public void train(long n, SWIGTYPE_p_unsigned_char x) {
    swigfaissJNI.IndexBinaryIDMap_train(swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(x));
  }

  public void reset() {
    swigfaissJNI.IndexBinaryIDMap_reset(swigCPtr, this);
  }

  public long remove_ids(IDSelector sel) {
    return swigfaissJNI.IndexBinaryIDMap_remove_ids(swigCPtr, this, IDSelector.getCPtr(sel), sel);
  }

  public void range_search(long n, SWIGTYPE_p_unsigned_char x, int radius, RangeSearchResult result) {
    swigfaissJNI.IndexBinaryIDMap_range_search(swigCPtr, this, n, SWIGTYPE_p_unsigned_char.getCPtr(x), radius, RangeSearchResult.getCPtr(result), result);
  }

  public IndexBinaryIDMap() {
    this(swigfaissJNI.new_IndexBinaryIDMap__SWIG_1(), true);
  }

}
