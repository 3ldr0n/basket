package org.basket;

import org.basket.response.BaseResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BasketApplication {

    @GetMapping("/")
    public ResponseEntity<BaseResponse> index() {
        return ResponseEntity.status(HttpStatus.OK).body(new BaseResponse("ok"));
    }

    public static void main(String[] args) {
        SpringApplication.run(BasketApplication.class, args);
    }

}
