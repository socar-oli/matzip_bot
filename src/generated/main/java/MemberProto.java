// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Member.proto

public final class MemberProto {
  private MemberProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MemberDto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MemberDto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RestaurantList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RestaurantList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Member.proto\"L\n\tMemberDto\022\n\n\002id\030\001 \001(\t\022" +
      "\020\n\010nickname\030\002 \001(\t\022!\n\010foodList\030\003 \001(\0132\017.Re" +
      "staurantList\"\036\n\016RestaurantList\022\014\n\004food\030\001" +
      " \003(\tB\017B\013MemberProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MemberDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MemberDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MemberDto_descriptor,
        new java.lang.String[] { "Id", "Nickname", "FoodList", });
    internal_static_RestaurantList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RestaurantList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RestaurantList_descriptor,
        new java.lang.String[] { "Food", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}