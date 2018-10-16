package com.xxx.disruptor.handler;

import com.lmax.disruptor.EventHandler;
import com.xxx.disruptor.MyInParkingDataEvent;

public class MyParkingDataToKafkaHandler implements EventHandler<MyInParkingDataEvent> {
	
	@Override  
    public void onEvent(MyInParkingDataEvent myInParkingDataEvent, long sequence, boolean endOfBatch)  
            throws Exception {  
        long threadId = Thread.currentThread().getId(); // 获取当前线程id  
        String carLicense = myInParkingDataEvent.getCarLicense(); // 获取车牌号  
        System.out.println(String.format("Thread Id %s 发送 %s 进入停车场信息给 kafka系统...", threadId, carLicense));  
    }  

}
