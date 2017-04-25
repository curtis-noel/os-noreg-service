package com.mycompany.myapp.cucumber.stepdefs;

import com.mycompany.myapp.OsnoregserviceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = OsnoregserviceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
