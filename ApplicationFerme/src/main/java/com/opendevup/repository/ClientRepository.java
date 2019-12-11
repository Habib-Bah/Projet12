package com.opendevup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opendevup.model.Client;


public interface ClientRepository extends JpaRepository<Client, Long>{

}
