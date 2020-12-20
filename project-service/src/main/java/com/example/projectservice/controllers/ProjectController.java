package com.example.projectservice.controllers;


import com.example.projectservice.models.Project;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @RequestMapping(method = RequestMethod.GET, value = "/project", produces = "application/json")
    public Project GetProject() {
        Project project = new Project();
        project.setDescription("popis");
        project.setOwner("Ja");

        return project;
    }


}
