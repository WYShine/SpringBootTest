package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by 307lab-1 on 2017/7/16.
 */
@Service
public class DemoAnnotationService {
    @Action(name="ע��ʽ���ص�add����")
    public void add(){}
}
