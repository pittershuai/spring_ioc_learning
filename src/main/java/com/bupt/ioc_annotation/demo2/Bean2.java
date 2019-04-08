package com.bupt.ioc_annotation.demo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bean2")
@Scope("prototype")
public class Bean2 {
}
