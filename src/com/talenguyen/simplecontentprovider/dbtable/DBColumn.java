package com.talenguyen.simplecontentprovider.dbtable;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

/**
 *
 * @author giangnguyen
 *
 */
public class DBColumn {

    private StringBuilder mStringBuilder;

	/**
	 * Constructor of DBColumn object.
	 *
	 * @param name
	 *            column's name
	 * @param type
	 *            the {@link DataType} supported by {@link SQLiteDatabase}
	 * @param extraInfo
	 *            the extra information for the column. e.g.
	 *            <code>PRIMARY KEY AUTOINCREMENT...</code>
	 */
	public DBColumn(String name, DataType type, String extraInfo) {
		mStringBuilder = new StringBuilder();
		mStringBuilder.append(name + " " + type.toString());
		if (!TextUtils.isEmpty(extraInfo)) {
			mStringBuilder.append(" " + extraInfo);
		}
	}

	@Override
	public String toString() {
		return mStringBuilder.toString();
	}
}
