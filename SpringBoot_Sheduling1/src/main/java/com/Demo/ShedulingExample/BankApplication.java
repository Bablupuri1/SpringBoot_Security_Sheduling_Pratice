package com.Demo.ShedulingExample;

import java.time.LocalTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class BankApplication {

//	@Scheduled(fixedRate = 5000)  //here fixedRate means thet method executed after 5  second automatically daily//becouse 
//	//we  are not specify time
//	public void DeActivitateAccount()
//	{
//		
//		System.out.println("BankApplication.DeActivitateAccount()");
//	}

	// now i want to use flxedDelay

	
	//means wait 5 second after the application start and then execute again and again withing 5 second gap
//	@Scheduled(fixedDelay = 5000)
//	public void SendMail() {
//		System.out.println("BankApplication.SendMail()"+Thread.currentThread().getClass()+"Time:"+new Date());
//	}

	// what are the difference between fixedRate and fixedDelay
	
//	
//	@Scheduled(fixedRate = 5000)
//	public void SendMail() {
//		System.out.println("BankApplication.SendMail()"+Thread.currentThread().getClass()+"Time:"+new Date());
//	}
	
	
	
//	@Scheduled(fixedRate = 5000)
//	public void job() throws InterruptedException {
//	    System.out.println("Started at: " + LocalTime.now());
//	    Thread.sleep(10000); // Simulating 10 sec work
//	    System.out.println("Running Task......."+Thread.currentThread().getName());
//	    System.out.println("Finished at: " + LocalTime.now().getSecond());
//	}

	
	
	@Scheduled(fixedRate = 5000)
	public void job() throws InterruptedException {
	    System.out.println("Started at: " + LocalTime.now() + " by " + Thread.currentThread().getName());
	    Thread.sleep(10000);
	    System.out.println("Finished at: " + LocalTime.now() + " by " + Thread.currentThread().getName());
	}

	

}
