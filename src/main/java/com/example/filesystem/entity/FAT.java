package com.example.filesystem.entity;

import java.io.Serializable;

/**
 * @author WesleyGo
 * @description: 文件分配表
 */
public class FAT implements Serializable {
    private int bitmap; //位示图 0表示空闲 1表示占用
    private int id; //当前盘块号
    private int nextId; //指向下一盘块号

    public FAT(int bitmap, int id, int nextId) {
        this.bitmap = bitmap;
        this.id = id;
        this.nextId = nextId;
    }

    public FAT() {
    }

    public int getBitmap() {
        return bitmap;
    }

    public void setBitmap(int bitmap) {
        this.bitmap = bitmap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }
}
