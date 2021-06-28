package com.taoji666.gataway.filter;

import com.taoji666.gataway.service.GetUserService;
import io.netty.handler.codec.http.cookie.Cookie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    @Resource
    private GetUserService getUserService; //通过这个来获取各个部门的员工ID，密码，进行登录验证
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = (ServerHttpRequest) exchange.getRequest(); //获取请求参数
        ServerHttpResponse response = (ServerHttpResponse) exchange.getResponse();
        String method = request.getMethodValue(); //获取请求方式 POST 还是 METHOD

        request.getCookie


        if("POST".equals(method)){
            //如果是POST请求


            String userID = request.getParameter("userID"); //获取账户名
            String password = request.getParameter("password");//获取用户密码
            String dept = request.getParameter("Dept");//获取用户所在部门

            switch (dept) {   //验证各个部门员工账号密码，如果没问题，则添加进session并下一步
                case "maintenance": {  //是否是维修中心员工
                    List<Emp> maintenUsers = getUserService.getMaintenUser(); //获取所有维修中心员工
                    List<String> userNames = maintenUsers.stream().map(p-> p.yuanGongId()).collect(Collectors.toCollection());
                    boolean userExist = userNames.contains(userID); //判断员工中是否存在这个用户
                    if (userExist = true){
                      HttpSession session = request.getSession();
                      String sessionId = session.getId();


                        return chain.filter(exchange);

                    }
                }


                }
                case "foc": {   //是否是运控中心员工

                }
                case "airSpare": { //是否是航材中心员工

                }
                case "hr": {  //是否是人力资源员工

                }
                case "tg": {  //是否是技术组员工

                }
                case "ppc": { //是否是生成计划员工

                }

            }



    }

    public boolean verify(String userID){
        getUserService.
    }




    /**
     * 这里的返回值决定拦截器的优先级，数字越小越先被触发，支持负数
     */
    @Override
    public int getOrder() {
        return 0;
    }
    
    
}
