package pac.package_with_my_controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Weapon {


    int a = 1;

    public String vs(Weapon weapon) {

        Method method = getMethod(weapon);
        return invokeMethod(method);

    }

    private Method getMethod(Weapon weapon) {
        Method method = null;
        String methodName = weapon.getClass().getSimpleName().toLowerCase();

        try {
            method = this.getClass().getMethod(methodName);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        return method;
    }

    private String invokeMethod(Method method) {
        String result = null;

        try {

            result = String.valueOf(method.invoke(this));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return result;
    }
}
