package com.sergii.shutyi;

import com.sergii.shutyi.model.Model;
import com.sergii.shutyi.view.View;
import com.sergii.shutyi.сontroller.Controller;


public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
}
