import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PoolClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		//Asynchronous
		Future<Integer> f1 = service.submit(new Numbers(1,5000));
		Future<Integer> f2 = service.submit(new Numbers(100,500));
		Future<Integer> f3 = service.submit(new Numbers(600,1000));
		Future<Integer> f4 = service.submit(new Numbers(1,50));
	
	try {
		System.out.println(f1.get());
		System.out.println(f2.get());
		System.out.println(f3.get());
		System.out.println(f4.get());
	}catch(Exception ex) {
		ex.printStackTrace();
	}
	service.shutdown();

}
}