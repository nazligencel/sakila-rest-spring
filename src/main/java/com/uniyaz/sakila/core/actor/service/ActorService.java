package com.uniyaz.sakila.core.actor.service;

import com.uniyaz.sakila.core.actor.dao.ActorDao;
import com.uniyaz.sakila.core.actor.domain.Actor;
import com.uniyaz.sakila.core.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ActorService extends BaseService<Actor,ActorDao> {

    @Autowired
    ActorDao actorDao;

    public List<Actor> findAllByName(String firstName) {
        return actorDao.findAllByName(firstName);
    }

}
