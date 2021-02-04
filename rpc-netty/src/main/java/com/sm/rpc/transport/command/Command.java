package com.sm.rpc.transport.command;

/**
 * @project rpc-netty
 * @description:
 * @author: liumeng
 * @create: 2021-02-04 11:29
 */

public class Command {
    protected Header header;
    private byte[] payload;

    public Command(Header header, byte[] payload) {
        this.header = header;
        this.payload = payload;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public byte[] getPayload() {
        return payload;
    }

    public void setPayload(byte[] payload) {
        this.payload = payload;
    }
}
