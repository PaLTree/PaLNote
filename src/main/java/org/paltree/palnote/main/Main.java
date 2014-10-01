/**
 * PaLNote
 * https://github.com/PaLTree/PaLNote
 *
 * Copyright (c) 2014 PaLTree. All rights reserved.
 * 　Released under the Apache v2 License.
 * 　https://github.com/PaLTree/PaLNote/blob/master/LICENSE
 *
 * Created by snvx on 14/09/24.
 */
package org.paltree.palnote.main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        HBox root = new HBox();
        Scene scene = new Scene(root, 800, 600);

        stage.setTitle("PaLNote");
        stage.setScene(scene);
        stage.show();
    }
}
