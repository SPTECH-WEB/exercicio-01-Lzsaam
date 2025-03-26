package com.fatura.apifatura.repository;

import com.fatura.apifatura.model.Fatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {
    Long id(Long id);
}
