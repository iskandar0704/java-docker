package com.example.repository;

import com.example.entity.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends CrudRepository<Profile,Integer> {

    List<Profile> getAllByIdNotNull();
}
