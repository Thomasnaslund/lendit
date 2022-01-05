package se.lendit.loan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/loan")
public class LoanREST {

        public Logger logger = LoggerFactory.getLogger(LoanREST.class);

        @GetMapping("/ping")
        @ResponseStatus(HttpStatus.OK)
        public String ping() {
            logger.info("ping received");
            return "pong";
        }

}
