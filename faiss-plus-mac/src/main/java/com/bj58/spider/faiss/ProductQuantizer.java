/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.bj58.spider.faiss;

public class ProductQuantizer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ProductQuantizer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProductQuantizer obj) {
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
        swigfaissJNI.delete_ProductQuantizer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setD(long value) {
    swigfaissJNI.ProductQuantizer_d_set(swigCPtr, this, value);
  }

  public long getD() {
    return swigfaissJNI.ProductQuantizer_d_get(swigCPtr, this);
  }

  public void setM(long value) {
    swigfaissJNI.ProductQuantizer_M_set(swigCPtr, this, value);
  }

  public long getM() {
    return swigfaissJNI.ProductQuantizer_M_get(swigCPtr, this);
  }

  public void setNbits(long value) {
    swigfaissJNI.ProductQuantizer_nbits_set(swigCPtr, this, value);
  }

  public long getNbits() {
    return swigfaissJNI.ProductQuantizer_nbits_get(swigCPtr, this);
  }

  public void setDsub(long value) {
    swigfaissJNI.ProductQuantizer_dsub_set(swigCPtr, this, value);
  }

  public long getDsub() {
    return swigfaissJNI.ProductQuantizer_dsub_get(swigCPtr, this);
  }

  public void setCode_size(long value) {
    swigfaissJNI.ProductQuantizer_code_size_set(swigCPtr, this, value);
  }

  public long getCode_size() {
    return swigfaissJNI.ProductQuantizer_code_size_get(swigCPtr, this);
  }

  public void setKsub(long value) {
    swigfaissJNI.ProductQuantizer_ksub_set(swigCPtr, this, value);
  }

  public long getKsub() {
    return swigfaissJNI.ProductQuantizer_ksub_get(swigCPtr, this);
  }

  public void setVerbose(boolean value) {
    swigfaissJNI.ProductQuantizer_verbose_set(swigCPtr, this, value);
  }

  public boolean getVerbose() {
    return swigfaissJNI.ProductQuantizer_verbose_get(swigCPtr, this);
  }

  public void setTrain_type(ProductQuantizer.train_type_t value) {
    swigfaissJNI.ProductQuantizer_train_type_set(swigCPtr, this, value.swigValue());
  }

  public ProductQuantizer.train_type_t getTrain_type() {
    return ProductQuantizer.train_type_t.swigToEnum(swigfaissJNI.ProductQuantizer_train_type_get(swigCPtr, this));
  }

  public void setCp(ClusteringParameters value) {
    swigfaissJNI.ProductQuantizer_cp_set(swigCPtr, this, ClusteringParameters.getCPtr(value), value);
  }

  public ClusteringParameters getCp() {
    long cPtr = swigfaissJNI.ProductQuantizer_cp_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ClusteringParameters(cPtr, false);
  }

  public void setAssign_index(Index value) {
    swigfaissJNI.ProductQuantizer_assign_index_set(swigCPtr, this, Index.getCPtr(value), value);
  }

  public Index getAssign_index() {
    long cPtr = swigfaissJNI.ProductQuantizer_assign_index_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Index(cPtr, false);
  }

  public void setCentroids(FloatVector value) {
    swigfaissJNI.ProductQuantizer_centroids_set(swigCPtr, this, FloatVector.getCPtr(value), value);
  }

  public FloatVector getCentroids() {
    long cPtr = swigfaissJNI.ProductQuantizer_centroids_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FloatVector(cPtr, false);
  }

  public SWIGTYPE_p_float get_centroids(long m, long i) {
    long cPtr = swigfaissJNI.ProductQuantizer_get_centroids(swigCPtr, this, m, i);
    return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
  }

  public void train(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.ProductQuantizer_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public ProductQuantizer(long d, long M, long nbits) {
    this(swigfaissJNI.new_ProductQuantizer__SWIG_0(d, M, nbits), true);
  }

  public ProductQuantizer() {
    this(swigfaissJNI.new_ProductQuantizer__SWIG_1(), true);
  }

  public void set_derived_values() {
    swigfaissJNI.ProductQuantizer_set_derived_values(swigCPtr, this);
  }

  public void set_params(SWIGTYPE_p_float centroids, int m) {
    swigfaissJNI.ProductQuantizer_set_params(swigCPtr, this, SWIGTYPE_p_float.getCPtr(centroids), m);
  }

  public void compute_code(SWIGTYPE_p_float x, SWIGTYPE_p_unsigned_char code) {
    swigfaissJNI.ProductQuantizer_compute_code(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_unsigned_char.getCPtr(code));
  }

  public void compute_codes(SWIGTYPE_p_float x, SWIGTYPE_p_unsigned_char codes, long n) {
    swigfaissJNI.ProductQuantizer_compute_codes(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_unsigned_char.getCPtr(codes), n);
  }

  public void compute_codes_with_assign_index(SWIGTYPE_p_float x, SWIGTYPE_p_unsigned_char codes, long n) {
    swigfaissJNI.ProductQuantizer_compute_codes_with_assign_index(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_unsigned_char.getCPtr(codes), n);
  }

  public void decode(SWIGTYPE_p_unsigned_char code, SWIGTYPE_p_float x) {
    swigfaissJNI.ProductQuantizer_decode__SWIG_0(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(code), SWIGTYPE_p_float.getCPtr(x));
  }

  public void decode(SWIGTYPE_p_unsigned_char code, SWIGTYPE_p_float x, long n) {
    swigfaissJNI.ProductQuantizer_decode__SWIG_1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(code), SWIGTYPE_p_float.getCPtr(x), n);
  }

