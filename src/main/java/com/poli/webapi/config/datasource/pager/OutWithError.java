package com.poli.webapi.config.datasource.pager;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class OutWithError {
    protected final APIError err = new APIError();
    public OutWithError setErrorCode(int code)
    {
        this.err.setCode(code);
        return this;
    }
    public OutWithError setMsg(String msg)
    {
        this.err.setMsg(msg);
        return this;
    }
    
    public APIError getErr()
    {
        return this.err;
    }

    public class APIError {
        private int code = 0;
        private String msg = "正常";
        private String eventId = "";
        public int getCode() {
            return code;
        }
        public void setCode(int code) {
            this.code = code;
            this.setMsg("Constance.getErrorMessage(code)");
        }
        public String getMsg() {
            return msg;
        }
        public void setMsg(String msg) {
            this.msg = msg;
        }
        public String getEventId() {
            return eventId;
        }
        public void setEventId(String eventId) {
            this.eventId = eventId;
        }
    }
}
