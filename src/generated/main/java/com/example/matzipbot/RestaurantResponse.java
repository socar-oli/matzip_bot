// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: restaurant.proto

package com.example.matzipbot;

/**
 * Protobuf type {@code com.example.matzipbot.RestaurantResponse}
 */
public final class RestaurantResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.matzipbot.RestaurantResponse)
    RestaurantResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RestaurantResponse.newBuilder() to construct.
  private RestaurantResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RestaurantResponse() {
    name_ = "";
    category_ = "";
    location_ = "";
    link_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RestaurantResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RestaurantResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            category_ = s;
            break;
          }
          case 29: {

            totalRating_ = input.readFloat();
            break;
          }
          case 37: {

            priceRating_ = input.readFloat();
            break;
          }
          case 40: {

            numberOfEvaluationStaff_ = input.readInt32();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            location_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            link_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.matzipbot.RestaurantProtos.internal_static_com_example_matzipbot_RestaurantResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.matzipbot.RestaurantProtos.internal_static_com_example_matzipbot_RestaurantResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.matzipbot.RestaurantResponse.class, com.example.matzipbot.RestaurantResponse.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CATEGORY_FIELD_NUMBER = 2;
  private volatile java.lang.Object category_;
  /**
   * <code>string category = 2;</code>
   * @return The category.
   */
  @java.lang.Override
  public java.lang.String getCategory() {
    java.lang.Object ref = category_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      category_ = s;
      return s;
    }
  }
  /**
   * <code>string category = 2;</code>
   * @return The bytes for category.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCategoryBytes() {
    java.lang.Object ref = category_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      category_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_RATING_FIELD_NUMBER = 3;
  private float totalRating_;
  /**
   * <code>float total_rating = 3;</code>
   * @return The totalRating.
   */
  @java.lang.Override
  public float getTotalRating() {
    return totalRating_;
  }

  public static final int PRICE_RATING_FIELD_NUMBER = 4;
  private float priceRating_;
  /**
   * <code>float price_rating = 4;</code>
   * @return The priceRating.
   */
  @java.lang.Override
  public float getPriceRating() {
    return priceRating_;
  }

  public static final int NUMBEROFEVALUATIONSTAFF_FIELD_NUMBER = 5;
  private int numberOfEvaluationStaff_;
  /**
   * <code>int32 numberOfEvaluationStaff = 5;</code>
   * @return The numberOfEvaluationStaff.
   */
  @java.lang.Override
  public int getNumberOfEvaluationStaff() {
    return numberOfEvaluationStaff_;
  }

  public static final int LOCATION_FIELD_NUMBER = 6;
  private volatile java.lang.Object location_;
  /**
   * <code>string location = 6;</code>
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <code>string location = 6;</code>
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LINK_FIELD_NUMBER = 7;
  private volatile java.lang.Object link_;
  /**
   * <code>string link = 7;</code>
   * @return The link.
   */
  @java.lang.Override
  public java.lang.String getLink() {
    java.lang.Object ref = link_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      link_ = s;
      return s;
    }
  }
  /**
   * <code>string link = 7;</code>
   * @return The bytes for link.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLinkBytes() {
    java.lang.Object ref = link_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      link_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(category_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, category_);
    }
    if (java.lang.Float.floatToRawIntBits(totalRating_) != 0) {
      output.writeFloat(3, totalRating_);
    }
    if (java.lang.Float.floatToRawIntBits(priceRating_) != 0) {
      output.writeFloat(4, priceRating_);
    }
    if (numberOfEvaluationStaff_ != 0) {
      output.writeInt32(5, numberOfEvaluationStaff_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, location_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(link_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, link_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(category_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, category_);
    }
    if (java.lang.Float.floatToRawIntBits(totalRating_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, totalRating_);
    }
    if (java.lang.Float.floatToRawIntBits(priceRating_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, priceRating_);
    }
    if (numberOfEvaluationStaff_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, numberOfEvaluationStaff_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, location_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(link_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, link_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.matzipbot.RestaurantResponse)) {
      return super.equals(obj);
    }
    com.example.matzipbot.RestaurantResponse other = (com.example.matzipbot.RestaurantResponse) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getCategory()
        .equals(other.getCategory())) return false;
    if (java.lang.Float.floatToIntBits(getTotalRating())
        != java.lang.Float.floatToIntBits(
            other.getTotalRating())) return false;
    if (java.lang.Float.floatToIntBits(getPriceRating())
        != java.lang.Float.floatToIntBits(
            other.getPriceRating())) return false;
    if (getNumberOfEvaluationStaff()
        != other.getNumberOfEvaluationStaff()) return false;
    if (!getLocation()
        .equals(other.getLocation())) return false;
    if (!getLink()
        .equals(other.getLink())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
    hash = (53 * hash) + getCategory().hashCode();
    hash = (37 * hash) + TOTAL_RATING_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getTotalRating());
    hash = (37 * hash) + PRICE_RATING_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPriceRating());
    hash = (37 * hash) + NUMBEROFEVALUATIONSTAFF_FIELD_NUMBER;
    hash = (53 * hash) + getNumberOfEvaluationStaff();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + LINK_FIELD_NUMBER;
    hash = (53 * hash) + getLink().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.matzipbot.RestaurantResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.matzipbot.RestaurantResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.matzipbot.RestaurantResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.matzipbot.RestaurantResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.matzipbot.RestaurantResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.matzipbot.RestaurantResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.matzipbot.RestaurantResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.matzipbot.RestaurantResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.matzipbot.RestaurantResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.matzipbot.RestaurantResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.matzipbot.RestaurantResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.matzipbot.RestaurantResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.matzipbot.RestaurantResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.example.matzipbot.RestaurantResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.matzipbot.RestaurantResponse)
      com.example.matzipbot.RestaurantResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.matzipbot.RestaurantProtos.internal_static_com_example_matzipbot_RestaurantResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.matzipbot.RestaurantProtos.internal_static_com_example_matzipbot_RestaurantResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.matzipbot.RestaurantResponse.class, com.example.matzipbot.RestaurantResponse.Builder.class);
    }

    // Construct using com.example.matzipbot.RestaurantResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      category_ = "";

      totalRating_ = 0F;

      priceRating_ = 0F;

      numberOfEvaluationStaff_ = 0;

      location_ = "";

      link_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.matzipbot.RestaurantProtos.internal_static_com_example_matzipbot_RestaurantResponse_descriptor;
    }

    @java.lang.Override
    public com.example.matzipbot.RestaurantResponse getDefaultInstanceForType() {
      return com.example.matzipbot.RestaurantResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.matzipbot.RestaurantResponse build() {
      com.example.matzipbot.RestaurantResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.matzipbot.RestaurantResponse buildPartial() {
      com.example.matzipbot.RestaurantResponse result = new com.example.matzipbot.RestaurantResponse(this);
      result.name_ = name_;
      result.category_ = category_;
      result.totalRating_ = totalRating_;
      result.priceRating_ = priceRating_;
      result.numberOfEvaluationStaff_ = numberOfEvaluationStaff_;
      result.location_ = location_;
      result.link_ = link_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.matzipbot.RestaurantResponse) {
        return mergeFrom((com.example.matzipbot.RestaurantResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.matzipbot.RestaurantResponse other) {
      if (other == com.example.matzipbot.RestaurantResponse.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getCategory().isEmpty()) {
        category_ = other.category_;
        onChanged();
      }
      if (other.getTotalRating() != 0F) {
        setTotalRating(other.getTotalRating());
      }
      if (other.getPriceRating() != 0F) {
        setPriceRating(other.getPriceRating());
      }
      if (other.getNumberOfEvaluationStaff() != 0) {
        setNumberOfEvaluationStaff(other.getNumberOfEvaluationStaff());
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (!other.getLink().isEmpty()) {
        link_ = other.link_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.matzipbot.RestaurantResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.matzipbot.RestaurantResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object category_ = "";
    /**
     * <code>string category = 2;</code>
     * @return The category.
     */
    public java.lang.String getCategory() {
      java.lang.Object ref = category_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        category_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string category = 2;</code>
     * @return The bytes for category.
     */
    public com.google.protobuf.ByteString
        getCategoryBytes() {
      java.lang.Object ref = category_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        category_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string category = 2;</code>
     * @param value The category to set.
     * @return This builder for chaining.
     */
    public Builder setCategory(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      category_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string category = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCategory() {
      
      category_ = getDefaultInstance().getCategory();
      onChanged();
      return this;
    }
    /**
     * <code>string category = 2;</code>
     * @param value The bytes for category to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      category_ = value;
      onChanged();
      return this;
    }

    private float totalRating_ ;
    /**
     * <code>float total_rating = 3;</code>
     * @return The totalRating.
     */
    @java.lang.Override
    public float getTotalRating() {
      return totalRating_;
    }
    /**
     * <code>float total_rating = 3;</code>
     * @param value The totalRating to set.
     * @return This builder for chaining.
     */
    public Builder setTotalRating(float value) {
      
      totalRating_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float total_rating = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalRating() {
      
      totalRating_ = 0F;
      onChanged();
      return this;
    }

    private float priceRating_ ;
    /**
     * <code>float price_rating = 4;</code>
     * @return The priceRating.
     */
    @java.lang.Override
    public float getPriceRating() {
      return priceRating_;
    }
    /**
     * <code>float price_rating = 4;</code>
     * @param value The priceRating to set.
     * @return This builder for chaining.
     */
    public Builder setPriceRating(float value) {
      
      priceRating_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float price_rating = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPriceRating() {
      
      priceRating_ = 0F;
      onChanged();
      return this;
    }

    private int numberOfEvaluationStaff_ ;
    /**
     * <code>int32 numberOfEvaluationStaff = 5;</code>
     * @return The numberOfEvaluationStaff.
     */
    @java.lang.Override
    public int getNumberOfEvaluationStaff() {
      return numberOfEvaluationStaff_;
    }
    /**
     * <code>int32 numberOfEvaluationStaff = 5;</code>
     * @param value The numberOfEvaluationStaff to set.
     * @return This builder for chaining.
     */
    public Builder setNumberOfEvaluationStaff(int value) {
      
      numberOfEvaluationStaff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 numberOfEvaluationStaff = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumberOfEvaluationStaff() {
      
      numberOfEvaluationStaff_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <code>string location = 6;</code>
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location = 6;</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location = 6;</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string location = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <code>string location = 6;</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object link_ = "";
    /**
     * <code>string link = 7;</code>
     * @return The link.
     */
    public java.lang.String getLink() {
      java.lang.Object ref = link_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        link_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string link = 7;</code>
     * @return The bytes for link.
     */
    public com.google.protobuf.ByteString
        getLinkBytes() {
      java.lang.Object ref = link_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        link_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string link = 7;</code>
     * @param value The link to set.
     * @return This builder for chaining.
     */
    public Builder setLink(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      link_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string link = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearLink() {
      
      link_ = getDefaultInstance().getLink();
      onChanged();
      return this;
    }
    /**
     * <code>string link = 7;</code>
     * @param value The bytes for link to set.
     * @return This builder for chaining.
     */
    public Builder setLinkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      link_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.matzipbot.RestaurantResponse)
  }

  // @@protoc_insertion_point(class_scope:com.example.matzipbot.RestaurantResponse)
  private static final com.example.matzipbot.RestaurantResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.matzipbot.RestaurantResponse();
  }

  public static com.example.matzipbot.RestaurantResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestaurantResponse>
      PARSER = new com.google.protobuf.AbstractParser<RestaurantResponse>() {
    @java.lang.Override
    public RestaurantResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RestaurantResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RestaurantResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestaurantResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.matzipbot.RestaurantResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

