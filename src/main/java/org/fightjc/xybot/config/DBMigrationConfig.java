package org.fightjc.xybot.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.fightjc.xybot.pojo.DBMigrationTable;
import org.fightjc.xybot.util.BotUtil;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.sqlite.javax.SQLiteConnectionPoolDataSource;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Configuration
@MapperScan(basePackages = "org.fightjc.xybot.dao")
public class DBMigrationConfig {

    @Autowired
    DataSource dataSource;

    @Bean(name="sqliteDataSource")
    public DataSource sqliteDataSource() {
        SQLiteConnectionPoolDataSource pool = new SQLiteConnectionPoolDataSource();
        pool.setUrl("jdbc:sqlite:" + BotUtil.getDBFilePath());
        return pool;
    }

    @Bean
    public SqlSessionFactory sqliteSqlSessionFactory(@Qualifier("sqliteDataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory
                .setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        return sessionFactory.getObject();
    }

    @Bean(name="dbMigrationTableList")
    public List<DBMigrationTable> getDBMigrationTables() {
        List<DBMigrationTable> tables = new ArrayList<>();

        // migration demo
//        String remark = "init";
//        List<String> sqlList = new ArrayList<>();
//        String sql = "";
//        sqlList.add(sql);
//        DBMigrationTable table = new DBMigrationTable(0, remark, sqlList);
//        tables.add(table);

        return tables;
    }
}
