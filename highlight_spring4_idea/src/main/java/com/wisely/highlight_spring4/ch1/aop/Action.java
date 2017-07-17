package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by 307lab-1 on 2017/7/16.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
