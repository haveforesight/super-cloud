package com.xxx.disruptor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.YieldingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.EventHandlerGroup;
import com.lmax.disruptor.dsl.ProducerType;
import com.xxx.disruptor.handler.MyParkingDataInDbHandler;
import com.xxx.disruptor.handler.MyParkingDataSmsHandler;
import com.xxx.disruptor.handler.MyParkingDataToKafkaHandler;

public class MyInParkingDataEventMain {
	
	 @SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {  
	        long beginTime=System.currentTimeMillis();  
	        int bufferSize = 2048; // 2的N次方  
	        try {  
	            // 创建线程池，负责处理Disruptor的四个消费者  
	           // ExecutorService executor = Executors.newFixedThreadPool(40);  
	              
	            // 初始化一个 Disruptor  
	            Disruptor<MyInParkingDataEvent> disruptor = new Disruptor<MyInParkingDataEvent>(new EventFactory<MyInParkingDataEvent>() {  
	                @Override  
	                public MyInParkingDataEvent newInstance() {  
	                    return new MyInParkingDataEvent(); // Event 初始化工厂  
	                }  
	            }, bufferSize, Executors.defaultThreadFactory(), ProducerType.SINGLE, new YieldingWaitStrategy());  
	              
	            // 使用disruptor创建消费者组 MyParkingDataInDbHandler 和 MyParkingDataToKafkaHandler  
	            EventHandlerGroup<MyInParkingDataEvent> handlerGroup = disruptor.handleEventsWithWorkerPool(  
	                    new MyParkingDataInDbHandler(),
	                    new MyParkingDataInDbHandler(),
	                    new MyParkingDataInDbHandler(),
	                    new MyParkingDataInDbHandler(),new MyParkingDataInDbHandler(),new MyParkingDataInDbHandler(),new MyParkingDataInDbHandler());
	            
	              
	            // 当上面两个消费者处理结束后在消耗 smsHandler  
	            MyParkingDataSmsHandler myParkingDataSmsHandler = new MyParkingDataSmsHandler();  
	            handlerGroup.then(myParkingDataSmsHandler);  
	              
	            // 启动Disruptor  
	            disruptor.start();
	              
	           //CountDownLatch countDownLatch = new CountDownLatch(2); // 一个生产者线程准备好了就可以通知主线程继续工作了  
	            // 生产者生成数据  
	            new MyInParkingDataEventPublisher(disruptor).run();
	          //  new Thread( ).start(); 
	           // countDownLatch.await(); // 等待生产者结束  
	              
	            disruptor.shutdown();  
	            System.out.println("消费完成");
	          //  executor.shutdown();  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	          
	        System.out.println("总耗时:"+(System.currentTimeMillis()-beginTime));  
	    }  

}
