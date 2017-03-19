package com.wolterskluwer.gpo.ace.chatbot.apiai.webhook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/webhook")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody WebhookResponse webhook(@RequestBody String obj){

        System.out.println(obj);

        return new WebhookResponse("Hello! " + obj, "Text " + obj);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String webhook(){


        return "Hello world!";
    }
}
