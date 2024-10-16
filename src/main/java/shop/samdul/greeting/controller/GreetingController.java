package shop.samdul.greeting.controller; // 이건 결국 경로임

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.Stack;

@Controller
public class GreetingController {
    Stack<String> names = new Stack<>();
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="HI") String name, Model model) {
            names.push(name);
            model.addAttribute("names", names);
            return "greeting";
    }
    private Stack<People> nns = new Stack<>();
    @GetMapping("/people")
    public String pgreeting(@RequestParam(name="name", required=false, defaultValue="Kim") String name, Model model) {
            People p = new People(); // 폴더 위치가 같으면 상속 없이 사용가능
            p.num = nns.size()+1; // Stack의 크기로 순번 측정
            p.name = name;
            nns.push(p); // nns 스택에 [p.num, p.name]을 삽입
            model.addAttribute("nns", nns);
            return "people";
    }
}