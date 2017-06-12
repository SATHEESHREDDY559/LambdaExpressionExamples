package AnonymousClass;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunnableLambdaEx {

	public static void main(String[] args) {
	/*	Runnable runnable = new Runnable(){

			@Override
			public void run() {
				for(int i=0; i<3;i++){
				System.out.println("["
						+ Thread.currentThread().getName()
						+ "]");
				
			}
			}
			
		};*/
		
		Runnable runnableLambda = () ->{
			for(int i=0; i<3;i++){
				System.out.println("["
						+ Thread.currentThread().getName()
						+ "]");
			
		}
		};
	
		
		Executor executor = Executors.newFixedThreadPool(10);
		executor.execute(runnableLambda);
		
		
		
	}

}
