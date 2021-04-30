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
public final class TempetureControlServiceGrpc {

  private TempetureControlServiceGrpc() {}

  public static final String SERVICE_NAME = "tempeturecontrol.TempetureControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest,
      grpc.caihts.temperaturecontrol.TempetureControlResponse> getReverseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reverse",
      requestType = grpc.caihts.temperaturecontrol.TempetureControlRequest.class,
      responseType = grpc.caihts.temperaturecontrol.TempetureControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest,
      grpc.caihts.temperaturecontrol.TempetureControlResponse> getReverseMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest, grpc.caihts.temperaturecontrol.TempetureControlResponse> getReverseMethod;
    if ((getReverseMethod = TempetureControlServiceGrpc.getReverseMethod) == null) {
      synchronized (TempetureControlServiceGrpc.class) {
        if ((getReverseMethod = TempetureControlServiceGrpc.getReverseMethod) == null) {
          TempetureControlServiceGrpc.getReverseMethod = getReverseMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.temperaturecontrol.TempetureControlRequest, grpc.caihts.temperaturecontrol.TempetureControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tempeturecontrol.TempetureControlService", "reverse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TempetureControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TempetureControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TempetureControlServiceMethodDescriptorSupplier("reverse"))
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
    if ((getEmptyMethod = TempetureControlServiceGrpc.getEmptyMethod) == null) {
      synchronized (TempetureControlServiceGrpc.class) {
        if ((getEmptyMethod = TempetureControlServiceGrpc.getEmptyMethod) == null) {
          TempetureControlServiceGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.temperaturecontrol.Message, grpc.caihts.temperaturecontrol.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tempeturecontrol.TempetureControlService", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new TempetureControlServiceMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest,
      grpc.caihts.temperaturecontrol.TempetureControlResponse> getReverseStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reverseStream",
      requestType = grpc.caihts.temperaturecontrol.TempetureControlRequest.class,
      responseType = grpc.caihts.temperaturecontrol.TempetureControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest,
      grpc.caihts.temperaturecontrol.TempetureControlResponse> getReverseStreamMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest, grpc.caihts.temperaturecontrol.TempetureControlResponse> getReverseStreamMethod;
    if ((getReverseStreamMethod = TempetureControlServiceGrpc.getReverseStreamMethod) == null) {
      synchronized (TempetureControlServiceGrpc.class) {
        if ((getReverseStreamMethod = TempetureControlServiceGrpc.getReverseStreamMethod) == null) {
          TempetureControlServiceGrpc.getReverseStreamMethod = getReverseStreamMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.temperaturecontrol.TempetureControlRequest, grpc.caihts.temperaturecontrol.TempetureControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "tempeturecontrol.TempetureControlService", "reverseStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TempetureControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TempetureControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TempetureControlServiceMethodDescriptorSupplier("reverseStream"))
                  .build();
          }
        }
     }
     return getReverseStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest,
      grpc.caihts.temperaturecontrol.LengthResponse> getLengthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "length",
      requestType = grpc.caihts.temperaturecontrol.TempetureControlRequest.class,
      responseType = grpc.caihts.temperaturecontrol.LengthResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest,
      grpc.caihts.temperaturecontrol.LengthResponse> getLengthMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest, grpc.caihts.temperaturecontrol.LengthResponse> getLengthMethod;
    if ((getLengthMethod = TempetureControlServiceGrpc.getLengthMethod) == null) {
      synchronized (TempetureControlServiceGrpc.class) {
        if ((getLengthMethod = TempetureControlServiceGrpc.getLengthMethod) == null) {
          TempetureControlServiceGrpc.getLengthMethod = getLengthMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.temperaturecontrol.TempetureControlRequest, grpc.caihts.temperaturecontrol.LengthResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "tempeturecontrol.TempetureControlService", "length"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TempetureControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.LengthResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TempetureControlServiceMethodDescriptorSupplier("length"))
                  .build();
          }
        }
     }
     return getLengthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest,
      grpc.caihts.temperaturecontrol.TempetureControlResponse> getSplitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "split",
      requestType = grpc.caihts.temperaturecontrol.TempetureControlRequest.class,
      responseType = grpc.caihts.temperaturecontrol.TempetureControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest,
      grpc.caihts.temperaturecontrol.TempetureControlResponse> getSplitMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.temperaturecontrol.TempetureControlRequest, grpc.caihts.temperaturecontrol.TempetureControlResponse> getSplitMethod;
    if ((getSplitMethod = TempetureControlServiceGrpc.getSplitMethod) == null) {
      synchronized (TempetureControlServiceGrpc.class) {
        if ((getSplitMethod = TempetureControlServiceGrpc.getSplitMethod) == null) {
          TempetureControlServiceGrpc.getSplitMethod = getSplitMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.temperaturecontrol.TempetureControlRequest, grpc.caihts.temperaturecontrol.TempetureControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "tempeturecontrol.TempetureControlService", "split"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TempetureControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.temperaturecontrol.TempetureControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TempetureControlServiceMethodDescriptorSupplier("split"))
                  .build();
          }
        }
     }
     return getSplitMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TempetureControlServiceStub newStub(io.grpc.Channel channel) {
    return new TempetureControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TempetureControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TempetureControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TempetureControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TempetureControlServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class TempetureControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary, request and response
     * </pre>
     */
    public void reverse(grpc.caihts.temperaturecontrol.TempetureControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlResponse> responseObserver) {
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
    public io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlRequest> reverseStream(
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getReverseStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming, client streams many requests and get one response
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlRequest> length(
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.LengthResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getLengthMethod(), responseObserver);
    }

    /**
     * <pre>
     *server stream, client request and server streams many responses...
     * </pre>
     */
    public void split(grpc.caihts.temperaturecontrol.TempetureControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSplitMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReverseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.caihts.temperaturecontrol.TempetureControlRequest,
                grpc.caihts.temperaturecontrol.TempetureControlResponse>(
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
                grpc.caihts.temperaturecontrol.TempetureControlRequest,
                grpc.caihts.temperaturecontrol.TempetureControlResponse>(
                  this, METHODID_REVERSE_STREAM)))
          .addMethod(
            getLengthMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.caihts.temperaturecontrol.TempetureControlRequest,
                grpc.caihts.temperaturecontrol.LengthResponse>(
                  this, METHODID_LENGTH)))
          .addMethod(
            getSplitMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.caihts.temperaturecontrol.TempetureControlRequest,
                grpc.caihts.temperaturecontrol.TempetureControlResponse>(
                  this, METHODID_SPLIT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TempetureControlServiceStub extends io.grpc.stub.AbstractStub<TempetureControlServiceStub> {
    private TempetureControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TempetureControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TempetureControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TempetureControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary, request and response
     * </pre>
     */
    public void reverse(grpc.caihts.temperaturecontrol.TempetureControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlResponse> responseObserver) {
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
    public io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlRequest> reverseStream(
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getReverseStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *client streaming, client streams many requests and get one response
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlRequest> length(
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.LengthResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getLengthMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *server stream, client request and server streams many responses...
     * </pre>
     */
    public void split(grpc.caihts.temperaturecontrol.TempetureControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSplitMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TempetureControlServiceBlockingStub extends io.grpc.stub.AbstractStub<TempetureControlServiceBlockingStub> {
    private TempetureControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TempetureControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TempetureControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TempetureControlServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary, request and response
     * </pre>
     */
    public grpc.caihts.temperaturecontrol.TempetureControlResponse reverse(grpc.caihts.temperaturecontrol.TempetureControlRequest request) {
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
    public java.util.Iterator<grpc.caihts.temperaturecontrol.TempetureControlResponse> split(
        grpc.caihts.temperaturecontrol.TempetureControlRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSplitMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class TempetureControlServiceFutureStub extends io.grpc.stub.AbstractStub<TempetureControlServiceFutureStub> {
    private TempetureControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TempetureControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TempetureControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TempetureControlServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary, request and response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.caihts.temperaturecontrol.TempetureControlResponse> reverse(
        grpc.caihts.temperaturecontrol.TempetureControlRequest request) {
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
    private final TempetureControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TempetureControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REVERSE:
          serviceImpl.reverse((grpc.caihts.temperaturecontrol.TempetureControlRequest) request,
              (io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlResponse>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((grpc.caihts.temperaturecontrol.Message) request,
              (io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.Empty>) responseObserver);
          break;
        case METHODID_SPLIT:
          serviceImpl.split((grpc.caihts.temperaturecontrol.TempetureControlRequest) request,
              (io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.TempetureControlResponse>) responseObserver);
        case METHODID_LENGTH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.length(
              (io.grpc.stub.StreamObserver<grpc.caihts.temperaturecontrol.LengthResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TempetureControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TempetureControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.caihts.temperaturecontrol.TempetureControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TempetureControlService");
    }
  }

  private static final class TempetureControlServiceFileDescriptorSupplier
      extends TempetureControlServiceBaseDescriptorSupplier {
    TempetureControlServiceFileDescriptorSupplier() {}
  }

  private static final class TempetureControlServiceMethodDescriptorSupplier
      extends TempetureControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TempetureControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TempetureControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TempetureControlServiceFileDescriptorSupplier())
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
