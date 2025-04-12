package com.example.lab2_20210740.Repository;

import com.example.lab2_20210740.entity.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SedeRepositorio extends JpaRepository <Sede, String> {
}
