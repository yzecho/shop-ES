package io.yzecho.springbootelasticsearch.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author yzecho
 * @desc
 * @date 09/04/2020 16:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Content {
    private String name;
    private String img;
    private String price;
    private String shop;
}
