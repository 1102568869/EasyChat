package tech.washmore.games.easychat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Washmore
 * @version V1.0
 * @summary TODO
 * @Copyright (c) 2017, Lianjia Group All Rights Reserved.
 * @since 2017/7/12
 */
@Controller
public class ChatController {
    @RequestMapping({"/", ""})
    public ModelAndView chat(ModelAndView mav) {
        mav.setViewName("/chat");
        return mav;
    }
}
