package grpc.caihts.temperaturecontrol;

import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import grpc.caihts.temperaturecontrol.TemperatureControlServiceGrpc.TemperatureControlServiceImplBase;
import io.grpc.stub.StreamObserver;


public class TemperatureControlServer extends TemperatureControlServiceImplBase {


	private static final Logger logger = Logger.getLogger(TemperatureControlServer.class.getName());

	
	 public static void main(String[] args) throws IOException, InterruptedException {
		    
		 TemperatureControlServer stringserver = new TemperatureControlServer();
		   
		    int port = 50051;
		    Server server = ServerBuilder.forPort(port)
		        .addService(stringserver)
		        .build()
		        .start();
		    
		    logger.info(" gRPC Server has started, switch it on " + port);
		    		    
		    server.awaitTermination();
	 }

	 @Override
	 public void split(TemperatureControlRequest request, StreamObserver<TemperatureControlResponse> responseObserver) {
		 System.out.println("receiving split");
		 
		 char[]characters = request.getVal().toCharArray();
		 System.out.println(characters.length);
		 
		 for(char c: characters) {			
			 responseObserver.onNext(TemperatureControlResponse.newBuilder().setVal(Character.toString(c)).build());
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
	public void reverse(TemperatureControlRequest request, StreamObserver<TemperatureControlResponse> responseObserver) {
		
		System.out.print("receiving reverse message ");
		
		StringBuilder stb = new StringBuilder(request.getVal());
		String output = stb.reverse().toString();
		
		TemperatureControlResponse reply = TemperatureControlResponse.newBuilder().setVal(output).build();
		
		responseObserver.onNext(reply);
		
		responseObserver.onCompleted();
	}

	

	@Override
	public StreamObserver<TemperatureControlRequest> reverseStream(StreamObserver<TemperatureControlResponse> responseObserver) {
		return new StreamObserver<TemperatureControlRequest>() {

			@Override
			public void onNext(TemperatureControlRequest request) {
					StringBuilder input1 = new StringBuilder(); 
				  
		            input1.append(request.getVal()); 
		            input1 = input1.reverse();
		        
		            TemperatureControlResponse reply = TemperatureControlResponse.newBuilder().setVal(input1.toString()).build();
		      
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
	public StreamObserver<TemperatureControlRequest> length(StreamObserver<LengthResponse> responseObserver) {
		
		
		return new StreamObserver<TemperatureControlRequest>() {
			
			int length = 0;
			
			@Override
			public void onNext(TemperatureControlRequest value) {
				
				System.out.println("receive -> " + value.getVal());
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

	
	
}

