package com.jk.userprovider.entity;

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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }



    public void setNodes(List<Ttree> nodes) {
        this.nodes = nodes;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public Integer getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Integer getPid() {
        return pid;
    }


    public List<Ttree> getNodes() {
        return nodes;
    }
}