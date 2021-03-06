package com.sunny.rw.server.modules;

import com.sunny.commom.utils.module.AbstractModule;
import com.sunny.commom.utils.thread.ThreadUtils;

/**
 * @author Created by sunnnychan@outlook.com on 2019/1/11.
 */

public class SampleModule extends AbstractModule {
  @Override
  protected void init() {
    this.name = "sample-module";
  }

  @Override
  protected void doWork() {
    do {
      System.out.println(this.name + ": do a poll print!");
      ThreadUtils.noExceptionSleep(100000);
    } while (true);
  }
}
