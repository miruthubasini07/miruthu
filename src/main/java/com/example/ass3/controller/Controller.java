package com.example.ass3.controller;

import com.example.ass3.entity.*;
import com.example.ass3.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RequestMapping("/s")
public class Controller {

    @Autowired
    StateService stateService;
    @Autowired
    CoverageService coverageService;
    @Autowired
    Policyservice policyservice;
    @Autowired
            StatusService statusService;
    @Autowired
    RateService rateService;

    State state;

    @GetMapping("/start")
    public String start() {
    return "policy";
    }

    @GetMapping("/createPolicy")
    public String createpolicy(Model model){
        Policy policy=new Policy();

        policy.setStatus(statusService.getStatusByID(1));
        policyservice.savePolicy(policy);
        model.addAttribute("Policy", policy);
        model.addAttribute("states",stateService.grtallState());
        model.addAttribute("coverage",coverageService.getallCoverage());

        return "newPolicy";

    }
    @PostMapping("/savedetails")
    public String Savedetails(@ModelAttribute Policy policy , @RequestParam("selectredState[]") String selectredState[], @RequestParam("selectredCoverage[]") String selectredCoverage[],@RequestParam String s){
        for(String state: selectredState) {
            int stateid = Integer.parseInt(state);
            State state1=stateService.getstateById(stateid);
            policy.setState(state1);
        }
        for(String Coverage : selectredCoverage)
        {
            Coverage coverage1 = coverageService.findByid(Integer.parseInt(Coverage));//stateService.getstateById(Integer.parseInt(State));
            policy.getCoverageList().add(coverage1);
        }

        policy.setStatus(statusService.getStatusByID(Integer.parseInt(s)));



        policyservice.savePolicy(policy);



return "rate";
     //return "redirect:/start/rate"+policy.getId();
    }

    @GetMapping("/view")
    public String view(Model model)
    {
       return " ";
    }

    @GetMapping("/rate")
    public String rate(Model model,@RequestParam int id)
    {
        Policy policy =  policyservice.getPolicyById(id);
        policy.getState();
        policy.getCoverageList();
        return "";
    }






}
