package com.example.kafka.models;

public class Message {
    private Integer id;
    private String name;
    private String data;
    private byte[] bytePayload;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public byte[] getBytePayload() {
        return bytePayload;
    }

    public void setBytePayload(byte[] bytePayload) {
        this.bytePayload = bytePayload;
    }
}
