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
    public Integer getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(Integer materialsId) {
        this.materialsId = materialsId;
    }

    public String getMaterialsName() {
        return materialsName;
    }

    public void setMaterialsName(String materialsName) {
        this.materialsName = materialsName == null ? null : materialsName.trim();
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }

    public Integer getMaterialsType() {
        return materialsType;
    }

    public void setMaterialsType(Integer materialsType) {
        this.materialsType = materialsType;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMaterialsStatus() {
        return materialsStatus;
    }

    public void setMaterialsStatus(Integer materialsStatus) {
        this.materialsStatus = materialsStatus;
    }
}