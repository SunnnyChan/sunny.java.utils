package com.sunny.common.db.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/*
 * Created by sunnnychan@outlook.com on 2019/1/21.
 */
public class SqlSessionCreator {
  /**
   * start mysql mybatis factory.
   */
  public static SqlSessionFactory startMySql(String configFile, String envType) {
    InputStream inputStream = null;
    try {
      inputStream = Resources.getResourceAsStream(configFile);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return new SqlSessionFactoryBuilder().build(inputStream, envType);
  }
}
