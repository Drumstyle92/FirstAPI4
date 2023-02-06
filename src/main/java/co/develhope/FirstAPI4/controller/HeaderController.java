package co.develhope.FirstAPI4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpHeaders;

/**
 * @author Drumstyle92
 * Spring Boot controller class.
 */
@RestController
public class HeaderController {
    /**
     * @param headers parameter with annotation with which we can get a response on HTTP information.
     * @return returns a reply about the host name and the port name.
     * Get method which takes and retrieves a response in HTTP headers.
     */
    @GetMapping("/headers")
    public String getHeaders(@RequestHeader("host") String headers){
        return headers;
    }
}
