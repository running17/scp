package com.example.scp.client;

import java.io.File;

public class ScpTest {

    public static void main(String[] args) {
        String ip = "192.168.1.166";
        int port = 22;
        String name = "running";
        String password = "123456";
        ScpClient scpClient = ScpClient.getInstance(ip,port,name,password);
        File f = new File("G:/excel/1530007200125.xls");
        System.out.println(f);
        scpClient.uploadFile( f, f.length(),"/home/running/下载/",null);
        scpClient.downloadFile("abc.xls","/home/running/下载/","G:/download/");
    }

}
