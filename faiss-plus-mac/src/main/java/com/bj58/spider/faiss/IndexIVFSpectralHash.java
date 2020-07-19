/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bj58.spider.faiss;

public class IndexIVFSpectralHash extends IndexIVF {
  private transient long swigCPtr;

  protected IndexIVFSpectralHash(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexIVFSpectralHash_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexIVFSpectralHash obj) {
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
        swigfaissJNI.delete_IndexIVFSpectralHash(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setVt(VectorTransform value) {
    swigfaissJNI.IndexIVFSpectralHash_vt_set(swigCPtr, this, VectorTransform.getCPtr(value), value);
  }

  public VectorTransform getVt() {
    long cPtr = swigfaissJNI.IndexIVFSpectralHash_vt_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VectorTransform(cPtr, false);
  }

  public void setOwn_fields(boolean value) {
    swigfaissJNI.IndexIVFSpectralHash_own_fields_set(swigCPtr, this, value);
  }

  public boolean getOwn_fields() {
    return swigfaissJNI.IndexIVFSpectralHash_own_fields_get(swigCPtr, this);
  }

  public void setNbit(int value) {
    swigfaissJNI.IndexIVFSpectralHash_nbit_set(swigCPtr, this, value);
  }

  public int getNbit() {
    return swigfaissJNI.IndexIVFSpectralHash_nbit_get(swigCPtr, this);
  }

  public void setPeriod(float value) {
    swigfaissJNI.IndexIVFSpectralHash_period_set(swigCPtr, this, value);
  }

  public float getPeriod() {
    return swigfaissJNI.IndexIVFSpectralHash_period_get(swigCPtr, this);
  }

  public void setThreshold_type(IndexIVFSpectralHash.ThresholdType value) {
    swigfaissJNI.IndexIVFSpectralHash_threshold_type_set(swigCPtr, this, value.swigValue());
  }

  public IndexIVFSpectralHash.ThresholdType getThreshold_type() {
    return IndexIVFSpectralHash.ThresholdType.swigToEnum(swigfaissJNI.IndexIVFSpectralHash_threshold_type_get(swigCPtr, this));
  }

  public void setTrained(FloatVector value) {
    swigfaissJNI.IndexIVFSpectralHash_trained_set(swigCPtr, this, FloatVector.getCPtr(value), value);
  }

  public FloatVector getTrained() {
    long cPtr = swigfaissJNI.IndexIVFSpectralHash_trained_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FloatVector(cPtr, false);
  }

  public IndexIVFSpectralHash(Index quantizer, long d, long nlist, int nbit, float period) {
    this(swigfaissJNI.new_IndexIVFSpectralHash__SWIG_0(Index.getCPtr(quantizer), quantizer, d, nlist, nbit, period), true);
  }

  public IndexIVFSpectralHash() {
    this(swigfaissJNI.new_IndexIVFSpectralHash__SWIG_1(), true);
  }

  public void train_residual(long n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexIVFSpectralHash_train_residual(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void encode_vectors(long n, SWIGTYPE_p_float x, SWIGTYPE_p_long_long list_nos, SWIGTYPE_p_unsigned_char codes) {
    swigfaissJNI.IndexIVFSpectralHash_encode_vectors(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_long_long.getCPtr(list_nos), SWIGTYPE_p_unsigned_char.getCPtr(codes));
  }

  public SWIGTYPE_p_faiss__InvertedListScanner get_InvertedListScanner(boolean store_pairs) {
    long cPtr = swigfaissJNI.IndexIVFSpectralHash_get_InvertedListScanner(swigCPtr, this, store_pairs);
    return (cPtr == 0) ? null : new SWIGTYPE_p_faiss__InvertedListScanner(cPtr, false);
  }

  public final static class ThresholdType {
    public final static IndexIVFSpectralHash.ThresholdType Thresh_global = new IndexIVFSpectralHash.ThresholdType("Thresh_global");
    public final static IndexIVFSpectralHash.ThresholdType Thresh_centroid = new IndexIVFSpectralHash.ThresholdType("Thresh_centroid");
    public final static IndexIVFSpectralHash.ThresholdType Thresh_centroid_half = new IndexIVFSpectralHash.ThresholdType("Thresh_centroid_half");
    public final static IndexIVFSpectralHash.ThresholdType Thresh_median = new IndexIVFSpectralHash.ThresholdType("Thresh_median");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ThresholdType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ThresholdType.class + " with value " + swigValue);
    }

    private ThresholdType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ThresholdType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ThresholdType(String swigName, ThresholdType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ThresholdType[] swigValues = { Thresh_global, Thresh_centroid, Thresh_centroid_half, Thresh_median };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
