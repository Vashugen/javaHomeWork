package com.orion.lesson5.elements;

import com.orion.lesson5.elements.interfaces.ButtonClickCallback;
import com.orion.lesson5.elements.interfaces.Clickable;
import com.orion.lesson5.exceptions.OutOfRangeException;

//public class Button extends Rectangle implements {
public class Button extends Element implements Clickable {

    private ButtonClickCallback callback;

    public Button(int x, int y, int height, int weight, String caption, boolean state, ButtonClickCallback callback) {
        super(x, y, height, weight, caption, state);
        this.callback = callback;
    }

    @Override
    public void click() throws OutOfRangeException {
        callback.onButtonClick();
    }


}
