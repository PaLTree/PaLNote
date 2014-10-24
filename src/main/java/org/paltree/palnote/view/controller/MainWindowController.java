/*
 * PaLNote
 * https://github.com/PaLTree/PaLNote
 *
 * Copyright (c) 2014 PaLTree. All rights reserved.
 * 　Released under the Apache v2 License.
 * 　https://github.com/PaLTree/PaLNote/blob/master/LICENSE
 *
 * Created by snvx on 14/10/05.
 */
package org.paltree.palnote.view.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import org.paltree.palnote.view.window.AboutAppWindow;
import org.paltree.palnote.view.window.PreferenceWindow;

public class MainWindowController {
    @FXML private MenuItem about_app;
    @FXML private MenuItem check_updates;
    @FXML private MenuItem preferences;
    @FXML private MenuItem quit_application;
    @FXML private Button save;
    @FXML private Button undo;
    @FXML private Button redo;
    @FXML private Button copy;
    @FXML private Button console;
    @FXML private Button plugins;
    @FXML private Button settings;
    @FXML private Button help;
    @FXML private Button search;

    @FXML
    public void onAboutApp (ActionEvent event) {
        Stage aboutStage = new AboutAppWindow();
        aboutStage.show();
    }

    @FXML
    public void onPreferences (ActionEvent event) {
        Stage preferenceWindow = new PreferenceWindow();
        preferenceWindow.show();
    }

    @FXML
    public void onCheckUpdate (ActionEvent event) {

    }

    @FXML
    public void onQuitApplication (ActionEvent event) {
        Platform.exit();
    }

    @FXML
    public void onSave (ActionEvent event) {

    }

    @FXML
    public void onUndoButton (ActionEvent event) {

    }

    @FXML
    public void onRedoButton (ActionEvent event) {

    }

    @FXML
    public void onCopyButton (ActionEvent event) {

    }

    @FXML
    public void onConsoleButton (ActionEvent event) {

    }

    @FXML
    public void onHelpButton (ActionEvent event) {

    }

    @FXML
    public void onSearchButton (ActionEvent event) {

    }
}
