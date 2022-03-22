package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class RedirectController {

    @PostMapping("/redirect")
    private ResponseEntity<String> performRedirect(@RequestBody AuthBody authBody) {
        URI uri = URI.create("https://abc.com/?q=" + authBody.getAuthCode());
        return ResponseEntity.status(HttpStatus.TEMPORARY_REDIRECT)
                .header("Location", uri.toString())
                .build();
    }

}
