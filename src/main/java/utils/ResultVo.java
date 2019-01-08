package utils;

public class ResultVo {
	private int code;
	private String msg;
	private long count;
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
	
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public static ResultVo setOK(Object data,int count) {
		ResultVo rvo=new ResultVo();
		rvo.setCode(0);
		rvo.setMsg("OK");
		rvo.setCount(count);
		rvo.setData(data);
		return rvo;
	}
	public static ResultVo setERROR() {
		ResultVo rvo=new ResultVo();
		rvo.setCode(1);
		rvo.setMsg("ERROR");
		rvo.setCount(-1);
		return rvo;
	}
	
	
	
}
