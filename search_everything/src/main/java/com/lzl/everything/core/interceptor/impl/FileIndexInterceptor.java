package com.lzl.everything.core.interceptor.impl;

import com.lzl.everything.core.common.FileConvertThing;
import com.lzl.everything.core.dao.FileIndexDao;
import com.lzl.everything.core.interceptor.FileInterceptor;
import com.lzl.everything.core.model.Thing;

import java.io.File;

/**
 * 将File转换为Thing然后写入数据库
 */
public class FileIndexInterceptor implements FileInterceptor {
    
    private final FileIndexDao fileIndexDao;
    
    public FileIndexInterceptor(FileIndexDao fileIndexDao) {
        this.fileIndexDao = fileIndexDao;
    }
    
    //[转换，写入（Thing）]
    @Override
    public void apply(File file) {
        Thing thing = FileConvertThing.convert(file);
        this.fileIndexDao.insert(thing);
    }
}
