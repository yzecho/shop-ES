package io.yzecho.springbootelasticsearch;

import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class SpringbootElasticsearchApplicationTests {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    /**
     * 创建索引
     *
     * @throws IOException
     */
    @Test
    void testCreateIndex() throws IOException {
        CreateIndexRequest index = new CreateIndexRequest("shop_goods");

        CreateIndexResponse response = restHighLevelClient.indices().create(index, RequestOptions.DEFAULT);

        System.out.println(response);
    }

    /**
     * 判断索引是否存在
     *
     * @throws IOException
     */
    @Test
    void testIsExistIndex() throws IOException {
        GetIndexRequest request = new GetIndexRequest("yzecho_index");
        boolean exists = restHighLevelClient.indices().exists(request, RequestOptions.DEFAULT);
        System.out.println(exists);
    }

    @Test
    void testAddDocument() {
        IndexRequest request = new IndexRequest("yzecho_index");
        request.id("1");
    }

}
