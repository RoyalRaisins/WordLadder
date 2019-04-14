package com.example.demo;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.Stack;
import java.util.ArrayDeque;

import javax.validation.Valid;


@RestController
@RequestMapping("/")
public class LadderController {

    @GetMapping("/ladder")
    public ModelAndView Ladder(ModelAndView modelAndView){
        modelAndView.setViewName("ladder");
        return modelAndView;
    }

    @PostMapping("/ladder")
    public ModelAndView Ladder(ModelAndView modelAndView, @Valid RequestVo requestVo, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            modelAndView.addObject("error",bindingResult.getFieldError().getDefaultMessage());
            modelAndView.setViewName("ladder");
            return modelAndView;
        }
        String path = requestVo.getPath();
        String start = requestVo.getStart();
        String end = requestVo.getEnd();
        try{
            WordLadder w = new WordLadder();
            Dictionary lexicon = new Dictionary(path);
            Dictionary chosen = new Dictionary();
            chosen.buildLexicon(start);
            Stack<String> ladder = new Stack<>(),result=null;
            ladder.push(start);
            ArrayDeque<Stack<String>> paths = new ArrayDeque<>();
            paths.add(ladder);
            result = w.ladder(paths,end,chosen,lexicon);
            String output = w.LadderToString(result);
            modelAndView.addObject("ladderString",output);
            modelAndView.setViewName("ladder");
            System.out.println(modelAndView.toString());
            return modelAndView;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("nmsl");
        return modelAndView;
    }
}