package com.jldeveloper.dslist.repositories;

import com.jldeveloper.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
