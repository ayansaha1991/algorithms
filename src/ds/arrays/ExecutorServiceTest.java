package ds.arrays;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(10);
		
		try {
			for (int j = 0; j < 10; j++) {
				threadPool.submit(() -> {
					
					System.out.println("Testing " + Thread.currentThread().getName());
				});
			}
			
		} catch (Exception e) {
		}
	}
}
