package com.company.speedypizzaapp.web;

import com.haulmont.cuba.gui.components.AbstractMainWindow;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.mainwindow.FtsField;

import javax.inject.Inject;
import java.util.Map;


public class ExtAppMainWindow extends AbstractMainWindow {
    @Inject
    private FtsField ftsField;

    @Inject
    private Image logoImage;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        initLayoutAnalyzerContextMenu(logoImage);
        initLogoImage(logoImage);
        initFtsField(ftsField);
    }
}