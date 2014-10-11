/**
 * PaLNote
 * https://github.com/PaLTree/PaLNote
 *
 * Copyright (c) 2014 PaLTree. All rights reserved.
 * 　Released under the Apache v2 License.
 * 　https://github.com/PaLTree/PaLNote/blob/master/LICENSE
 *
 * Created by snvx on 14/10/07.
 */
package org.paltree.palnote.view.window;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Calendar;
import java.util.Properties;

public class AboutAppWindow extends Stage {

    public AboutAppWindow() {
        initModality(Modality.APPLICATION_MODAL);
        initStyle(StageStyle.UTILITY);
        setTitle("About PaLNote");
        setResizable(false);

        VBox vbox = new VBox();

        Label lab1 = new Label("PaLNote");
        lab1.setStyle("-fx-font-size: 20pt;");
        vbox.getChildren().add(lab1);

        Label lab3 = new Label("Copyright (c) " + Calendar.getInstance().get(Calendar.YEAR) + " PaLTree. All rights reserved.");
        vbox.getChildren().add(lab3);

        Properties properties = System.getProperties();
        String javaVersion = properties.getProperty("java.runtime.version", properties.getProperty("java.version", "unknown"));
        String arch = properties.getProperty("os.arch", "");

        String vmVersion = properties.getProperty("java.vm.name", "unknown");
        String vmVendor = properties.getProperty("java.vendor", "unknown");

        Label lab4 = new Label("JRE: " + javaVersion + " " + arch);
        vbox.getChildren().add(lab4);

        Label lab5 = new Label("JVM: " + vmVersion + " " + vmVendor);
        vbox.getChildren().add(lab5);

        Button but1 = new Button("Close");
        vbox.getChildren().add(but1);
        but1.setOnAction((event) -> hide());

        Scene scene = new Scene(vbox);
        setScene(scene);
    }
}
