package com.example.refugee.apirestbd.refugio;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping("/{id}")
    public void updateRefugee(@PathVariable("id") Integer id, @RequestBody Refugee UpdRefugee)
    {
        refugeeService.updateRefugee(id, UpdRefugee);
    }

    @GetMapping("/{id}")
    public Refugee searchRefugeeID(@PathVariable Integer id) 
    {
        return refugeeService.searchRefugeeID(id);
    }

    @DeleteMapping("/{id}")
    public void deleteRefugeeID(@PathVariable Integer id)
    {
        refugeeService.deleteRefugeeID(id);
    }

}
