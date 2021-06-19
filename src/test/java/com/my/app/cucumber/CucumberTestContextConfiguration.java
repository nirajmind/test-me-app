package com.my.app.cucumber;

import com.my.app.HelpmeApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = HelpmeApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
