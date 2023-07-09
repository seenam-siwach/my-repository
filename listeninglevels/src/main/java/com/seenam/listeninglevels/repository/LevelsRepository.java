package com.seenam.listeninglevels.repository;

import com.seenam.listeninglevels.entity.Levels;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("http://localhost:4200")
public interface LevelsRepository extends CrudRepository<Levels, Long> {
    public List<Levels> findAllByUserName(String userName);
}
