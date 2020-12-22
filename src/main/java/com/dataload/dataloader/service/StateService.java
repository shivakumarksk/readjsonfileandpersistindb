package com.dataload.dataloader.service;

import com.dataload.dataloader.domain.State;
import com.dataload.dataloader.repository.StateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    private StateRepository stateRepository;

    public StateService(StateRepository stateRepository) {
        this.stateRepository=stateRepository;
    }

    public Iterable<State> list() {
        return stateRepository.findAll();
    }
    public  Iterable<State> save(List<State> state) {
        return  stateRepository.saveAll(state);
    }
}
