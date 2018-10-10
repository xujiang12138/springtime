package com.example.time.service.Impl;

import com.example.time.dao.TextRepository;
import com.example.time.entity.Text;
import com.example.time.service.TextService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xuj on 2018/9/20.
 */
@Service
public class TextServiceImpl implements TextService{
    @Resource
    private TextRepository textRepository;
    @Override
    public void addText(Text text) {

    }

    @Override
    public List<Text> getTexts() {
        return textRepository.findAll();
    }

    @Override
    public Text getText(int id) {
        return textRepository.findById(id).get();
    }
}
