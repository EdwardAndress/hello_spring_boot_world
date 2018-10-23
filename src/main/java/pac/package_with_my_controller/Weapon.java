package pac.package_with_my_controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Weapon {
    public String vs(Weapon weapon) {

        String result = null;
        Method method = null;
        try {
            method = weapon.getClass().getMethod("rock");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            result = String.valueOf(method.invoke(weapon));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return result;
    }
}
