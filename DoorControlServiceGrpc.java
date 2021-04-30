package grpc.caihts.doorcontrol;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Door.proto")
public final class DoorControlServiceGrpc {

  private DoorControlServiceGrpc() {}

  public static final String SERVICE_NAME = "doorcontrol.DoorControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest,
      grpc.caihts.doorcontrol.DoorControlResponse> getReverseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reverse",
      requestType = grpc.caihts.doorcontrol.DoorControlRequest.class,
      responseType = grpc.caihts.doorcontrol.DoorControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest,
      grpc.caihts.doorcontrol.DoorControlResponse> getReverseMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest, grpc.caihts.doorcontrol.DoorControlResponse> getReverseMethod;
    if ((getReverseMethod = DoorControlServiceGrpc.getReverseMethod) == null) {
      synchronized (DoorControlServiceGrpc.class) {
        if ((getReverseMethod = DoorControlServiceGrpc.getReverseMethod) == null) {
          DoorControlServiceGrpc.getReverseMethod = getReverseMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.doorcontrol.DoorControlRequest, grpc.caihts.doorcontrol.DoorControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "doorcontrol.DoorControlService", "reverse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.doorcontrol.DoorControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.doorcontrol.DoorControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DoorControlServiceMethodDescriptorSupplier("reverse"))
                  .build();
          }
        }
     }
     return getReverseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.Message,
      grpc.caihts.doorcontrol.Empty> getEmptyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empty",
      requestType = grpc.caihts.doorcontrol.Message.class,
      responseType = grpc.caihts.doorcontrol.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.Message,
      grpc.caihts.doorcontrol.Empty> getEmptyMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.Message, grpc.caihts.doorcontrol.Empty> getEmptyMethod;
    if ((getEmptyMethod = DoorControlServiceGrpc.getEmptyMethod) == null) {
      synchronized (DoorControlServiceGrpc.class) {
        if ((getEmptyMethod = DoorControlServiceGrpc.getEmptyMethod) == null) {
          DoorControlServiceGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.doorcontrol.Message, grpc.caihts.doorcontrol.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "doorcontrol.DoorControlService", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.doorcontrol.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.doorcontrol.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DoorControlServiceMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest,
      grpc.caihts.doorcontrol.DoorControlResponse> getReverseStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reverseStream",
      requestType = grpc.caihts.doorcontrol.DoorControlRequest.class,
      responseType = grpc.caihts.doorcontrol.DoorControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest,
      grpc.caihts.doorcontrol.DoorControlResponse> getReverseStreamMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest, grpc.caihts.doorcontrol.DoorControlResponse> getReverseStreamMethod;
    if ((getReverseStreamMethod = DoorControlServiceGrpc.getReverseStreamMethod) == null) {
      synchronized (DoorControlServiceGrpc.class) {
        if ((getReverseStreamMethod = DoorControlServiceGrpc.getReverseStreamMethod) == null) {
          DoorControlServiceGrpc.getReverseStreamMethod = getReverseStreamMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.doorcontrol.DoorControlRequest, grpc.caihts.doorcontrol.DoorControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "doorcontrol.DoorControlService", "reverseStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.doorcontrol.DoorControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.doorcontrol.DoorControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DoorControlServiceMethodDescriptorSupplier("reverseStream"))
                  .build();
          }
        }
     }
     return getReverseStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest,
      grpc.caihts.doorcontrol.LengthResponse> getLengthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "length",
      requestType = grpc.caihts.doorcontrol.DoorControlRequest.class,
      responseType = grpc.caihts.doorcontrol.LengthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest,
      grpc.caihts.doorcontrol.LengthResponse> getLengthMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest, grpc.caihts.doorcontrol.LengthResponse> getLengthMethod;
    if ((getLengthMethod = DoorControlServiceGrpc.getLengthMethod) == null) {
      synchronized (DoorControlServiceGrpc.class) {
        if ((getLengthMethod = DoorControlServiceGrpc.getLengthMethod) == null) {
          DoorControlServiceGrpc.getLengthMethod = getLengthMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.doorcontrol.DoorControlRequest, grpc.caihts.doorcontrol.LengthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "doorcontrol.DoorControlService", "length"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.doorcontrol.DoorControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.doorcontrol.LengthResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DoorControlServiceMethodDescriptorSupplier("length"))
                  .build();
          }
        }
     }
     return getLengthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest,
      grpc.caihts.doorcontrol.DoorControlResponse> getSplitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "split",
      requestType = grpc.caihts.doorcontrol.DoorControlRequest.class,
      responseType = grpc.caihts.doorcontrol.DoorControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest,
      grpc.caihts.doorcontrol.DoorControlResponse> getSplitMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.doorcontrol.DoorControlRequest, grpc.caihts.doorcontrol.DoorControlResponse> getSplitMethod;
    if ((getSplitMethod = DoorControlServiceGrpc.getSplitMethod) == null) {
      synchronized (DoorControlServiceGrpc.class) {
        if ((getSplitMethod = DoorControlServiceGrpc.getSplitMethod) == null) {
          DoorControlServiceGrpc.getSplitMethod = getSplitMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.doorcontrol.DoorControlRequest, grpc.caihts.doorcontrol.DoorControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "doorcontrol.DoorControlService", "split"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.doorcontrol.DoorControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.doorcontrol.DoorControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DoorControlServiceMethodDescriptorSupplier("split"))
                  .build();
          }
        }
     }
     return getSplitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DoorControlServiceStub newStub(io.grpc.Channel channel) {
    return new DoorControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DoorControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DoorControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DoorControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DoorControlServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class DoorControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary, request and response - FOR THIS EXAMPLE, THIS PART OF THE CODE WON'T BE USED 
     * </pre>
     */
    public void reverse(grpc.caihts.doorcontrol.DoorControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReverseMethod(), responseObserver);
    }

    /**
     */
    public void empty(grpc.caihts.doorcontrol.Message request,
        io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyMethod(), responseObserver);
    }

