package com.orion.lesson5.elements;

import java.util.Map;

public enum ElementCollection {

    BUTTON {
        public Element getData(Map params){
            return new Button();
        }
    },

    CHECK_BOS {
        public Element getClassName (Map params) {
            return new CheckBox();
        }
    },

    TEXT_FIELD {
        public Element getClassName (Map params) {
            return new TextField();
        }
    };

    public abstract Element getClassName(Map params);

}
