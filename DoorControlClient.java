package grpc.caihts.doorcontrol;



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
import grpc.caihts.doorcontrol.Message.Enum;
import io.grpc.stub.StreamObserver;


public class DoorControlClient {
	private static  Logger logger = Logger.getLogger(DoorControlClient.class.getName());

	private static DoorControlServiceGrpc.DoorControlServiceBlockingStub blockingStub;
	private static DoorControlServiceGrpc.DoorControlServiceStub asyncStub;
	
	public static void main(String[] args) throws Exception {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		//stubs -- generate from proto
		blockingStub = DoorControlServiceGrpc.newBlockingStub(channel);
		asyncStub = DoorControlServiceGrpc.newStub(channel);

		//reverse();

		//empty(); 	//passing an empty message - no server reply, error message

		//reverseStream();

		length();
		
		splitAsync();
		
		//splitBlocking();


	}


	//unary rpc
	public static void reverse() {
		
		DoorControlRequest req = DoorControlRequest.newBuilder().setVal("Hello seD").build();
		
		try {

			DoorControlResponse response = blockingStub.reverse(req);

			Thread.sleep(2000);
			System.out.println(response.getVal());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public static void splitAsync() {
		
		DoorControlRequest request = DoorControlRequest.newBuilder().setVal("54321").build();

		StreamObserver<DoorControlResponse> responseObserver = new StreamObserver<DoorControlResponse>() {

			int count =0 ;

			@Override
			public void onNext(DoorControlResponse value) {
				System.out.println("receiveing message in " + value);
				count += 1;
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();

			}

			@Override
			public void onCompleted() {
				System.out.println("Client stream is successfully built ... with "+ count + " messages received");
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

	//blocking server-streaming
	public static void splitBlocking() {
		DoorControlRequest request = DoorControlRequest.newBuilder().setVal("message 1 - introduction").build();

		try {
			Iterator<DoorControlResponse> responces = blockingStub.split(request);
			
			while(responces.hasNext()) {
				DoorControlResponse temp = responces.next();
				System.out.println(temp.getVal());				
			}

		} catch (StatusRuntimeException e) {
			e.printStackTrace();
		}
		
	}



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

	public static void reverseStream() {


		StreamObserver<DoorControlResponse> responseObserver = new StreamObserver<DoorControlResponse>() {

			@Override
			public void onNext(DoorControlResponse value) {

				System.out.println("revered received is " + value.getVal());

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("server completed");
			}



		};

		//
		StreamObserver<DoorControlRequest> requestObserver = asyncStub.reverseStream(responseObserver);

		try {

			requestObserver.onNext(DoorControlRequest.newBuilder().setVal("This").build());
			requestObserver.onNext(DoorControlRequest.newBuilder().setVal("is").build());
			requestObserver.onNext(DoorControlRequest.newBuilder().setVal("my text").build());
			requestObserver.onNext(DoorControlRequest.newBuilder().setVal("document").build());

			System.out.println("SENDING MESSAGES");

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
	 * Async client-streaming example. FOR THIS BIDIRECTIONAL EXAMPLE OF THIS CA DS(INTELLIGENT HOME TECH SERVICE) IT WILL BE USED
	 * */
	public static void length() {


		StreamObserver<LengthResponse> responseObserver = new StreamObserver<LengthResponse>() {

			@Override
			public void onNext(LengthResponse value) {
				System.out.println("[CHAR MADE UP] " + value.getLength());
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				System.out.println("Door server is done! ");

			}

		};

		//
		StreamObserver<DoorControlRequest> requestObserver = asyncStub.length(responseObserver);

		try {

			requestObserver.onNext(DoorControlRequest.newBuilder().setVal("Wait! Checking the door...").build());
			requestObserver.onNext(DoorControlRequest.newBuilder().setVal("Great! The door system is ready. ").build());
			

			System.out.println("Hello There!");
			System.out.println("Checking the door system...");


			// Mark the end of requests
			requestObserver.onCompleted(); // THIS METHOD SHOWS THAT THE CLIENT STREAMING WAS SUCCESSFULY DONE.


			// Sleep for a bit before sending the next one.
			Thread.sleep(new Random().nextInt(1000) + 500);


		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}

		/** @Elder Costa Cavalcanti x20110944 CA DS (Intelligent Home Tech Service)**/
	}

}

