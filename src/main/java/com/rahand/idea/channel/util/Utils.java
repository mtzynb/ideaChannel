package com.rahand.idea.channel.util;

public class Utils {

    public static String[] splitString(String str, String sep) {
        return str.split(sep);
    }

    public static boolean isSubclassOf(final Class<?> clazz, final Class<?> possibleSuperClass) {
        if (clazz == null || possibleSuperClass == null) {
            return false;
        } else if (clazz.equals(possibleSuperClass)) {
            return true;
        } else {
            final boolean isSubclass = isSubclassOf(clazz.getSuperclass(), possibleSuperClass);

            if (!isSubclass && clazz.getInterfaces() != null) {
                for (final Class<?> inter : clazz.getInterfaces()) {
                    if (isSubclassOf(inter, possibleSuperClass)) {
                        return true;
                    }
                }
            }
            return isSubclass;
        }
    }

    public static boolean isSubclassOfClassName(final Class<?> clazz, final String possibleSuperClassName) {
        try {
            Class possibleSuperClazz = Class.forName(possibleSuperClassName);
            return isSubclassOf(clazz, possibleSuperClazz);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("ClassNotFoundException in isClassNameSubclassOf() occurred  " + e.getMessage());
        }
    }
}
