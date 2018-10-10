package com.example.time.service.Impl;

import com.example.time.dao.WriterRepository;
import com.example.time.entity.Writer;
import com.example.time.service.WriterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xuj on 2018/9/20.
 */
@Service
public class WriterServiceImpl implements WriterService {
    @Resource
    private WriterRepository writerRepository;
    @Override
    public void addWriter(Writer writer) {

    }

    @Override
    public Writer getWriter() {
        return writerRepository.findById(1).get();
    }
}
