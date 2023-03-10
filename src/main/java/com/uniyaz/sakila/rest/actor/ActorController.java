package com.uniyaz.sakila.rest.actor;


import com.uniyaz.sakila.core.actor.ActorConverter;
import com.uniyaz.sakila.core.actor.ActorDto;
import com.uniyaz.sakila.core.actor.domain.Actor;
import com.uniyaz.sakila.core.actor.service.ActorService;
import com.uniyaz.sakila.core.common.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/actor")
public class ActorController extends BaseController<Actor, ActorService> {

    @Autowired
    ActorService actorService;

    @Autowired
    ActorConverter actorConverter;

    @GetMapping(path = "findByName", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity findAllCountry(String name) {
        List<Actor> actorList = actorService.findAllByName(name);
        List<ActorDto> actorDtoList = actorConverter.convertToActorDtoList(actorList);
        if (!actorDtoList.isEmpty()) {
            ResponseEntity responseEntity = new ResponseEntity(actorDtoList, HttpStatus.OK);
            return responseEntity;
        } else {
            ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NO_CONTENT);
            return responseEntity;
        }
    }

}
