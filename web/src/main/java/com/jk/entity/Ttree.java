package com.jk.entity;

import lombok.Data;

import java.util.List;

@Data
public class Ttree {
    private Integer id;

    private String text;

    private Integer pid;

    private String href;
    private List<Ttree> nodes;
    private Boolean selectable;


}