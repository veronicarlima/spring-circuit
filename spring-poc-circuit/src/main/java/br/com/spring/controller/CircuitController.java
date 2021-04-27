package br.com.spring.controller;

import br.com.spring.service.CircuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/circuit")
public class CircuitController {

    @Autowired
    private CircuitService service;
}
