package com.sunny.rw.server.utils;

import com.sunny.common.db.mybatis.SqlSessionCreator;
import com.sunny.rw.server.conf.ServerConf;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author Created by sunnnychan@outlook.com on 2019/1/22.
 */
public class MysqlSessionFactory {

  private static SqlSessionFactory mysqlFactory;

  /**
   * create mysql session factory.
   */
  public static synchronized SqlSessionFactory get() {
    if (mysqlFactory != null) {
      return mysqlFactory;
    }
    return SqlSessionCreator.startMySql("mysql.xml", ServerConf.getEnv());
  }
}
