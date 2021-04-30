package grpc.caihts.doorcontrol;

import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import grpc.caihts.doorcontrol.DoorControlServiceGrpc.DoorControlServiceImplBase;
import io.grpc.stub.StreamObserver;


public class DoorControlServer extends DoorControlServiceImplBase {


	private static final Logger logger = Logger.getLogger(DoorControlServer.class.getName());

	
	 public static void main(String[] args) throws IOException, InterruptedException {
		    
		 DoorControlServer stringserver = new DoorControlServer();
		   
		    int port = 50051;
		    Server server = ServerBuilder.forPort(port)
		        .addService(stringserver)
		        .build()
		        .start();
		    
		    logger.info("Server started, switch it on " + port);
		    		    
		    server.awaitTermination();
	 }
	 //Response of the server streaming when client is working
	 @Override
	 public void split(DoorControlRequest request, StreamObserver<DoorControlResponse> responseObserver) {
		 System.out.println("Door lock activated ");
		 
		 char[]characters = request.getVal().toCharArray();
		 System.out.println(characters.length);
		 
		 for(char c: characters) {			
			 responseObserver.onNext(DoorControlResponse.newBuilder().setVal(Character.toString(c)).build());
		 }
		 
		 responseObserver.onCompleted();
	}
	
	@Override
	public void empty(Message request, StreamObserver<Empty> responseObserver) {
		System.out.println("empty message "+ request.getDetail());
			
		//will generate an error CANCELLED: HTTP/2 error code: CANCEL
		Empty reply = Empty.newBuilder().build();
		responseObserver.onNext(reply); 
		
	//	StatusRuntimeException er = new StatusRuntimeException(Status.ABORTED);
	//	responseObserver.onError(er);
	  
		responseObserver.onCompleted();
	}


	@Override
	public void reverse(DoorControlRequest request, StreamObserver<DoorControlResponse> responseObserver) {
		
		System.out.print("Receiving message ");
		
		StringBuilder stb = new StringBuilder(request.getVal());
		String output = stb.reverse().toString();
		
		DoorControlResponse reply = DoorControlResponse.newBuilder().setVal(output).build();
		
		responseObserver.onNext(reply);
		
		responseObserver.onCompleted();
	}

	

	@Override
	public StreamObserver<DoorControlRequest> reverseStream(StreamObserver<DoorControlResponse> responseObserver) {
		return new StreamObserver<DoorControlRequest>() {

			@Override
			public void onNext(DoorControlRequest request) {
					StringBuilder input1 = new StringBuilder(); 
				  
		            input1.append(request.getVal()); 
		            input1 = input1.reverse();
		        
		            DoorControlResponse reply = DoorControlResponse.newBuilder().setVal(input1.toString()).build();
		      
		            responseObserver.onNext(reply);
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stubal
				
			}

			@Override
			public void onCompleted() {
				 responseObserver.onCompleted();
				
			}
			
		};
	}

	@Override
	public StreamObserver<DoorControlRequest> length(StreamObserver<LengthResponse> responseObserver) {
		
		
		return new StreamObserver<DoorControlRequest>() {
			
			int length = 0;
			
			@Override
			public void onNext(DoorControlRequest value) {
				
				System.out.println("-> " + value.getVal());
				length += value.getVal().length();
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				  LengthResponse res = LengthResponse.newBuilder().setLength(length).build();
		          responseObserver.onNext(res);
		          responseObserver.onCompleted();
			}
			
			
		};
	}

	/** @Elder Costa Cavalcanti x20110944 CA DS (Intelligent Home Tech Service)**/
	
}

