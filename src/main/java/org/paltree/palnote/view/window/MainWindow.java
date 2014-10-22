/**
 * PaLNote
 * https://github.com/PaLTree/PaLNote
 *
 * Copyright (c) 2014 PaLTree. All rights reserved.
 * 　Released under the Apache v2 License.
 * 　https://github.com/PaLTree/PaLNote/blob/master/LICENSE
 *
 * Created by snvx on 14/10/01.
 */
package org.paltree.palnote.view.window;

import javafx.application.Platform;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * MainWindowClass
 */
public class MainWindow extends Stage {
    public MainWindow() {
        final VBox vBox = new VBox();
        //メニューバー
        MenuBar menuBar = new MenuBar();
        menuBar.isUseSystemMenuBar();

        Menu menuPaLNote = new Menu("PaLNote");
        MenuItem aboutApp = new MenuItem("About PaLNote");
        aboutApp.setOnAction((event) -> {
                    Stage aboutStage = new AboutAppWindow();
                    aboutStage.show();
                }
        );
        MenuItem checkUpdate = new MenuItem("Check for Updates");
        MenuItem preferences = new MenuItem("Preferences...");
        preferences.setOnAction((event) -> {
                    Stage preferenceWindow = new PreferenceWindow();
                    preferenceWindow.show();
                }
        );
        MenuItem quitApplication = new MenuItem("QuitApplication");
        quitApplication.setOnAction((event) -> Platform.exit());

        menuPaLNote.getItems().addAll(aboutApp, checkUpdate, preferences, quitApplication);

        Menu menuFile = new Menu("File");
        MenuItem newFolder = new MenuItem("NewFolder");
        MenuItem openFolder = new MenuItem("OpenFolder");
        MenuItem newFile = new MenuItem("NewFile");

        menuFile.getItems().addAll(newFolder, openFolder, newFile);

        Menu menuEdit = new Menu("Edit");

        Menu menuView = new Menu("View");
        Menu menuCode = new Menu("Code");
        menuBar.getMenus().addAll(menuPaLNote, menuFile, menuEdit, menuView, menuCode);

        TabPane tabPane = new TabPane();
        Tab tab = new Tab();
        tab.setGraphic(new ImageView("@../images/programming_language/js.png"));
        HBox hBox = new HBox();
        hBox.getChildren().add(new TextArea());
        tab.setContent(hBox);
        tabPane.getTabs().addAll(tab);

        vBox.getChildren().addAll(tabPane);

    }
}
