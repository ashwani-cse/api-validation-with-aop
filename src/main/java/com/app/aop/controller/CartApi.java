package com.app.aop.controller;

import jakarta.validation.constraints.Pattern;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

public interface CartApi extends LegacyCartApi {

    @GetMapping("/api/v1/{cartId}")
    public ResponseEntity<String> getCart(@PathVariable("cartId") String cartId,
                                          @RequestHeader("affiliate")
                                          @Pattern(regexp = "^[a-zA-Z]{1,3}$") String affiliate);
}
