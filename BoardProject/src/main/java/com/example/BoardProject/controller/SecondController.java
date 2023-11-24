package com.example.BoardProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("/random-quote")
    public String randomQuote(Model model) {

        String[] quotes = {
                "큰 목표를 이루고 싶으면 허락을 구하지 마라. " + "미상",
                "상황을 가장 잘 활용하는 사람이 가장 좋은 상황을 맞는다. " + "존 우든",
                "일반적인 것을 잃을 위험을 감수하지 않으면 평범한 것에 만족해야 한다. " + "짐 론",
                "열정을 잃지 않고 실패에서 실패로 걸어가는 것이 성공이다. " + "윈스턴 처칠",
                "성공한 사람이 되려고 노력하기보다 가치있는 사람이 되려고 노력하라. " + "알버트 아인슈타인"
        };

        int randInt = (int) (Math.random() * quotes.length);
        model.addAttribute("randomQuote", quotes[randInt]);
        return "quote";
    }
}
