package com.jldeveloper.dslist.dto;

import com.jldeveloper.dslist.entities.Game;
import org.springframework.beans.BeanUtils;


public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {

    }

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }


}