  public void compute_code_from_distance_table(SWIGTYPE_p_float tab, SWIGTYPE_p_unsigned_char code) {
    swigfaissJNI.ProductQuantizer_compute_code_from_distance_table(swigCPtr, this, SWIGTYPE_p_float.getCPtr(tab), SWIGTYPE_p_unsigned_char.getCPtr(code));
  }

  public void compute_distance_table(SWIGTYPE_p_float x, SWIGTYPE_p_float dis_table) {
    swigfaissJNI.ProductQuantizer_compute_distance_table(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_float.getCPtr(dis_table));
  }

  public void compute_inner_prod_table(SWIGTYPE_p_float x, SWIGTYPE_p_float dis_table) {
    swigfaissJNI.ProductQuantizer_compute_inner_prod_table(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_float.getCPtr(dis_table));
  }

  public void compute_distance_tables(long nx, SWIGTYPE_p_float x, SWIGTYPE_p_float dis_tables) {
    swigfaissJNI.ProductQuantizer_compute_distance_tables(swigCPtr, this, nx, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_float.getCPtr(dis_tables));
  }

  public void compute_inner_prod_tables(long nx, SWIGTYPE_p_float x, SWIGTYPE_p_float dis_tables) {
    swigfaissJNI.ProductQuantizer_compute_inner_prod_tables(swigCPtr, this, nx, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_float.getCPtr(dis_tables));
  }

