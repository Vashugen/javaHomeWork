//TODO как сгенерироваь класс "на лету"
/*
package com.orion.lesson5.elements;

public enum ElementCollection {

    BUTTON {
        public Class<Element> getClassName(){
            return Button::getButtonClass();
        }
        Class<?> clazz = Class.forName("com.foo.MyClass");
    },

    CHECK_BOS {
        public Class<Button> getClassName () {
            return CheckBox::getClass();
        }
    },

    TEXT_FIELD {
        public Class<T> getClassName () {
            return toString(TextField::getClass());
        }
    };

    public abstract Class<Element> getClassName();

}

    Class<?> clazz = Class.forName("com.foo.MyClass");
    Constructor<?> constructor = clazz.getConstructor(String.class, Integer.class);
    Object instance = constructor.newInstance("stringparam", 42);*/
