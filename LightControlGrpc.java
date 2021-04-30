package grpc.caihts.lightcontrol;

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
 *the light control service definition..
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Smart.proto")
public final class LightControlGrpc {

  private LightControlGrpc() {}

  public static final String SERVICE_NAME = "lightcontrol.LightControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.caihts.lightcontrol.LightControlRequest,
      grpc.caihts.lightcontrol.LightControlReply> getSayLightControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayLightControl",
      requestType = grpc.caihts.lightcontrol.LightControlRequest.class,
      responseType = grpc.caihts.lightcontrol.LightControlReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.caihts.lightcontrol.LightControlRequest,
      grpc.caihts.lightcontrol.LightControlReply> getSayLightControlMethod() {
    io.grpc.MethodDescriptor<grpc.caihts.lightcontrol.LightControlRequest, grpc.caihts.lightcontrol.LightControlReply> getSayLightControlMethod;
    if ((getSayLightControlMethod = LightControlGrpc.getSayLightControlMethod) == null) {
      synchronized (LightControlGrpc.class) {
        if ((getSayLightControlMethod = LightControlGrpc.getSayLightControlMethod) == null) {
          LightControlGrpc.getSayLightControlMethod = getSayLightControlMethod = 
              io.grpc.MethodDescriptor.<grpc.caihts.lightcontrol.LightControlRequest, grpc.caihts.lightcontrol.LightControlReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "lightcontrol.LightControl", "SayLightControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.lightcontrol.LightControlRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.caihts.lightcontrol.LightControlReply.getDefaultInstance()))
                  .setSchemaDescriptor(new LightControlMethodDescriptorSupplier("SayLightControl"))
                  .build();
          }
        }
     }
     return getSayLightControlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LightControlStub newStub(io.grpc.Channel channel) {
    return new LightControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LightControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LightControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LightControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LightControlFutureStub(channel);
  }

  /**
   * <pre>
   *the light control service definition..
   * </pre>
   */
  public static abstract class LightControlImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *it sends a light control greeting
     * </pre>
     */
    public void sayLightControl(grpc.caihts.lightcontrol.LightControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.lightcontrol.LightControlReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayLightControlMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayLightControlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.caihts.lightcontrol.LightControlRequest,
                grpc.caihts.lightcontrol.LightControlReply>(
                  this, METHODID_SAY_LIGHT_CONTROL)))
          .build();
    }
  }

  /**
   * <pre>
   *the light control service definition..
   * </pre>
   */
  public static final class LightControlStub extends io.grpc.stub.AbstractStub<LightControlStub> {
    private LightControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightControlStub(channel, callOptions);
    }

    /**
     * <pre>
     *it sends a light control greeting
     * </pre>
     */
    public void sayLightControl(grpc.caihts.lightcontrol.LightControlRequest request,
        io.grpc.stub.StreamObserver<grpc.caihts.lightcontrol.LightControlReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayLightControlMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *the light control service definition..
   * </pre>
   */
  public static final class LightControlBlockingStub extends io.grpc.stub.AbstractStub<LightControlBlockingStub> {
    private LightControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightControlBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *it sends a light control greeting
     * </pre>
     */
    public grpc.caihts.lightcontrol.LightControlReply sayLightControl(grpc.caihts.lightcontrol.LightControlRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayLightControlMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *the light control service definition..
   * </pre>
   */
  public static final class LightControlFutureStub extends io.grpc.stub.AbstractStub<LightControlFutureStub> {
    private LightControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LightControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LightControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LightControlFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *it sends a light control greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.caihts.lightcontrol.LightControlReply> sayLightControl(
        grpc.caihts.lightcontrol.LightControlRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayLightControlMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_LIGHT_CONTROL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LightControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LightControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_LIGHT_CONTROL:
          serviceImpl.sayLightControl((grpc.caihts.lightcontrol.LightControlRequest) request,
              (io.grpc.stub.StreamObserver<grpc.caihts.lightcontrol.LightControlReply>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LightControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LightControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.caihts.lightcontrol.LightControlServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LightControl");
    }
  }

  private static final class LightControlFileDescriptorSupplier
      extends LightControlBaseDescriptorSupplier {
    LightControlFileDescriptorSupplier() {}
  }

  private static final class LightControlMethodDescriptorSupplier
      extends LightControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LightControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (LightControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LightControlFileDescriptorSupplier())
              .addMethod(getSayLightControlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
