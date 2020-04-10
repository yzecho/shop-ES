package io.yzecho.springbootelasticsearch.utils;

import io.yzecho.springbootelasticsearch.pojo.Content;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yzecho
 * @desc
 * @date 09/04/2020 14:24
 */
@Component
public class HtmlParseUtil {

    public List<Content> parseKeyword(String keyword) throws IOException {

        Document document = Jsoup.parse(new URL("https://search.jd.com/Search?keyword=" + keyword), 30000);
        Element element = document.getElementById("J_goodsList");
        Elements elements = element.getElementsByTag("li");

        List<Content> goodsList = new ArrayList<>();
        for (Element ele : elements) {
            String img = ele.getElementsByTag("img").eq(0).attr("source-data-lazy-img");
            String price = ele.getElementsByClass("p-price").eq(0).text();
            String name = ele.getElementsByClass("p-name").eq(0).text();
            String shop = ele.getElementsByClass("p-shop").eq(0).text();

            Content content = new Content();
            content.setName(name)
                    .setImg(img)
                    .setPrice(price)
                    .setShop(shop);
            goodsList.add(content);
        }
        return goodsList;
    }

}
