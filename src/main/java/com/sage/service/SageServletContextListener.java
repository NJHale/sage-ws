package com.sage.service;

import com.sage.dao.Dao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SageServletContextListener implements ServletContextListener{

    private static final Logger logger = LogManager.getLogger(SageServletContextListener.class);

    // Store all site wide variables here

    public static SessionFactory sessionFactory;

    /**
     * Clean up service
     * @param arg0
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        logger.info("ServletContextListener destroyed");
        // close the hibernate session factory
        sessionFactory.close();
    }

    /**
     * Initialize all database connections and the JobMonitor service
     * @param arg0
     */
    public void contextInitialized(ServletContextEvent arg0) {
        logger.info("ServletContextListener started");
        // construct the session factory for
        Configuration configuration = new Configuration();
        configuration.configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
        // test open and test close a session
        logger.info("Hibernate SessionFactory successfully built");
    }
}