    /**
     * <pre>
     *bi directional streaming where there is a constant exchange of information
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlRequest> reverseStream(
        io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getReverseStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming, client streams many requests and get one response - FOR THIS EXAMPLE, THIS PART OF THE CODE WON'T BE USED 
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlRequest> length(
        io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.LengthResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLengthMethod(), responseObserver);
    }

    /**
     * <pre>
     *server stream, client request and server streams many responses... - FOR THIS EXAMPLE, THIS PART OF THE CODE WON'T BE USED 
     * </pre>
     */
    public void split(grpc.caihts.doorcontrol.DoorControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSplitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReverseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.caihts.doorcontrol.DoorControlRequest,
                grpc.caihts.doorcontrol.DoorControlResponse>(
                  this, METHODID_REVERSE)))
          .addMethod(
            getEmptyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.caihts.doorcontrol.Message,
                grpc.caihts.doorcontrol.Empty>(
                  this, METHODID_EMPTY)))
          .addMethod(
            getReverseStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.caihts.doorcontrol.DoorControlRequest,
                grpc.caihts.doorcontrol.DoorControlResponse>(
                  this, METHODID_REVERSE_STREAM)))
          .addMethod(
            getLengthMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.caihts.doorcontrol.DoorControlRequest,
                grpc.caihts.doorcontrol.LengthResponse>(
                  this, METHODID_LENGTH)))
          .addMethod(
            getSplitMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.caihts.doorcontrol.DoorControlRequest,
                grpc.caihts.doorcontrol.DoorControlResponse>(
                  this, METHODID_SPLIT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class DoorControlServiceStub extends io.grpc.stub.AbstractStub<DoorControlServiceStub> {
    private DoorControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoorControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoorControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoorControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary, request and response - FOR THIS EXAMPLE, THIS PART OF THE CODE WON'T BE USED 
     * </pre>
     */
    public void reverse(grpc.caihts.doorcontrol.DoorControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReverseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void empty(grpc.caihts.doorcontrol.Message request,
        io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *bi directional streaming where there is a constant exchange of information
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlRequest> reverseStream(
        io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getReverseStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *client streaming, client streams many requests and get one response - FOR THIS EXAMPLE, THIS PART OF THE CODE WON'T BE USED 
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlRequest> length(
        io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.LengthResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLengthMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *server stream, client request and server streams many responses... - FOR THIS EXAMPLE, THIS PART OF THE CODE WON'T BE USED 
     * </pre>
     */
    public void split(grpc.caihts.doorcontrol.DoorControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSplitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class DoorControlServiceBlockingStub extends io.grpc.stub.AbstractStub<DoorControlServiceBlockingStub> {
    private DoorControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoorControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoorControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoorControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary, request and response - FOR THIS EXAMPLE, THIS PART OF THE CODE WON'T BE USED 
     * </pre>
     */
    public grpc.caihts.doorcontrol.DoorControlResponse reverse(grpc.caihts.doorcontrol.DoorControlRequest request) {
      return blockingUnaryCall(
          getChannel(), getReverseMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.caihts.doorcontrol.Empty empty(grpc.caihts.doorcontrol.Message request) {
      return blockingUnaryCall(
          getChannel(), getEmptyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server stream, client request and server streams many responses... - FOR THIS EXAMPLE, THIS PART OF THE CODE WON'T BE USED 
     * </pre>
     */
    public java.util.Iterator<grpc.caihts.doorcontrol.DoorControlResponse> split(
        grpc.caihts.doorcontrol.DoorControlRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSplitMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class DoorControlServiceFutureStub extends io.grpc.stub.AbstractStub<DoorControlServiceFutureStub> {
    private DoorControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoorControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoorControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoorControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary, request and response - FOR THIS EXAMPLE, THIS PART OF THE CODE WON'T BE USED 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.caihts.doorcontrol.DoorControlResponse> reverse(
        grpc.caihts.doorcontrol.DoorControlRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReverseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.caihts.doorcontrol.Empty> empty(
        grpc.caihts.doorcontrol.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REVERSE = 0;
  private static final int METHODID_EMPTY = 1;
  private static final int METHODID_SPLIT = 2;
  private static final int METHODID_REVERSE_STREAM = 3;
  private static final int METHODID_LENGTH = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DoorControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DoorControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REVERSE:
          serviceImpl.reverse((grpc.caihts.doorcontrol.DoorControlRequest) request,
              (io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlResponse>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((grpc.caihts.doorcontrol.Message) request,
              (io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.Empty>) responseObserver);
          break;
        case METHODID_SPLIT:
          serviceImpl.split((grpc.caihts.doorcontrol.DoorControlRequest) request,
              (io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REVERSE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.reverseStream(
              (io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.DoorControlResponse>) responseObserver);
        case METHODID_LENGTH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.length(
              (io.grpc.stub.StreamObserver<grpc.caihts.doorcontrol.LengthResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DoorControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DoorControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.caihts.doorcontrol.DoorControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DoorControlService");
    }
  }

  private static final class DoorControlServiceFileDescriptorSupplier
      extends DoorControlServiceBaseDescriptorSupplier {
    DoorControlServiceFileDescriptorSupplier() {}
  }

  private static final class DoorControlServiceMethodDescriptorSupplier
      extends DoorControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DoorControlServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DoorControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DoorControlServiceFileDescriptorSupplier())
              .addMethod(getReverseMethod())
              .addMethod(getEmptyMethod())
              .addMethod(getReverseStreamMethod())
              .addMethod(getLengthMethod())
              .addMethod(getSplitMethod())
              .build();
        }
      }
    }
    return result;
  }
}
