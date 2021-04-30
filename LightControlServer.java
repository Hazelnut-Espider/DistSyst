package grpc.caihts.lightcontrol;

import java.io.IOException;
import java.util.logging.Logger;

import grpc.caihts.lightcontrol.LightControlGrpc.LightControlImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class LightControlServer extends LightControlGrpc.LightControlImplBase {

	private static final Logger logger = Logger.getLogger(LightControlServer.class.getName());

	public static void main(String[] args) {
		//Initial greeting of the RPC
		System.out.println("gRPC starting...");

		LightControlServer lightserver = new LightControlServer();

		int port = 50051;

		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(lightserver)
			    //.addService(new LightControlServiceImpl())
			    .build()
			    .start();
		/*	
			Runtime.getRuntime().addShutdownHook(new Thread(() -> {
				System.out.println("Received Lights switch off Request");
				server.shutdown();
				System.out.println("Successfully stopped the lights command server");
			}));
		*/
		
			 server.awaitTermination();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    logger.info("Server started, lights ON " + port);


	}
	//Unary Implementation

	@Override
	public void sayLightControl(LightControlRequest request,  StreamObserver<LightControlReply> responseObserver) {
		// response
		System.out.println("Receiving Lights Request. ");
		// this constructor creates a response 
		LightControlReply reply = LightControlReply.newBuilder().setMessage("Great! " + request.getName()).build();
		// this method sends the response
		 responseObserver.onNext(reply);
		 // this method completes the RPC call
	     responseObserver.onCompleted();
	}

	//@Elder Costa Cavalcanti x20110944 CA DS (Intelligent Home Tech Service)
}
