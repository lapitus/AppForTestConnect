package AppForTestConnect.controller;

import AppForTestConnect.service.ServiceData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HostRestController {

    public static final Logger LOG = LoggerFactory.getLogger(HostRestController.class);

    @Autowired
    ServiceData serviceData  ;

    @GetMapping("/getStatus")
    public String getStatus () {
        LOG.info ("getStatus");
        return "getStatus ok";
    }

    @GetMapping("/getDual")
    public String getDual () {
       LOG.info("getDual");
        return "getDual ok";
    }
}
