package com.example.time.service;

/**
 * Created by xuj on 2018/10/7.
 */
public interface MailService {
    /**
     * 发送简单邮件
     */
    void sendMail(String to,String subject,String content);

}
