/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogAggregation;
import com.fasterxml.jackson.databind.JsonNode;
import org.json.simple.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
/**
 *
 * @author ce.christian
 */

@RestController
@RequestMapping(value = "/api")
public class LogAggregation {

    // Initializing instance of Logger for Controller
    private static final Logger log = LoggerFactory.getLogger(ELKController.class);

    private final ELKService service;

    private final RestService restService;

    public ELKController(ELKService service, RestService restService) {
        this.service = service;
        this.restService = restService;
    }

    @GetMapping(value = "/hello")
    public String helloWorld() {
        log.info("Inside Hello World Function");
        String response = "Hello World! " + new Date();
        log.info("Response => {}",response);
        return response;
    }

    @GetMapping(value = "/Food-Details")
    public JSONArray foodDetails() {
        log.info("Inside Food Detail Function");
        return service.getAllFoodDetails();
    }
}
