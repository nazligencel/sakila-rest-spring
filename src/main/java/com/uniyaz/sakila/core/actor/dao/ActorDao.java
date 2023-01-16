package com.uniyaz.sakila.core.actor.dao;

import com.uniyaz.sakila.core.actor.domain.Actor;
import com.uniyaz.sakila.core.common.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorDao extends BaseRepository<Actor> {
    @Query("select actor from Actor actor where actor.firstName = :firstName")
    public List<Actor> findAllByName(@Param("firstName") String firstName);
    
}
