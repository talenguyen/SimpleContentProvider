package com.talenguyen.simplecontentprovider.dbtable;

/**
 *
 * @author giangnguyen
 *
 */
public class UriMatched {

    public static final int UNKNOW_ID = -1;

    private long            id;

    private String          tableName;

    public UriMatched(long id, String tableName) {
        this.id = id;
        this.tableName = tableName;
    }

    public long getId() {
        return id;
    }

    public String getTableName() {
        return tableName;
    }
}
