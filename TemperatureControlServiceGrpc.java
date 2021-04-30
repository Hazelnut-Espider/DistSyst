package grpc.caihts.temperaturecontrol;

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
    comments = "Source: TempSmart.proto")
public final class TemperatureControlServiceGrpc {

  private TemperatureControlServiceGrpc() {}

  public static final String SERVICE_NAME = "temperaturecontrol.TemperatureControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest,
      grpc.caihts.temperaturecontrol.TemperatureControlResponse> getReverseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reverse",
      requestType = grpc.caihts.temperaturecontrol.TemperatureControlRequest.class,
      responseType = grpc.caihts.temperaturecontrol.TemperatureControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest,
      grpc.caihts.temperaturecontrol.TemperatureControlResponse> getReverseMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest, grpc.caihts.temperaturecontrol.TemperatureControlResponse> getReverseMethod;
    if ((getReverseMethod = TemperatureControlServiceGrpc.getReverseMethod) == null) {
      synchronized (TemperatureControlServiceGrpc.class) {
        if ((getReverseMethod = TemperatureControlServiceGrpc.getReverseMethod) == null) {
          TemperatureControlServiceGrpc.getReverseMethod = getReverseMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.temperaturecontrol.TemperatureControlRequest, grpc.caihts.temperaturecontrol.TemperatureControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "temperaturecontrol.TemperatureControlService", "reverse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TemperatureControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TemperatureControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TemperatureControlServiceMethodDescriptorSupplier("reverse"))
                  .build();
          }
        }
     }
     return getReverseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.Message,
      grpc.caihts.temperaturecontrol.Empty> getEmptyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empty",
      requestType = grpc.caihts.temperaturecontrol.Message.class,
      responseType = grpc.caihts.temperaturecontrol.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.Message,
      grpc.caihts.temperaturecontrol.Empty> getEmptyMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.Message, grpc.caihts.temperaturecontrol.Empty> getEmptyMethod;
    if ((getEmptyMethod = TemperatureControlServiceGrpc.getEmptyMethod) == null) {
      synchronized (TemperatureControlServiceGrpc.class) {
        if ((getEmptyMethod = TemperatureControlServiceGrpc.getEmptyMethod) == null) {
          TemperatureControlServiceGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.temperaturecontrol.Message, grpc.caihts.temperaturecontrol.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "temperaturecontrol.TemperatureControlService", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TemperatureControlServiceMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest,
      grpc.caihts.temperaturecontrol.TemperatureControlResponse> getReverseStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reverseStream",
      requestType = grpc.caihts.temperaturecontrol.TemperatureControlRequest.class,
      responseType = grpc.caihts.temperaturecontrol.TemperatureControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest,
      grpc.caihts.temperaturecontrol.TemperatureControlResponse> getReverseStreamMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest, grpc.caihts.temperaturecontrol.TemperatureControlResponse> getReverseStreamMethod;
    if ((getReverseStreamMethod = TemperatureControlServiceGrpc.getReverseStreamMethod) == null) {
      synchronized (TemperatureControlServiceGrpc.class) {
        if ((getReverseStreamMethod = TemperatureControlServiceGrpc.getReverseStreamMethod) == null) {
          TemperatureControlServiceGrpc.getReverseStreamMethod = getReverseStreamMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.temperaturecontrol.TemperatureControlRequest, grpc.caihts.temperaturecontrol.TemperatureControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "temperaturecontrol.TemperatureControlService", "reverseStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TemperatureControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TemperatureControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TemperatureControlServiceMethodDescriptorSupplier("reverseStream"))
                  .build();
          }
        }
     }
     return getReverseStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest,
      grpc.caihts.temperaturecontrol.LengthResponse> getLengthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "length",
      requestType = grpc.caihts.temperaturecontrol.TemperatureControlRequest.class,
      responseType = grpc.caihts.temperaturecontrol.LengthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest,
      grpc.caihts.temperaturecontrol.LengthResponse> getLengthMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest, grpc.caihts.temperaturecontrol.LengthResponse> getLengthMethod;
    if ((getLengthMethod = TemperatureControlServiceGrpc.getLengthMethod) == null) {
      synchronized (TemperatureControlServiceGrpc.class) {
        if ((getLengthMethod = TemperatureControlServiceGrpc.getLengthMethod) == null) {
          TemperatureControlServiceGrpc.getLengthMethod = getLengthMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.temperaturecontrol.TemperatureControlRequest, grpc.caihts.temperaturecontrol.LengthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "temperaturecontrol.TemperatureControlService", "length"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TemperatureControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.LengthResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TemperatureControlServiceMethodDescriptorSupplier("length"))
                  .build();
          }
        }
     }
     return getLengthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest,
      grpc.caihts.temperaturecontrol.TemperatureControlResponse> getSplitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "split",
      requestType = grpc.caihts.temperaturecontrol.TemperatureControlRequest.class,
      responseType = grpc.caihts.temperaturecontrol.TemperatureControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest,
      grpc.caihts.temperaturecontrol.TemperatureControlResponse> getSplitMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TemperatureControlRequest, grpc.caihts.temperaturecontrol.TemperatureControlResponse> getSplitMethod;
    if ((getSplitMethod = TemperatureControlServiceGrpc.getSplitMethod) == null) {
      synchronized (TemperatureControlServiceGrpc.class) {
        if ((getSplitMethod = TemperatureControlServiceGrpc.getSplitMethod) == null) {
          TemperatureControlServiceGrpc.getSplitMethod = getSplitMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.temperaturecontrol.TemperatureControlRequest, grpc.caihts.temperaturecontrol.TemperatureControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "temperaturecontrol.TemperatureControlService", "split"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TemperatureControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TemperatureControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TemperatureControlServiceMethodDescriptorSupplier("split"))
                  .build();
          }
        }
     }
     return getSplitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemperatureControlServiceStub newStub(io.grpc.Channel channel) {
    return new TemperatureControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemperatureControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TemperatureControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemperatureControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TemperatureControlServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class TemperatureControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary, request and response
     * </pre>
     */
    public void reverse(grpc.caihts.temperaturecontrol.TemperatureControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReverseMethod(), responseObserver);
    }

    /**
     */
    public void empty(grpc.caihts.temperaturecontrol.Message request,
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyMethod(), responseObserver);
    }

