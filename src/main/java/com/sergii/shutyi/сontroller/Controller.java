package com.sergii.shutyi.сontroller;

import com.sergii.shutyi.model.Model;
import com.sergii.shutyi.view.View;

public class Controller {
    Model model;
    View view;

    // Constructor
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
}
