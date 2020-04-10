package io.yzecho.springbootelasticsearch.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author yzecho
 * @desc
 * @date 09/04/2020 17:00
 */
public interface ContentService {

    /**
     * 解析数据放入es索引中
     *
     * @param keywords
     * @return
     */
    Boolean parseContent(String keywords) throws IOException;

    /**
     * 获取数据实现搜索功能
     *
     * @param keywords
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Map<String, Object>> searchByPage(String keywords, int pageNo, int pageSize) throws IOException;


    /**
     * 搜索结果关键字高亮
     *
     * @param keywords
     * @param pageNo
     * @param pageSize
     * @return
     * @throws IOException
     */
    List<Map<String, Object>> searchByPageHighLight(String keywords, int pageNo, int pageSize) throws IOException;

}