    /**
     * <pre>
     *bi directional streaming where there is a constant exchange of information
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlRequest> reverseStream(
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getReverseStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming, client streams many requests and get one response
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlRequest> length(
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.LengthResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLengthMethod(), responseObserver);
    }

    /**
     * <pre>
     *server stream, client request and server streams many responses...
     * </pre>
     */
    public void split(grpc.caihts.temperaturecontrol.TemperatureControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSplitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReverseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.caihts.temperaturecontrol.TemperatureControlRequest,
                grpc.caihts.temperaturecontrol.TemperatureControlResponse>(
                  this, METHODID_REVERSE)))
          .addMethod(
            getEmptyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.caihts.temperaturecontrol.Message,
                grpc.caihts.temperaturecontrol.Empty>(
                  this, METHODID_EMPTY)))
          .addMethod(
            getReverseStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.caihts.temperaturecontrol.TemperatureControlRequest,
                grpc.caihts.temperaturecontrol.TemperatureControlResponse>(
                  this, METHODID_REVERSE_STREAM)))
          .addMethod(
            getLengthMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.caihts.temperaturecontrol.TemperatureControlRequest,
                grpc.caihts.temperaturecontrol.LengthResponse>(
                  this, METHODID_LENGTH)))
          .addMethod(
            getSplitMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.caihts.temperaturecontrol.TemperatureControlRequest,
                grpc.caihts.temperaturecontrol.TemperatureControlResponse>(
                  this, METHODID_SPLIT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TemperatureControlServiceStub extends io.grpc.stub.AbstractStub<TemperatureControlServiceStub> {
    private TemperatureControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemperatureControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemperatureControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary, request and response
     * </pre>
     */
    public void reverse(grpc.caihts.temperaturecontrol.TemperatureControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReverseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void empty(grpc.caihts.temperaturecontrol.Message request,
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *bi directional streaming where there is a constant exchange of information
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlRequest> reverseStream(
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getReverseStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *client streaming, client streams many requests and get one response
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlRequest> length(
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.LengthResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLengthMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *server stream, client request and server streams many responses...
     * </pre>
     */
    public void split(grpc.caihts.temperaturecontrol.TemperatureControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSplitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TemperatureControlServiceBlockingStub extends io.grpc.stub.AbstractStub<TemperatureControlServiceBlockingStub> {
    private TemperatureControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemperatureControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemperatureControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary, request and response
     * </pre>
     */
    public grpc.caihts.temperaturecontrol.TemperatureControlResponse reverse(grpc.caihts.temperaturecontrol.TemperatureControlRequest request) {
      return blockingUnaryCall(
          getChannel(), getReverseMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.caihts.temperaturecontrol.Empty empty(grpc.caihts.temperaturecontrol.Message request) {
      return blockingUnaryCall(
          getChannel(), getEmptyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server stream, client request and server streams many responses...
     * </pre>
     */
    public java.util.Iterator<grpc.caihts.temperaturecontrol.TemperatureControlResponse> split(
        grpc.caihts.temperaturecontrol.TemperatureControlRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSplitMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TemperatureControlServiceFutureStub extends io.grpc.stub.AbstractStub<TemperatureControlServiceFutureStub> {
    private TemperatureControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemperatureControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemperatureControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary, request and response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.caihts.temperaturecontrol.TemperatureControlResponse> reverse(
        grpc.caihts.temperaturecontrol.TemperatureControlRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReverseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.caihts.temperaturecontrol.Empty> empty(
        grpc.caihts.temperaturecontrol.Message request) {
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
    private final TemperatureControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TemperatureControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REVERSE:
          serviceImpl.reverse((grpc.caihts.temperaturecontrol.TemperatureControlRequest) request,
              (io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlResponse>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((grpc.caihts.temperaturecontrol.Message) request,
              (io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.Empty>) responseObserver);
          break;
        case METHODID_SPLIT:
          serviceImpl.split((grpc.caihts.temperaturecontrol.TemperatureControlRequest) request,
              (io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TemperatureControlResponse>) responseObserver);
        case METHODID_LENGTH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.length(
              (io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.LengthResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TemperatureControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemperatureControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.caihts.temperaturecontrol.TemperatureControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemperatureControlService");
    }
  }

  private static final class TemperatureControlServiceFileDescriptorSupplier
      extends TemperatureControlServiceBaseDescriptorSupplier {
    TemperatureControlServiceFileDescriptorSupplier() {}
  }

  private static final class TemperatureControlServiceMethodDescriptorSupplier
      extends TemperatureControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TemperatureControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TemperatureControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemperatureControlServiceFileDescriptorSupplier())
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
