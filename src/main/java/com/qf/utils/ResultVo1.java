package com.qf.utils;

public class ResultVo1 {

	private int code;
	private String msg;
	private Object data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public static ResultVo1 setOK(Object data) {
		ResultVo1 rvo=new ResultVo1();
		rvo.setCode(0);
		rvo.setMsg("OK");
		rvo.setData(data);
		return rvo;
	}
	public static ResultVo1 setERROR(Object data) {
		ResultVo1 rvo=new ResultVo1();
		rvo.setCode(1);
		rvo.setMsg("ERROR");
		rvo.setData(data);
		return rvo;
	}
	
}
