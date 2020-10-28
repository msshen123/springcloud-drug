package com.jk.entity;

import lombok.Data;

@Data
public class kmaterials {
    private Integer materialsId;

    private String materialsName;

    private String thumb;

    private Integer materialsType;

    private Long price;

    private Integer count;

    private Integer materialsStatus;
    private Integer remaincount;

}