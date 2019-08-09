package com.lzl.search_everything.core.search;

import com.lzl.search_everything.core.dao.DataSourceFactory;
import com.lzl.search_everything.core.dao.impl.FileIndexDaoImpl;
import com.lzl.search_everything.core.model.Condition;
import com.lzl.search_everything.core.model.Things;
import com.lzl.search_everything.core.search.impl.FileSearchImpl;


import java.util.List;

/**
 * 根据Condition条件进行数据库检索
 */
public interface FileSearch {

    List<Things> search(Condition condition);

}
