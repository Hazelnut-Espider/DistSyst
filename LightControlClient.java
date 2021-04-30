package grpc.caihts.lightcontrol;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import grpc.caihts.lightcontrol.LightControlGrpc.LightControlBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class LightControlClient {

	private static final Logger logger = Logger.getLogger(LightControlClient.class.getName());


	public static void main(String[] args) throws Exception {
		String host = "localhost";
		int port = 50051;

		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
				.usePlaintext()
				.build();

		LightControlBlockingStub blockingStub = LightControlGrpc.newBlockingStub(channel);

	//	LightControlClient client = new LightControlClient.newBuilder()
	    LightControlClient client = new LightControlClient(); //this is a created light control service client(blocking - synchronous) 

	    try {// This is a protocol Buffer message 
	    	 String name = "Lights ON!!!";
	    	 LightControlRequest request = LightControlRequest.newBuilder().setName(name).build();
	    	 // same for a LighControlRequest
	    	 LightControlReply response = blockingStub.sayLightControl(request);
	    	 
	    	 logger.info("Lights Command actived: " + response.getMessage());

	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: Server is not working. Lights command unactivated. {0}", e.getStatus());

		    return;

	    } finally {
	    	//shutdown channel
	    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	  }
	//@Elder Costa Cavalcanti x20110944 CA DS (Intelligent Home Tech Service)

}
