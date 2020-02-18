package com.ALuniv25.MotionLighting.ReadingData;

import java.io.IOException;

import com.ALuniv25.MotionLighting.ReadingData.DataStore.arduinoRequest;
import com.ALuniv25.MotionLighting.ReadingData.DataStore.arduinoResponse;
import com.fazecast.jSerialComm.SerialPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

/*@RestController*/
public class ArduinoController {

    /*@MessageMapping("/hello")
    @SendTo("/topic/dataStreammm")
    public arduinoResponse DataStream(arduinoRequest message) throws Exception {
      Thread.sleep(1000); // simulated delay
      //return new arduinoResponse(message.getLed() , message.getLight() , message.getLight());
      SerialTest main = new SerialTest();
      arduinoResponse response = main.getData();
      //main.sendData();
      //System.out.println("Started");
      System.out.println("got our response :" + main.getData());
      return response;
    }

    @GetMapping("/getDat")
    public void sendData() {

		SerialTest main = new SerialTest();
		System.out.println("Started");
    //arduinoResponse response = main.getData();
		//System.out.println("got our response :" + response.getLed());
    }*/
}
