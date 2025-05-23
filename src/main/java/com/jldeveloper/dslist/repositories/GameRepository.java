package com.jldeveloper.dslist.repositories;

import com.jldeveloper.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
