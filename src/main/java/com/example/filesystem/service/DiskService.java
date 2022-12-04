package com.example.filesystem.service;


import com.example.filesystem.entity.FCB;

/**
 * @author WesleyGo
 * @description: 磁盘操作
 */
public interface DiskService {
    /**
     * 释放目录中所有文件占用内存（借助栈）
     *
     * @param fcb FCB
     * @return {@link Boolean}
     */
    Boolean freeDir(FCB fcb);
    /**
     * 释放文件空间 修改FAT表和位示图
     *
     * @param fcb FCB
     * @return {@link Boolean}
     */
    Boolean freeFile(FCB fcb);

    /**
     * 写入磁盘
     * 文件内容写入磁盘
     *
     * @param content   文件内容
     * @return int 返回第一块的磁盘号
     */
    int writeToDisk(String content);

    /**
     * 从头寻找空闲块
     *
     * @return int 块号
     */
    int find_empty();

}
