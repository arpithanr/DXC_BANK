package com.dxc.dxcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dxc.dxcbank.entities.ReoccuringAccount;

@Repository
@EnableJpaRepositories
public interface IReoccuringAccountRepository extends JpaRepository<ReoccuringAccount, Long> {

}
