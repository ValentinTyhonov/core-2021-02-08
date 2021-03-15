package com.company.core.lesson11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Start
{
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException
    {
        //1. Class.forName()
        //Class<Device> deviceClass = (Class<Device>) Class.forName("java_core_16.Device.java");
        //2. .getClass()
        /*Device device = new Device();
        Class<Device> deviceClass = (Class<Device>) device.getClass();*/
        //3. .class
        Class<Device> deviceClass = Device.class;
        Device device12 = new Device();
        System.out.println(device12.getClass() == Device.class);

        // витягнути масив імлементованих інтерфейсів класу Device
        System.out.println(Arrays.toString(device12.getClass().getInterfaces()));
        // витягнути батьківський клас для класу Device
        System.out.println(deviceClass.getSuperclass());

        // витягнути масив публічних полів класу Device
        System.out.println(Arrays.toString(deviceClass.getFields()));
        // витягнути масив всіх полів класу Device
        System.out.println(Arrays.toString(deviceClass.getDeclaredFields()));

        // витягнути масив публічних методів класу Device
        System.out.println(Arrays.toString(deviceClass.getMethods()));
        // витягнути масив всіх методів класу Device
        System.out.println(Arrays.toString(deviceClass.getDeclaredMethods()));

        // витягнути масив всіх конструкторів класу Device
        System.out.println(Arrays.toString(deviceClass.getConstructors()));

        // створити новий об'єкт класу Device, не використовуючи конструктор
        Device device = deviceClass.newInstance();
        device.setName("Iphone");
        device.setCount(45);
        device.setId(123456);
        device.setPrice(800);
        //System.out.println(device);
        //System.out.println(device.getTotalPrice());

        // витягнути приватне поле name і змінити його значення в об'єкті device на club
        Field privateField = deviceClass.getDeclaredField("name");
        privateField.setAccessible(true);
        privateField.set(device, "club");

        // перевірити чи поле є публічним
        System.out.println(Modifier.isPublic(privateField.getModifiers()));

        // витягнути protected метод getTotalPrice і викликати його з об'єкту device з параметром null
        Method methodGetTotalPrice = deviceClass.getDeclaredMethod("getTotalPrice", null);
        System.out.println(methodGetTotalPrice.invoke(device, null));

        // витягнути масив публічних внутрішніх класів
        System.out.println(Arrays.toString(Item.class.getClasses()));
        // витягнути масив всіх внутрішніх класів
        System.out.println(Arrays.toString(Item.class.getDeclaredClasses()));


    }
}
