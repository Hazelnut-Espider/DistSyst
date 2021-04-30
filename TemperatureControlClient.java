package grpc.caihts.temperaturecontrol;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import grpc.caihts.temperaturecontrol.Message.Enum;
import io.grpc.stub.StreamObserver;


public class TemperatureControlClient {
	private static  Logger logger = Logger.getLogger(TemperatureControlClient.class.getName());

	private static TemperatureControlServiceGrpc.TemperatureControlServiceBlockingStub blockingStub;
	private static TemperatureControlServiceGrpc.TemperatureControlServiceStub asyncStub;
	
	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = TemperatureControlServiceGrpc.newBlockingStub(channel);
		asyncStub = TemperatureControlServiceGrpc.newStub(channel);

//		reverse();

//		empty(); 	//passing an empty message - no server reply, error message

		reverseStream();

		length();
		
//		splitAsync();
		
//		splitBlocking();


	}


	//unary rpc
	public static void reverse() {
		// THIS EXAMPLE WAS NOT USED
		TemperatureControlRequest req = TemperatureControlRequest.newBuilder().setVal("Hello seD").build();

		TemperatureControlResponse response = blockingStub.reverse(req);

		System.out.println(response.getVal());
	}


	public static void splitAsync() {
		// THIS EXAMPLE WAS NOT USED
		TemperatureControlRequest request = TemperatureControlRequest.newBuilder().setVal("message 1 - introduction").build();

		StreamObserver<TemperatureControlResponse> responseObserver = new StreamObserver<TemperatureControlResponse>() {

			int count =0 ;

			@Override
			public void onNext(TemperatureControlResponse value) {
				System.out.println("receiving messages " + value);
				count += 1;
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("stream is completed ... received " + count + " messages");
			}

		};

		asyncStub.split(request, responseObserver);


		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//blocking Server-streaming
	public static void splitBlocking() { // THIS EXAMPLE WAS NOT USED
		TemperatureControlRequest request = TemperatureControlRequest.newBuilder().setVal("message 1 - introduction").build();

		try {
			Iterator<TemperatureControlResponse> responces = blockingStub.split(request);
			
			while(responces.hasNext()) {
				TemperatureControlResponse temp = responces.next();
				System.out.println(temp.getVal());				
			}

		} catch (StatusRuntimeException e) {
			e.printStackTrace();
		}
		
	}


	// THIS EXAMPLE WAS NOT USED
	public static void empty() {

		Message req = Message.newBuilder().setDetail(Enum.UNKNOWN).build();
		try {

			Empty response = blockingStub.empty(req);

			System.out.println("one response " + response.toString());

		}catch(StatusRuntimeException ex) {
			System.out.println( ex.getMessage());
			//ex.printStackTrace();
		}


	}
	
	
	/**
	 * Async server-streaming . THIS IS THE SERVER STREAM USEd IN THE CA DS (INTELLIGENT HOUSE TECHNOLOGY SERVICE) 
	 **/
	
	public static void reverseStream() {


		StreamObserver<TemperatureControlResponse> responseObserver = new StreamObserver<TemperatureControlResponse>() {

			@Override
			public void onNext(TemperatureControlResponse value) {

				System.out.println("Checking... " + value.getVal());

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Well Done! Server Completed");
			}



		};

		//
		StreamObserver<TemperatureControlRequest> requestObserver = asyncStub.reverseStream(responseObserver);

		try {

			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("s1").build());
			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("s2").build());
			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("s3").build());
			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("s4").build());
			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("s5").build());

			System.out.println("Hello There!");

			// Mark the end of requests
			requestObserver.onCompleted();


			// Sleep for a bit before sending the next one.
			Thread.sleep(new Random().nextInt(1000) + 500);


		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}


	}
	
	
	
	

	/**
	 * Async client-streaming . THIS IS THE CLIENT STREAM USE IN THE CA DS(INTELLIGENT HOUSE TECHNOLOGY SERVICE) 
	 **/
	public static void length() {

		//This is the constructor of the method that will stream the message
		StreamObserver<LengthResponse> responseObserver = new StreamObserver<LengthResponse>() { 

			@Override
			public void onNext(LengthResponse value) { //This method shows how many character was used to make up the response 
				System.out.println("Length of characters described is: " + value.getLength());
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() { //This message shows that the stream client was completed
				System.out.println("The temperature was set up successfully ");

			}

		};

		//
		StreamObserver<TemperatureControlRequest> requestObserver = asyncStub.length(responseObserver);

		try {

			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("Temperature is 15°C").build());
			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("Hold on! Setting up temperature...").build());
			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("Temperature now is 17°C").build());
			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("Hold on! Setting up temperature...").build());
			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("Temperature now is 20°C").build());
			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("Hold on! Setting up temperature...").build());
			requestObserver.onNext(TemperatureControlRequest.newBuilder().setVal("Temperature now is 23°C").build());
			
			
			System.out.println("Heater is On!");

			// Mark the end of requests
			requestObserver.onCompleted();


			// Sleep for a bit before sending the next one.
			Thread.sleep(new Random().nextInt(3000) + 500);


		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}


	}

}

