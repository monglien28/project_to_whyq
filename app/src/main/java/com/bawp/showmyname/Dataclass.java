package com.bawp.showmyname;

public class Dataclass {
    private String status;
    private String OTP;

    public Dataclass() {
    }

    public Dataclass(String status, String OTP) {
        this.status = status;
        this.OTP = OTP;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOTP() {
        return OTP;
    }

    public void setOTP(String OTP) {
        this.OTP = OTP;
    }
}
