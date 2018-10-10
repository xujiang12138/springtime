package com.example.time.service;

import com.example.time.entity.Text;

import java.util.List;

/**
 * Created by xuj on 2018/9/20.
 */
public interface TextService {
    void addText(Text text);
    List<Text> getTexts();
    Text getText(int id);
}
