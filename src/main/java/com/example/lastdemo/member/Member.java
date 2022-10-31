package com.example.lastdemo.member;

import javax.persistence.*;

//@AllArgsConstructor 생성자 역할의 어노테이션
//@Getter Getter 역할의 어노테이션
@Entity
public class Member {
    @Id
    @PrimaryKeyJoinColumn
    private String mID;
    private String mPW;
    private String name;
    private String address;

    public String getmID() {
        return mID;
    }

    public String getmPW() {
        return mPW;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public void setmPW(String mPW) {
        this.mPW = mPW;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
