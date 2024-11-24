package com.example.demo;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller // 컨트롤러 어노테이션 명시

public class DemoController {

  @GetMapping("/") // 기본 루트 경로 처리
  public String index() {
      return "index"; // index.html 연결
  }

    @GetMapping("/hello2") // 전송 방식 GET
    public String hello2(Model model) {
      LocalDate today = LocalDate.now();
      model.addAttribute("data1", "안하서님 방갑습니다."); // model 설정
      model.addAttribute("data2", "오늘 날짜 : " + today.toString()); // model 설정
      model.addAttribute("data3", "오늘의 날씨도 매우 좋습니다"); // model 설정
      model.addAttribute("data4", "좋은하루 되세요"); // model 설정
      model.addAttribute("data5", "😊"); // model 설정
      return "hello2"; // hello.html 연결
    }

    @GetMapping("/hello") // 전송 방식 GET
    public String hello(Model model) {
      return "hello"; // hello.html 연결
    }

    @GetMapping("/about_detailed") // 전송 방식 GET
    public String about_detailed(Model model) {
      return "about_detailed"; // hello.html 연결
    }
}