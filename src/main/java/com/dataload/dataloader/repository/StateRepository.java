package com.dataload.dataloader.repository;

import com.dataload.dataloader.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface StateRepository extends JpaRepository<State, Serializable> {
}
