package com.wisely.highlight_spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by 307lab-1 on 2017/7/16.
 */
@Service
public class DemoService {
    @Value("�����������")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
