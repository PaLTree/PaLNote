/*
 * PaLNote
 * https://github.com/PaLTree/PaLNote
 *
 * Copyright (c) 2014 PaLTree. All rights reserved.
 * 　Released under the Apache v2 License.
 * 　https://github.com/PaLTree/PaLNote/blob/master/LICENSE
 *
 * Created by snvx on 14/10/09.
 */
package org.paltree.palnote.view.window;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PreferenceWindow extends Stage {

    public PreferenceWindow () {
        initModality(Modality.APPLICATION_MODAL);
        initStyle(StageStyle.DECORATED);
        setTitle("Preference");
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);
        setScene(scene);
    }
}
