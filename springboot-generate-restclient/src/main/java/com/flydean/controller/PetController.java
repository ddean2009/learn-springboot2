package com.flydean.controller;

import com.flydean.client.api.PetApi;
import com.flydean.client.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author wayne
 * @version PetController,  2020/2/8 10:34 上午
 */
@RestController
public class PetController {

    @Autowired
    private PetApi petApi;

    @GetMapping("/api/findAvailablePets")
    public List<Pet> findAvailablePets() {
        return petApi.findPetsByStatus(Arrays.asList("available"));
    }
}
