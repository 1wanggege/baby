package com.qf.entity;

public class Goods {
    private Integer goodsid;

    private Integer typeid;

    private String goodsname;

    private String goodsimp;

    private Integer vipprice;

    private Integer goodsprice;

    private Integer goodsflag;

    private Integer goodscount;

    private Integer commentid;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsimp() {
        return goodsimp;
    }

    public void setGoodsimp(String goodsimp) {
        this.goodsimp = goodsimp == null ? null : goodsimp.trim();
    }

    public Integer getVipprice() {
        return vipprice;
    }

    public void setVipprice(Integer vipprice) {
        this.vipprice = vipprice;
    }

    public Integer getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Integer goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getGoodsflag() {
        return goodsflag;
    }

    public void setGoodsflag(Integer goodsflag) {
        this.goodsflag = goodsflag;
    }

    public Integer getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Integer goodscount) {
        this.goodscount = goodscount;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }
}