package com.orion.lesson5.elements.interfaces;

import com.orion.lesson5.exceptions.OutOfRangeException;

public interface ButtonClickCallback {

    void onButtonClick() throws OutOfRangeException;

}
