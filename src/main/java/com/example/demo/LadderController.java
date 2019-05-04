package com.example.demo;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.ArrayDeque;

import javax.validation.Valid;


@RestController
@RequestMapping("/")
public class LadderController {

    @GetMapping("/ladder")
    public ModelAndView Ladder(ModelAndView modelAndView){
        try {
            modelAndView.setViewName("ladder");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return modelAndView;
    }

    @PostMapping("/ladder")
    @ResponseBody
    public Map<String,Object> Ladder(ModelAndView modelAndView, @Valid RequestVo requestVo, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            modelAndView.addObject("error",bindingResult.getFieldError().getDefaultMessage());
            modelAndView.setViewName("ladder");
            Map<String,Object> res = new HashMap<>();
            res.put("found","error");
            return res;
        }
        String start = requestVo.getStart();
        String end = requestVo.getEnd();
        try{
            WordLadder w = new WordLadder();
            Dictionary lexicon = new Dictionary("static/dictionary.txt");
            Dictionary chosen = new Dictionary();
            chosen.buildLexicon(start);
            Stack<String> ladder = new Stack<>(),result=null;
            ladder.push(start);
            ArrayDeque<Stack<String>> paths = new ArrayDeque<>();
            paths.add(ladder);
            result = w.ladder(paths,end,chosen,lexicon);
            String output = w.LadderToString(result);
            Map<String,Object> res = new HashMap<>();
            res.put("found","yes");
            res.put("ladder",output);
            return res;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            Map<String,Object> res = new HashMap<>();
            res.put("found","error");
            return res;
        }
    }
}