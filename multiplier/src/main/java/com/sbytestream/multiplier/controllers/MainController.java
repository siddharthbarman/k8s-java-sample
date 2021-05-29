package com.sbytestream.multiplier.controllers;

import com.sbytestream.multiplier.models.CalculationResponse;
import com.sbytestream.multiplier.services.MultiplyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping(path = "/multiply", produces = "application/json")
public class MainController {
    @GetMapping()
    public ResponseEntity<CalculationResponse> get(@RequestParam int op1, @RequestParam int op2) {
        CalculationResponse result = new CalculationResponse(op1, op2, "multiply", new MultiplyService().calculate(op1, op2), getLocalIP());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    private String getLocalIP() {
        InetAddress myIP= null;
        String result = "unknown";
        try {
            myIP = InetAddress.getLocalHost();
            result =  myIP.getHostAddress();
        }
        catch (UnknownHostException e) {
            logger.error("Error getting local IP", e);
        }
        return result;
    }

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);
}
