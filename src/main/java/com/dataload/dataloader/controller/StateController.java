package com.dataload.dataloader.controller;

import com.dataload.dataloader.domain.State;
import com.dataload.dataloader.service.StateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class StateController {

    private StateService stateService;

    public StateController(StateService stateService) {
        this.stateService = stateService;
    }

    @GetMapping("/list")
    public Iterable<State> list() {
        return stateService.list();
    }
}


