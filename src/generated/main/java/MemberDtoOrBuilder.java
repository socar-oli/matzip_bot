// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Member.proto

public interface MemberDtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MemberDto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string nickname = 2;</code>
   * @return The nickname.
   */
  java.lang.String getNickname();
  /**
   * <code>string nickname = 2;</code>
   * @return The bytes for nickname.
   */
  com.google.protobuf.ByteString
      getNicknameBytes();

  /**
   * <code>.RestaurantList foodList = 3;</code>
   * @return Whether the foodList field is set.
   */
  boolean hasFoodList();
  /**
   * <code>.RestaurantList foodList = 3;</code>
   * @return The foodList.
   */
  RestaurantList getFoodList();
  /**
   * <code>.RestaurantList foodList = 3;</code>
   */
  RestaurantListOrBuilder getFoodListOrBuilder();
}
