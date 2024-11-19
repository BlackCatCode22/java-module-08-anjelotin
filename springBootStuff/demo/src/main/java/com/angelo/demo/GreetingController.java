package com.angelo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public String getGreeting() {
        String myReturnMessage;
        myReturnMessage = "\n <!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Poem Page</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f0f8ff;\n" +
                "            color: #333;\n" +
                "            text-align: center;\n" +
                "            padding: 50px;\n" +
                "        }\n" +
                "        h1 {\n" +
                "            color: #4b0082;\n" +
                "            font-size: 3em;\n" +
                "            text-decoration: underline;\n" +
                "        }\n" +
                "        p {\n" +
                "            font-size: 1.5em;\n" +
                "            line-height: 1.8;\n" +
                "            margin-top: 20px;\n" +
                "        }\n" +
                "        .verse {\n" +
                "            color: #2e8b57;\n" +
                "            font-weight: bold;\n" +
                "        }\n" +
                "        .author {\n" +
                "            font-size: 1.2em;\n" +
                "            color: #8b0000;\n" +
                "            font-style: italic;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Poetry of Nature</h1>\n" +
                "    <p class=\"verse\">The sun sets slowly in the sky,</p>\n" +
                "    <p class=\"verse\">As birds above begin to fly.</p>\n" +
                "    <p>The breeze it whispers, soft and sweet,</p>\n" +
                "    <p>As flowers bloom at nature's feet.</p>\n" +
                "    <p class=\"verse\">A world of color, bright and grand,</p>\n" +
                "    <p>With endless beauty at hand.</p>\n" +
                "    <p class=\"verse\">So pause and look, and you will see,</p>\n" +
                "    <p>Nature's wonders, wild and free.</p>\n" +
                "    \n" +
                "    <p class=\"author\">- Author Unknown</p>\n" +
                "</body>\n" +
                "</html>\n\n";
        return myReturnMessage;
    }
}
