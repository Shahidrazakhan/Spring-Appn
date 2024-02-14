package com.shahid.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shahid.model.Bank;
@Repository
public interface BankRepo extends JpaRepository<Bank, Long> {

}
