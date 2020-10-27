package com.jk.entity;

import lombok.Data;

import java.util.List;

@Data
public class tbtree {
    private Integer id;

    private String text;

    private String herf;

    private Integer pid;
    private List<tbtree> nodes;
    private Boolean selectable;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setHerf(String herf) {
        this.herf = herf;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<tbtree> getNodes() {
        return nodes;
    }

    public void setNodes(List<tbtree> nodes) {
        this.nodes = nodes;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getHerf() {
        return herf;
    }

    public Integer getPid() {
        return pid;
    }


    public Boolean getSelectable() {
        return selectable;
    }
}