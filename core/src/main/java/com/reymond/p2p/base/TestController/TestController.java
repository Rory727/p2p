package com.reymond.p2p.base.TestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Controller
public class TestController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/hello")
    @ResponseBody
    public String index() throws SQLException {
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
        System.out.println(dataSource);

        return "hello DataSource";
    }

}
