package com.app.aop.controller;

import jakarta.validation.constraints.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ashwani Kumar
 * Created on 29/12/23.
 */
@Slf4j
@RestController
public class CartController implements CartApi {

    @Override
    public ResponseEntity<String> getCart(String cartId, String affiliate) {
        log.info("CartController:- fetching cart for cartId: {}", cartId);
        return new ResponseEntity<>("Cart returned", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> getCartLegacy(String cartId, String affiliate) {
        return getCart(cartId, affiliate);
    }
}