  public void search(SWIGTYPE_p_float x, long nx, SWIGTYPE_p_unsigned_char codes, long ncodes, float_maxheap_array_t res, boolean init_finalize_heap) {
    swigfaissJNI.ProductQuantizer_search__SWIG_0(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), nx, SWIGTYPE_p_unsigned_char.getCPtr(codes), ncodes, float_maxheap_array_t.getCPtr(res), res, init_finalize_heap);
  }

  public void search(SWIGTYPE_p_float x, long nx, SWIGTYPE_p_unsigned_char codes, long ncodes, float_maxheap_array_t res) {
    swigfaissJNI.ProductQuantizer_search__SWIG_1(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), nx, SWIGTYPE_p_unsigned_char.getCPtr(codes), ncodes, float_maxheap_array_t.getCPtr(res), res);
  }

  public void search_ip(SWIGTYPE_p_float x, long nx, SWIGTYPE_p_unsigned_char codes, long ncodes, float_minheap_array_t res, boolean init_finalize_heap) {
    swigfaissJNI.ProductQuantizer_search_ip__SWIG_0(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), nx, SWIGTYPE_p_unsigned_char.getCPtr(codes), ncodes, float_minheap_array_t.getCPtr(res), res, init_finalize_heap);
  }

  public void search_ip(SWIGTYPE_p_float x, long nx, SWIGTYPE_p_unsigned_char codes, long ncodes, float_minheap_array_t res) {
    swigfaissJNI.ProductQuantizer_search_ip__SWIG_1(swigCPtr, this, SWIGTYPE_p_float.getCPtr(x), nx, SWIGTYPE_p_unsigned_char.getCPtr(codes), ncodes, float_minheap_array_t.getCPtr(res), res);
  }

  public void setSdc_table(FloatVector value) {
    swigfaissJNI.ProductQuantizer_sdc_table_set(swigCPtr, this, FloatVector.getCPtr(value), value);
  }

  public FloatVector getSdc_table() {
    long cPtr = swigfaissJNI.ProductQuantizer_sdc_table_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FloatVector(cPtr, false);
  }

  public void compute_sdc_table() {
    swigfaissJNI.ProductQuantizer_compute_sdc_table(swigCPtr, this);
  }

  public void search_sdc(SWIGTYPE_p_unsigned_char qcodes, long nq, SWIGTYPE_p_unsigned_char bcodes, long ncodes, float_maxheap_array_t res, boolean init_finalize_heap) {
    swigfaissJNI.ProductQuantizer_search_sdc__SWIG_0(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(qcodes), nq, SWIGTYPE_p_unsigned_char.getCPtr(bcodes), ncodes, float_maxheap_array_t.getCPtr(res), res, init_finalize_heap);
  }

  public void search_sdc(SWIGTYPE_p_unsigned_char qcodes, long nq, SWIGTYPE_p_unsigned_char bcodes, long ncodes, float_maxheap_array_t res) {
    swigfaissJNI.ProductQuantizer_search_sdc__SWIG_1(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(qcodes), nq, SWIGTYPE_p_unsigned_char.getCPtr(bcodes), ncodes, float_maxheap_array_t.getCPtr(res), res);
  }

  static public class PQEncoderGeneric {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected PQEncoderGeneric(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(PQEncoderGeneric obj) {
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
          swigfaissJNI.delete_ProductQuantizer_PQEncoderGeneric(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setCode(SWIGTYPE_p_unsigned_char value) {
      swigfaissJNI.ProductQuantizer_PQEncoderGeneric_code_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
    }
  
    public SWIGTYPE_p_unsigned_char getCode() {
      long cPtr = swigfaissJNI.ProductQuantizer_PQEncoderGeneric_code_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
    }
  
    public void setOffset(short value) {
      swigfaissJNI.ProductQuantizer_PQEncoderGeneric_offset_set(swigCPtr, this, value);
    }
  
    public short getOffset() {
      return swigfaissJNI.ProductQuantizer_PQEncoderGeneric_offset_get(swigCPtr, this);
    }
  
    public int getNbits() {
      return swigfaissJNI.ProductQuantizer_PQEncoderGeneric_nbits_get(swigCPtr, this);
    }
  
    public void setReg(short value) {
      swigfaissJNI.ProductQuantizer_PQEncoderGeneric_reg_set(swigCPtr, this, value);
    }
  
    public short getReg() {
      return swigfaissJNI.ProductQuantizer_PQEncoderGeneric_reg_get(swigCPtr, this);
    }
  
    public PQEncoderGeneric(SWIGTYPE_p_unsigned_char code, int nbits, short offset) {
      this(swigfaissJNI.new_ProductQuantizer_PQEncoderGeneric__SWIG_0(SWIGTYPE_p_unsigned_char.getCPtr(code), nbits, offset), true);
    }
  
    public PQEncoderGeneric(SWIGTYPE_p_unsigned_char code, int nbits) {
      this(swigfaissJNI.new_ProductQuantizer_PQEncoderGeneric__SWIG_1(SWIGTYPE_p_unsigned_char.getCPtr(code), nbits), true);
    }
  
    public void encode(java.math.BigInteger x) {
      swigfaissJNI.ProductQuantizer_PQEncoderGeneric_encode(swigCPtr, this, x);
    }
  
  }

  static public class PQEncoder8 {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected PQEncoder8(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(PQEncoder8 obj) {
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
          swigfaissJNI.delete_ProductQuantizer_PQEncoder8(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setCode(SWIGTYPE_p_unsigned_char value) {
      swigfaissJNI.ProductQuantizer_PQEncoder8_code_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
    }
  
    public SWIGTYPE_p_unsigned_char getCode() {
      long cPtr = swigfaissJNI.ProductQuantizer_PQEncoder8_code_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
    }
  
    public PQEncoder8(SWIGTYPE_p_unsigned_char code, int nbits) {
      this(swigfaissJNI.new_ProductQuantizer_PQEncoder8(SWIGTYPE_p_unsigned_char.getCPtr(code), nbits), true);
    }
  
    public void encode(java.math.BigInteger x) {
      swigfaissJNI.ProductQuantizer_PQEncoder8_encode(swigCPtr, this, x);
    }
  
  }

  static public class PQEncoder16 {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected PQEncoder16(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(PQEncoder16 obj) {
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
          swigfaissJNI.delete_ProductQuantizer_PQEncoder16(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setCode(SWIGTYPE_p_unsigned_short value) {
      swigfaissJNI.ProductQuantizer_PQEncoder16_code_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
    }
  
    public SWIGTYPE_p_unsigned_short getCode() {
      long cPtr = swigfaissJNI.ProductQuantizer_PQEncoder16_code_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
    }
  
    public PQEncoder16(SWIGTYPE_p_unsigned_char code, int nbits) {
      this(swigfaissJNI.new_ProductQuantizer_PQEncoder16(SWIGTYPE_p_unsigned_char.getCPtr(code), nbits), true);
    }
  
    public void encode(java.math.BigInteger x) {
      swigfaissJNI.ProductQuantizer_PQEncoder16_encode(swigCPtr, this, x);
    }
  
  }

  static public class PQDecoderGeneric {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected PQDecoderGeneric(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(PQDecoderGeneric obj) {
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
          swigfaissJNI.delete_ProductQuantizer_PQDecoderGeneric(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setCode(SWIGTYPE_p_unsigned_char value) {
      swigfaissJNI.ProductQuantizer_PQDecoderGeneric_code_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
    }
  
    public SWIGTYPE_p_unsigned_char getCode() {
      long cPtr = swigfaissJNI.ProductQuantizer_PQDecoderGeneric_code_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
    }
  
    public void setOffset(short value) {
      swigfaissJNI.ProductQuantizer_PQDecoderGeneric_offset_set(swigCPtr, this, value);
    }
  
    public short getOffset() {
      return swigfaissJNI.ProductQuantizer_PQDecoderGeneric_offset_get(swigCPtr, this);
    }
  
    public int getNbits() {
      return swigfaissJNI.ProductQuantizer_PQDecoderGeneric_nbits_get(swigCPtr, this);
    }
  
    public java.math.BigInteger getMask() {
      return swigfaissJNI.ProductQuantizer_PQDecoderGeneric_mask_get(swigCPtr, this);
    }
  
    public void setReg(short value) {
      swigfaissJNI.ProductQuantizer_PQDecoderGeneric_reg_set(swigCPtr, this, value);
    }
  
    public short getReg() {
      return swigfaissJNI.ProductQuantizer_PQDecoderGeneric_reg_get(swigCPtr, this);
    }
  
    public PQDecoderGeneric(SWIGTYPE_p_unsigned_char code, int nbits) {
      this(swigfaissJNI.new_ProductQuantizer_PQDecoderGeneric(SWIGTYPE_p_unsigned_char.getCPtr(code), nbits), true);
    }
  
    public java.math.BigInteger decode() {
      return swigfaissJNI.ProductQuantizer_PQDecoderGeneric_decode(swigCPtr, this);
    }
  
  }

  static public class PQDecoder8 {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected PQDecoder8(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(PQDecoder8 obj) {
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
          swigfaissJNI.delete_ProductQuantizer_PQDecoder8(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setCode(SWIGTYPE_p_unsigned_char value) {
      swigfaissJNI.ProductQuantizer_PQDecoder8_code_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
    }
  
    public SWIGTYPE_p_unsigned_char getCode() {
      long cPtr = swigfaissJNI.ProductQuantizer_PQDecoder8_code_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
    }
  
    public PQDecoder8(SWIGTYPE_p_unsigned_char code, int nbits) {
      this(swigfaissJNI.new_ProductQuantizer_PQDecoder8(SWIGTYPE_p_unsigned_char.getCPtr(code), nbits), true);
    }
  
    public java.math.BigInteger decode() {
      return swigfaissJNI.ProductQuantizer_PQDecoder8_decode(swigCPtr, this);
    }
  
  }

  static public class PQDecoder16 {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected PQDecoder16(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(PQDecoder16 obj) {
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
          swigfaissJNI.delete_ProductQuantizer_PQDecoder16(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setCode(SWIGTYPE_p_unsigned_short value) {
      swigfaissJNI.ProductQuantizer_PQDecoder16_code_set(swigCPtr, this, SWIGTYPE_p_unsigned_short.getCPtr(value));
    }
  
    public SWIGTYPE_p_unsigned_short getCode() {
      long cPtr = swigfaissJNI.ProductQuantizer_PQDecoder16_code_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_short(cPtr, false);
    }
  
    public PQDecoder16(SWIGTYPE_p_unsigned_char code, int nbits) {
      this(swigfaissJNI.new_ProductQuantizer_PQDecoder16(SWIGTYPE_p_unsigned_char.getCPtr(code), nbits), true);
    }
  
    public java.math.BigInteger decode() {
      return swigfaissJNI.ProductQuantizer_PQDecoder16_decode(swigCPtr, this);
    }
  
  }

  public final static class train_type_t {
    public final static ProductQuantizer.train_type_t Train_default = new ProductQuantizer.train_type_t("Train_default");
    public final static ProductQuantizer.train_type_t Train_hot_start = new ProductQuantizer.train_type_t("Train_hot_start");
    public final static ProductQuantizer.train_type_t Train_shared = new ProductQuantizer.train_type_t("Train_shared");
    public final static ProductQuantizer.train_type_t Train_hypercube = new ProductQuantizer.train_type_t("Train_hypercube");
    public final static ProductQuantizer.train_type_t Train_hypercube_pca = new ProductQuantizer.train_type_t("Train_hypercube_pca");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static train_type_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + train_type_t.class + " with value " + swigValue);
    }

    private train_type_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private train_type_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private train_type_t(String swigName, train_type_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static train_type_t[] swigValues = { Train_default, Train_hot_start, Train_shared, Train_hypercube, Train_hypercube_pca };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
