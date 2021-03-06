// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TempSmart.proto

package grpc.caihts.temperaturecontrol;

public final class TemperatureControlServiceImpl {
  private TemperatureControlServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperaturecontrol_LengthResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperaturecontrol_LengthResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperaturecontrol_ReplaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperaturecontrol_ReplaceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperaturecontrol_TemperatureControlRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperaturecontrol_TemperatureControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperaturecontrol_MultiTemperatureControlRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperaturecontrol_MultiTemperatureControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperaturecontrol_MultiMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperaturecontrol_MultiMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperaturecontrol_TemperatureControlResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperaturecontrol_TemperatureControlResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperaturecontrol_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperaturecontrol_Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_temperaturecontrol_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_temperaturecontrol_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017TempSmart.proto\022\022temperaturecontrol\" \n" +
      "\016LengthResponse\022\016\n\006length\030\001 \001(\005\",\n\016Repla" +
      "ceRequest\022\014\n\004text\030\001 \001(\t\022\014\n\004char\030\002 \001(\t\"(\n" +
      "\031TemperatureControlRequest\022\013\n\003val\030\001 \001(\t\"" +
      ".\n\036MultiTemperatureControlRequest\022\014\n\004tex" +
      "t\030\001 \003(\t\"Z\n\023MultiMessageRequest\022C\n\014multir" +
      "equest\030\001 \003(\0132-.temperaturecontrol.Temper" +
      "atureControlRequest\")\n\032TemperatureContro" +
      "lResponse\022\013\n\003val\030\001 \001(\t\"c\n\007Message\0220\n\006det" +
      "ail\030\001 \001(\0162 .temperaturecontrol.Message.E" +
      "num\"&\n\004Enum\022\013\n\007UNKNOWN\020\000\022\007\n\003LOW\020\001\022\010\n\004HIG" +
      "H\020\002\"\007\n\005Empty2\211\004\n\031TemperatureControlServi" +
      "ce\022j\n\007reverse\022-.temperaturecontrol.Tempe" +
      "ratureControlRequest\032..temperaturecontro" +
      "l.TemperatureControlResponse\"\000\022A\n\005empty\022" +
      "\033.temperaturecontrol.Message\032\031.temperatu" +
      "recontrol.Empty\"\000\022t\n\rreverseStream\022-.tem" +
      "peraturecontrol.TemperatureControlReques" +
      "t\032..temperaturecontrol.TemperatureContro" +
      "lResponse\"\000(\0010\001\022]\n\006length\022-.temperaturec" +
      "ontrol.TemperatureControlRequest\032\".tempe" +
      "raturecontrol.LengthResponse(\001\022h\n\005split\022" +
      "-.temperaturecontrol.TemperatureControlR" +
      "equest\032..temperaturecontrol.TemperatureC" +
      "ontrolResponse0\001BA\n\036grpc.caihts.temperat" +
      "urecontrolB\035TemperatureControlServiceImp" +
      "lP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_temperaturecontrol_LengthResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_temperaturecontrol_LengthResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperaturecontrol_LengthResponse_descriptor,
        new java.lang.String[] { "Length", });
    internal_static_temperaturecontrol_ReplaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_temperaturecontrol_ReplaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperaturecontrol_ReplaceRequest_descriptor,
        new java.lang.String[] { "Text", "Char", });
    internal_static_temperaturecontrol_TemperatureControlRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_temperaturecontrol_TemperatureControlRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperaturecontrol_TemperatureControlRequest_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_temperaturecontrol_MultiTemperatureControlRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_temperaturecontrol_MultiTemperatureControlRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperaturecontrol_MultiTemperatureControlRequest_descriptor,
        new java.lang.String[] { "Text", });
    internal_static_temperaturecontrol_MultiMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_temperaturecontrol_MultiMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperaturecontrol_MultiMessageRequest_descriptor,
        new java.lang.String[] { "Multirequest", });
    internal_static_temperaturecontrol_TemperatureControlResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_temperaturecontrol_TemperatureControlResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperaturecontrol_TemperatureControlResponse_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_temperaturecontrol_Message_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_temperaturecontrol_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperaturecontrol_Message_descriptor,
        new java.lang.String[] { "Detail", });
    internal_static_temperaturecontrol_Empty_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_temperaturecontrol_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_temperaturecontrol_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
