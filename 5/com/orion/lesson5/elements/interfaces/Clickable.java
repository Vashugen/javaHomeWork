package com.orion.lesson5.elements.interfaces;

import com.orion.lesson5.exceptions.OutOfRangeException;
import com.orion.lesson5.exceptions.ReadOnlyException;

public interface Clickable {

    void click() throws ReadOnlyException, OutOfRangeException;
}
