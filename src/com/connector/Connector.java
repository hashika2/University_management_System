package com.connector;

import java.sql.Connection;
import java.sql.SQLException;

public interface Connector {
    public Connection connect() throws ClassNotFoundException, SQLException;
}
