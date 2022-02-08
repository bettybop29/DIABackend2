package com.ideaco.dia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

//JobModel ->  model yang kita buat, integer tipe data dari jobmodel
public interface JobRepository extends JpaRepository<UserModel, Integer> {
    Optional<UserModel> findByUserName(String username);

}
