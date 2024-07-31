package com.example.DTOexample.Repository;

import com.example.DTOexample.Model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Locale;


@Repository
public interface locationRepository extends JpaRepository<Location,Long> {
}
