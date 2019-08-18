package Config;

import Play.PrincessRepository;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

/**
 * @author lxy
 * @version 1.0
 * @date 2019/8/17 9:44
 */
@Configuration
public class DBConfig {
    //    @Bean
//    public JndiObjectFactoryBean dataSource()
//    {
//        JndiObjectFactoryBean jndiObjectFB=new JndiObjectFactoryBean();
//        jndiObjectFB.setJndiName("jdbc/lifeDB");
//        jndiObjectFB.setResourceRef(true);
//        jndiObjectFB.setProxyInterface(javax.sql.DataSource.class);
//        return jndiObjectFB;
//    }
//    @Bean
//    public LocalEntityManagerFactoryBean entityManagerFactoryBean() {
//        LocalEntityManagerFactoryBean factoryBean=new LocalEntityManagerFactoryBean();
//        factoryBean.setPersistenceUnitName("princessPU");
//        return factoryBean;
//    }
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) {
        LocalContainerEntityManagerFactoryBean managerFactoryBean=new LocalContainerEntityManagerFactoryBean();
        managerFactoryBean.setDataSource(dataSource);
        managerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        return managerFactoryBean;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/harem");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter=new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setGenerateDdl(false);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
        return adapter;
    }

    @Bean
    public BeanPostProcessor persistenceTranslation() {
        return new PersistenceExceptionTranslationPostProcessor();
    }

//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource)
//    {
//        return new JdbcTemplate(dataSource);
//    }
//    @Bean
//    public NamedParameterJdbcTemplate jdbcTemplate(DataSource dataSource)
//    {
//        return new NamedParameterJdbcTemplate(dataSource);
//    }
//    @Bean
//    public PrincessRepository princessRepository(JdbcTemplate jdbcTemplate) {
//        return new PrincessRepository(jdbcTemplate);
//    }

//    @Bean
//    public DataSource dataSource()
//    {
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                .addScript("classpath:init.sql")
//                .build();
//    }
}
