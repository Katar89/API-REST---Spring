package com.example.refugee.apirestbd.refugio;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/refugee")
@RequiredArgsConstructor
public class RefugeeController {

    private final RefugeeService refugeeService;

    @PostMapping
    public void createRefugee(@RequestBody Refugee refugee)
    {
         refugeeService.createRefugee(refugee);
    }

}
