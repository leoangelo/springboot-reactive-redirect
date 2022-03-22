package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class RedirectController {

    @PostMapping("/redirect")
    private ServerResponse performRedirect(@RequestBody AuthBody authBody) {
        URI uri = URI.create("https://abc.com/?q=" + authBody.getAuthCode());
        return ServerResponse.temporaryRedirect(uri).build().block();
    }

}
