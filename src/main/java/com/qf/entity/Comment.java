package com.qf.entity;

public class Comment {
    private Integer commentid;

    private Integer userid;

    private String txt;

    private String imp;

    private Integer goodsid;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt == null ? null : txt.trim();
    }

    public String getImp() {
        return imp;
    }

    public void setImp(String imp) {
        this.imp = imp == null ? null : imp.trim();
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }
}