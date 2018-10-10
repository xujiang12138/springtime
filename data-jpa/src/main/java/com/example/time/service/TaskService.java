package com.example.time.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuj on 2018/10/6.
 */
@Service
//@Async
public class TaskService {
    @Autowired
    private MailService mailService;


    /**
     * 表示每隔6秒发送一次邮件
     */
//    @Scheduled(cron = "*/6 * * * *  ?")
//    public void proces(){
//        mailService.sendMail("815835155@qq.com","简单邮件","lalalalalalalaal");
//        System.out.println("111");
//
//    }


//    @Scheduled(fixedDelayString="5000")
//    public void delayLoop(){
//        LocalDateTime localDateTime = LocalDateTime.now();
//        String timeString = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        System.out.println(Thread.currentThread().getName()+"延迟5秒运行一次 :"+ timeString);
//    }
//
//    @Scheduled(fixedRate=1000)
//    public void delayLoop1(){
//        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMddhhmmss");
//        System.out.println(Thread.currentThread().getName()+"每秒运行一次 :"+ dateFormat.format(new Date()));
//
//    }
//    @Scheduled(cron = "0,1,2,3,4,5,6 * * * * MON-SAT")//每分钟的前面0,1,2,3,4,5,6秒都执行一次
//    public void runTask() {
//
//
//        System.out.println("定时每分钟的前6秒发送推报 :" + new Date());
//    }

//    @Scheduled(fixedRate=1000)
//    public void delayLoop(){
//        System.out.println("每秒运行一次 :"+ dateFormat().format (new Date ()));
//
//    }

}
