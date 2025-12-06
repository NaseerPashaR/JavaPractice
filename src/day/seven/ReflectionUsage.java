package day.seven;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Naseer Pasha R
 * @version 1.0
 * @since 06-Dec-25
 */
public class ReflectionUsage {
    public static void main(final String[] args) {
        /* Class Loading, Linking and Initialization. */
        final Employee instEmployee = new Employee();

        final Class<? extends Employee> employeeClass = instEmployee.getClass();

        final String className = employeeClass.getName();
        System.out.println("Class Name : " + className); // com.naseer.basics.Employee

        final String canonicalClassName = employeeClass.getCanonicalName();
        System.out.println("Canonical Class Name : " + canonicalClassName); // com.naseer.basics.Employee

        final Annotation[] annotationArray = employeeClass.getDeclaredAnnotations();
        for (final Annotation annotation : annotationArray) {
            System.out.println(annotation.toString());
        }

        final Field[] fieldArray = employeeClass.getDeclaredFields();
        for (final Field field : fieldArray) {
            System.out.println(field.getName()); // employeeName employeeId

        }

        final Method[] methodArray = employeeClass.getDeclaredMethods();
        for (final Method method : methodArray) {
            System.out.println(method.getName()); // getEmployeeName getEmployeeId setEmployeeI setEmployeeName
        }

        final Employee instEmployee2 = new Employee();
        final Class<? extends Employee> employee2Class = instEmployee2.getClass();
        System.out.println("Is object instEmployee==instEmployee2 : " + (instEmployee == instEmployee2)); // false
        System.out.println("Is class employeeClass==employee2Class : " + (employeeClass == employee2Class)); // true
        /*--------------------*/

        /* Class Loader Subsystem */
        // String class is loaded by bootstrap loader, and
        // bootstrap loader is not Java object, hence null
        System.out.println(String.class.getClassLoader()); // null why null? because bootstrap loader is not java object
        // why String.class is bootstrap loader? because it's part of java base module
        System.out.println(Employee.class.getClassLoader()); // jdk.internal.loader.ClassLoaders$AppClassLoader@6e5e91e4
        System.out.println(ReflectionUsage.class.getClassLoader()); // jdk.internal.loader.ClassLoaders$AppClassLoader@6e5e91e4
        /*-------------------------*/

    }
}
