/*
 * Copyright (C) 2013 Brett Wooldridge
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zaxxer.hikari.proxy;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.zaxxer.hikari.HikariPool;

/**
 * Injected proxy factory class.
 *
 * @author Brett Wooldridge
 */
public final class ProxyFactory
{
    public static Connection getProxyConnection(HikariPool pool, Connection connection, int defaultIsolationLevel)
    {
        // Body is injected by JavassistProxyFactory
        return null;
    }

    static Statement getProxyStatement(ConnectionProxy connection, Statement statement)
    {
        // Body is injected by JavassistProxyFactory
        return null;
    }

    static CallableStatement getProxyCallableStatement(ConnectionProxy connection, CallableStatement statement)
    {
        // Body is injected by JavassistProxyFactory
        return null;
    }

    static PreparedStatement getProxyPreparedStatement(ConnectionProxy connection, PreparedStatement statement)
    {
        // Body is injected by JavassistProxyFactory
        return null;
    }

    static ResultSet getProxyResultSet(StatementProxy statement, ResultSet resultSet)
    {
        // Body is injected by JavassistProxyFactory
        return null;
    }
}
