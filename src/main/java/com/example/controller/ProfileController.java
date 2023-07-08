package com.example.controller;

import com.example.entity.Profile;
import com.example.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    private ProfileRepository profileRepository;

    @GetMapping("/all")
    public String getAll(){
        List<Profile> profiles;

        profiles = profileRepository.getAllByIdNotNull();

        if(profiles.isEmpty()){
            return null;
        }

        String result = "";

        for(Profile s: profiles){
            result = result + s.toString();
        }

        return result;
    }
}
